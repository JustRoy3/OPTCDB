package com.trifulca.OnePieceDB.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSES")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterClass {

    @Column(name = "PRIMARY")
    private String primaryClass;

    @Column(name = "SECONDARY")
    private String secondaryClass;
}
