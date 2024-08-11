package com.morioucho.dbt.repository;

import com.morioucho.dbt.model.DBCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<DBCharacter, Long> {
}
