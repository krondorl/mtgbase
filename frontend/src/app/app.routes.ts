// app.routes.ts

import { Routes } from '@angular/router';
import { CardComponent } from './pages/card/card.component';
import { CardsComponent } from './pages/cards/cards.component';
import { ArtistsComponent } from './pages/artists/artists.component';
import { WelcomeComponent } from './pages/welcome/welcome.component';

export const routes: Routes = [
  { path: 'card/:id', component: CardComponent },
  { path: 'cards', component: CardsComponent },
  { path: 'cards/artist/:name', component: CardsComponent },
  { path: 'artists', component: ArtistsComponent },
  { path: '', component: WelcomeComponent },
  { path: '**', component: WelcomeComponent },
];
