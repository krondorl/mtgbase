import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './pages/welcome/welcome.component';
import { CardComponent } from './pages/card/card.component';
import { CardsComponent } from './pages/cards/cards.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { DisplayLegalityComponent } from './components/display-legality/display-legality.component';
import { ArtistsComponent } from './pages/artists/artists.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    CardComponent,
    CardsComponent,
    HeaderComponent,
    FooterComponent,
    DisplayLegalityComponent,
    ArtistsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
