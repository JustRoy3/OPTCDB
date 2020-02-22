package com.trifulca.OnePieceDB.service.impl;

import com.trifulca.OnePieceDB.dao.CharacterDAO;
import com.trifulca.OnePieceDB.model.dto.CharacterDTO;
import com.trifulca.OnePieceDB.model.entity.Character;
import com.trifulca.OnePieceDB.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterDAO characterDAO;

    public CharacterDTO getByName(String name){
        return characterDAO.findByName(name).toDto();
    }
}
