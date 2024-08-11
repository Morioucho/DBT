package com.morioucho.dbt.controller;

import com.morioucho.dbt.model.DBCharacter;
import com.morioucho.dbt.service.CharacterService;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<DBCharacter>> getAllCharacters(){
        List<DBCharacter> found = characterService.findAll();

        if(found.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DBCharacter> getCharacterByID(@PathVariable Long id){
        DBCharacter foundChar = characterService.findByID(id);

        if(foundChar == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(foundChar, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<DBCharacter> createCharacter(@RequestBody DBCharacter character){
        if(character.getName().isEmpty()){
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        return new ResponseEntity<>(characterService.createCharacter(character), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCharacter(@PathVariable Long id){
        DBCharacter foundCharacter = characterService.findByID(id);

        if(foundCharacter == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("Successfully removed character.", HttpStatus.OK);
    }
}
