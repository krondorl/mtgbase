/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.controller;

import com.burucs.mtgbase.dto.CardDto;
import com.burucs.mtgbase.service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {
    private final CardService cardService;
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/api/cards")
    public List<CardDto> getCards() {
        return this.cardService.getCards();
    }

    @GetMapping("/api/cards/")
    public List<CardDto> getCardsByArtist(@RequestParam String artistName) {
        return this.cardService.getCardsByArtist(artistName);
    }

    @GetMapping("/api/card")
    public CardDto getCard(@RequestParam Long id) {
        return this.cardService.getCard(id);
    }
}
