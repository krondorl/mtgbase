package com.burucs.mtgbase.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "legality")
public class Legality extends BaseEntity {
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="card_id", nullable=false)
    private Card card;

    @Column(name = "format_name")
    private String formatName;

    @Column(name = "is_legal")
    private Boolean isLegal;
}
