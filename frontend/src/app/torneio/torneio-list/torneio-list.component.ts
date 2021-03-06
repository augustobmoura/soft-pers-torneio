import {HttpClient} from '@angular/common/http';
import {AfterViewInit, Component, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {merge, of as observableOf} from 'rxjs';
import {catchError, map, startWith, switchMap} from 'rxjs/operators';
import {TorneioControllerService, TorneioDTO} from "../../api-client";

@Component({
  selector: 'app-torneio-list',
  templateUrl: './torneio-list.component.html',
  styleUrls: ['./torneio-list.component.scss']
})
export class TorneioListComponent implements AfterViewInit {
  displayedColumns: string[] = ['date', 'description'];
  data: TorneioDTO[] = [];

  resultsLength = 0;
  isLoadingResults = true;
  isRateLimitReached = false;

  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;

  constructor(private _httpClient: HttpClient, private _torneioControllerService: TorneioControllerService) {
  }

  ngAfterViewInit() {
    this._torneioControllerService.getTorneiosUsingGET().toPromise().then((a) => {
      console.log(a);
    });

    // If the user changes the sort order, reset back to the first page.
    this.sort.sortChange.subscribe(() => this.paginator.pageIndex = 0);

    merge(this.sort.sortChange, this.paginator.page)
      .pipe(
        startWith({}),
        switchMap(() => {
          this.isLoadingResults = true;
          return this._torneioControllerService.getTorneiosUsingGET();
        }),
        map(data => {
          // Flip flag to show that loading has finished.
          this.isLoadingResults = false;
          this.isRateLimitReached = false;
          this.resultsLength = 100;

          return data.torneios;
        }),
        catchError(() => {
          this.isLoadingResults = false;
          // Catch if the GitHub API has reached its rate limit. Return empty data.
          this.isRateLimitReached = true;
          return observableOf([]);
        })
      ).subscribe(data => this.data = data);
  }
}
