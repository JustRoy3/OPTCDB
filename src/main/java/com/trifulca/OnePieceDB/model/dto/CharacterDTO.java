package com.trifulca.OnePieceDB.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDTO {

   private Long id;

   @JsonProperty("NAME")
   private String name;

   @JsonProperty("TYPE")
   private String type;

   @JsonProperty("CLASS")
   private CharacterClassDTO characterClass;

   @JsonProperty("HP")
   private Long healthPoints;

   @JsonProperty("ATTACK")
   private Long attack;

   @JsonProperty("RCV")
   private Long recovery;

}
