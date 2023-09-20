package com.burucs.mtgbase.service;

import com.burucs.mtgbase.dto.CardDto;
import com.burucs.mtgbase.model.Card;
import com.burucs.mtgbase.repository.ArtistRepository;
import com.burucs.mtgbase.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    private ArtistRepository artistRepository;
    private CardRepository cardRepository;

    public CardService(
        CardRepository cardRepository,
        ArtistRepository artistRepository) {
        this.cardRepository = cardRepository;
        this.artistRepository = artistRepository;
    }

    public CardDto getCard(Long id) {
        CardDto cardDto = new CardDto();
        Optional<Card> card = this.cardRepository.findById(id);

        if (card.isPresent()) {
            cardDto = convertDetailedEntityToDto(card.get());
        }

        return cardDto;
    }

    public List<CardDto> getCards() {
        List<CardDto> cardDtos = new ArrayList<>();
        this.cardRepository.findAll().forEach(card -> cardDtos.add(convertEntityToDto(card)));
        return cardDtos;
    }

    public List<CardDto> getCardsByArtist(String artistName) {
        String decodedName = URLDecoder.decode(artistName, StandardCharsets.UTF_8);
        List<CardDto> cardDtos = new ArrayList<>();
        this.cardRepository.findByArtistName(decodedName).forEach(card -> cardDtos.add(convertEntityToDto(card)));
        return cardDtos;
    }

    private CardDto convertEntityToDto(Card card) {
        CardDto cardDto = new CardDto();

        cardDto.setId(card.getId());
        cardDto.setName(card.getName());
        cardDto.setImageName(card.getImageName());
        cardDto.setManaCost(card.getManaCost());
        cardDto.setTypeLine(card.getTypeLine());
        cardDto.setDescription(card.getDescription());
        cardDto.setFlavour(card.getFlavour());
        cardDto.setStats(card.getStats());
        cardDto.setArtist(card.getArtist());
        cardDto.setSetName(card.getSetName());
        cardDto.setSetCode(card.getSetCode());
        cardDto.setSerialNumber(card.getSerialNumber());
        cardDto.setRarity(card.getRarity());

        return cardDto;
    }

    private CardDto convertDetailedEntityToDto(Card detailedCard) {
        CardDto cardDto = new CardDto();

        cardDto.setId(detailedCard.getId());
        cardDto.setName(detailedCard.getName());
        cardDto.setImageName(detailedCard.getImageName());
        cardDto.setManaCost(detailedCard.getManaCost());
        cardDto.setTypeLine(detailedCard.getTypeLine());
        cardDto.setDescription(detailedCard.getDescription());
        cardDto.setFlavour(detailedCard.getFlavour());
        cardDto.setStats(detailedCard.getStats());
        cardDto.setArtist(detailedCard.getArtist());
        cardDto.setSetName(detailedCard.getSetName());
        cardDto.setSetCode(detailedCard.getSetCode());
        cardDto.setSerialNumber(detailedCard.getSerialNumber());
        cardDto.setRarity(detailedCard.getRarity());

        cardDto.setLegality(detailedCard.getLegality());
        cardDto.setRules(detailedCard.getRules());

        return cardDto;
    }
}
