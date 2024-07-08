/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.dto;

import com.burucs.mtgbase.model.Legality;
import com.burucs.mtgbase.model.Rule;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class CardDto {
    private Long id;
    private String name;
    private String imageName;
    private String manaCost;
    private String typeLine;
    private String description;
    private String flavour;
    private String stats;
    private String artist;
    private String setName;
    private String setCode;
    private Short serialNumber;
    private String rarity;
    private Set<Legality> legality;
    private Set<Rule> rules;
}
