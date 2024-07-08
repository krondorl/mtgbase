/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "cards")
public class Card extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "mana_cost")
    private String manaCost;

    @Column(name = "type_line")
    private String typeLine;

    @Column(name = "description")
    private String description;

    @Column(name = "flavour")
    private String flavour;

    @Column(name = "stats")
    private String stats;

    @Column(name = "artist")
    private String artist;

    @Column(name = "set_name")
    private String setName;

    @Column(name = "set_code")
    private String setCode;

    @Column(name = "serial_number")
    private Short serialNumber;

    @Column(name = "rarity")
    private String rarity;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "card")
    private Set<Legality> legality = new HashSet<>();

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "card")
    private Set<Rule> rules = new HashSet<>();
}
