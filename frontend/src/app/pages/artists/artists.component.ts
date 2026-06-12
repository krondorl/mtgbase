/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { Component, ChangeDetectionStrategy, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Artist } from '../../models/artist.model';
import { ArtistService } from '../../services/artist.service';
import { RouterLink } from '@angular/router';
import { AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  imports: [RouterLink, AsyncPipe],
  styleUrls: ['./artists.component.scss'],
  changeDetection: ChangeDetectionStrategy.Eager,
})
export class ArtistsComponent implements OnInit {
  artists!: Observable<Artist[]>;

  constructor(private readonly artistService: ArtistService) {}

  ngOnInit(): void {
    this.artists = this.artistService.getArtists();
  }

  encode(text: string): string {
    return encodeURIComponent(text);
  }
}
