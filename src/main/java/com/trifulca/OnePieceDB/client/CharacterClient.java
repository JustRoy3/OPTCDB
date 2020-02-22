package com.trifulca.OnePieceDB.client;

import com.trifulca.OnePieceDB.model.dto.CharacterDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public interface CharacterClient {

    @GetMapping(value = "/characters/getByName", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    CharacterDTO getCharacterByName(@RequestParam String name);


}
