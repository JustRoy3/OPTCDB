package com.trifulca.OnePieceDB.dao;

import com.trifulca.OnePieceDB.model.entity.Character;

public interface CharacterDAO {

    Character findByName(String name);
}
