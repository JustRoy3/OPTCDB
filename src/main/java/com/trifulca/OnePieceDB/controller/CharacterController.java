package com.trifulca.OnePieceDB.controller;

import com.trifulca.OnePieceDB.client.CharacterClient;
import com.trifulca.OnePieceDB.model.dto.CharacterDTO;
import com.trifulca.OnePieceDB.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CharacterController implements CharacterClient {

    @Autowired
    private CharacterService service;

    @Override
    @GetMapping(value = "/characters/getByName", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CharacterDTO getCharacterByName(String name) {
        return service.getByName(name);
    }
}
