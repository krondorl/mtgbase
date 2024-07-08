/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.service;

import com.burucs.mtgbase.dto.ArtistDto;
import com.burucs.mtgbase.model.Artist;
import com.burucs.mtgbase.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {
    private ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<ArtistDto> getArtists() {
        List<ArtistDto> artistDtos = new ArrayList<>();
        this.artistRepository.findAll().forEach(artist -> artistDtos.add(convertEntityToDto(artist)));
        return artistDtos;
    }

    private ArtistDto convertEntityToDto(Artist artist) {
        ArtistDto artistDto = new ArtistDto();

        artistDto.setId(artist.getId());
        artistDto.setArtistName(artist.getArtistName());

        return artistDto;
    }
}
