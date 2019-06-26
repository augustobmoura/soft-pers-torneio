import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {TorneioListComponent} from "./torneio/torneio-list/torneio-list.component";
import {TorneioCreateComponent} from "./torneio/torneio-create/torneio-create.component";

const routes: Routes = [
  {
    path: '',
    component: TorneioListComponent,
  },
  {
    path: 'torneio/create',
    component: TorneioCreateComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
