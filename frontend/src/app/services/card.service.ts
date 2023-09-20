import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Card } from '../models/card.model';

@Injectable({
  providedIn: 'root'
})
export class CardService {

  constructor(private httpClient: HttpClient) { }

  getCards(): Observable<Card[]> {
    return this.httpClient.get<Card[]>(`/api/cards`).pipe();
  }

  getCard(id: number): Observable<Card> {
    return this.httpClient.get<Card>(`/api/card?id=${id}`).pipe();
  }

  getCardsByArtistName(artistName: string): Observable<Card[]> {
    return this.httpClient.get<Card[]>(`/api/cards/?artistName=${artistName}`).pipe();
  }
}
