package com.trifulca.OnePieceDB.dao.impl;

import com.trifulca.OnePieceDB.dao.CharacterDAO;
import com.trifulca.OnePieceDB.model.entity.Character;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterDAOImpl implements CharacterDAO {

    @Override
    public Character findByName(String name){
        return null;
    }
}
