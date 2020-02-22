package com.trifulca.OnePieceDB.service;

import com.trifulca.OnePieceDB.dao.CharacterDAO;
import com.trifulca.OnePieceDB.model.dto.CharacterDTO;
import com.trifulca.OnePieceDB.model.entity.Character;
import com.trifulca.OnePieceDB.service.impl.CharacterServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class CharacterServiceTest {

    @Mock
    private CharacterDAO dao;

    @InjectMocks
    private CharacterServiceImpl service;

    @Test
    public void testGetByName(){
        MockitoAnnotations.initMocks(this);
        Mockito.when(dao.findByName(Mockito.anyString()))
                .thenReturn(new Character().builder().id(1L).name("test").attack(12L).healthPoints(100L).recovery(50L).type("testType").build());
        CharacterDTO response = service.getByName("test");
        assertThat(response.getId()).isEqualTo(1L);
        assertThat(response.getName()).isEqualTo("test");

    }
}
