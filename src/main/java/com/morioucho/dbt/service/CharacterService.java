package com.morioucho.dbt.service;

import com.morioucho.dbt.model.DBCharacter;
import com.morioucho.dbt.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    private CharacterRepository characterRepository;

    public List<DBCharacter> findAll(){
        return characterRepository.findAll();
    }

    public DBCharacter findByID(Long id){
        return characterRepository.findById(id).orElse(null);
    }

    public DBCharacter createCharacter(DBCharacter DBCharacter){
        return characterRepository.save(DBCharacter);
    }

    public void deleteCharacter(Long id){
        characterRepository.deleteById(id);
    }
}
