package com.trifulca.OnePieceDB.model.entity;

import com.trifulca.OnePieceDB.model.dto.CharacterClassDTO;
import com.trifulca.OnePieceDB.model.dto.CharacterDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTERS")
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Character {

    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CLASS")
    @ManyToOne()
    private CharacterClass characterClass;

    @Column(name = "HP")
    private Long healthPoints;

    @Column(name = "ATTACK")
    private Long attack;

    @Column(name = "RCV")
    private Long recovery;

    public void fromDto(CharacterDTO dto){
        this.setId(dto.getId());
        this.setName(dto.getName());
        this.setType(dto.getType());
        //TO-DO
        //this.setCharacterClass(dto.getCharacterClass().fromDto());
        this.setHealthPoints(dto.getHealthPoints());
        this.setAttack(dto.getAttack());
        this.setRecovery(dto.getRecovery());
    }

    public CharacterDTO toDto(){
        CharacterDTO dto = new CharacterDTO();
        dto.setId(this.getId());
        dto.setName(this.getName());
        dto.setType(this.getType());
        //TO-DO
        //dto.setCharacterClass(this.getCharacterClass().toDto());
        dto.setHealthPoints(this.getHealthPoints());
        dto.setAttack(this.getAttack());
        dto.setRecovery(this.getRecovery());
        return dto;
    }
}
