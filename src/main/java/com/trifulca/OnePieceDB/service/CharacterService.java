package com.trifulca.OnePieceDB.service;

import com.trifulca.OnePieceDB.model.dto.CharacterDTO;

public interface CharacterService {

    CharacterDTO getByName(String name);
}
