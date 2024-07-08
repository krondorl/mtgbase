/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.controller;

import com.burucs.mtgbase.dto.ArtistDto;
import com.burucs.mtgbase.service.ArtistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/api/artists")
    public List<ArtistDto> getCards() {
        return this.artistService.getArtists();
    }
}
