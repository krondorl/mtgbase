/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { Card } from '../models/card.model';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class CardService {
  constructor(private httpClient: HttpClient) {}

  getCards(): Observable<Card[]> {
    return this.httpClient.get<Card[]>(`/api/cards`).pipe();
  }

  getCard(id: number): Observable<Card> {
    return this.httpClient.get<Card>(`/api/card?id=${id}`).pipe(
      catchError((error) => {
        console.error('HTTP Error:', error);
        return throwError(() => error);
      })
    );
  }

  getCardsByArtistName(artistName: string): Observable<Card[]> {
    return this.httpClient
      .get<Card[]>(`/api/cards/?artistName=${artistName}`)
      .pipe();
  }
}
