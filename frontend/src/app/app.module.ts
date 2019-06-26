import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {
  MatButtonModule,
  MatCardModule,
  MatIconModule,
  MatListModule,
  MatPaginatorModule,
  MatProgressBarModule,
  MatSidenavModule,
  MatSortModule,
  MatTableModule,
  MatToolbarModule,
  MatTooltipModule
} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {TorneioListComponent} from './torneio/torneio-list/torneio-list.component';
import {TorneioCreateComponent} from './torneio/torneio-create/torneio-create.component';
import {HttpClientModule} from '@angular/common/http';
import {ApiModule, Configuration} from './api-client';

@NgModule({
  declarations: [
    AppComponent,
    TorneioListComponent,
    TorneioCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,

    BrowserAnimationsModule,

    MatSidenavModule,
    MatButtonModule,
    MatCardModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatTooltipModule,
    MatTableModule,
    MatProgressBarModule,
    MatPaginatorModule,
    MatSortModule,

    ApiModule.forRoot(() => {
      return new Configuration();
    })

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
