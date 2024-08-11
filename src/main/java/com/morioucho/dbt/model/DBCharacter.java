package com.morioucho.dbt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DBCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ElementCollection
    private List<String> feats;

    @ElementCollection
    private List<String> transformations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFeats() {
        return feats;
    }

    public void setFeats(List<String> feats) {
        this.feats = feats;
    }

    public List<String> getTransformations() {
        return transformations;
    }

    public void setTransformations(List<String> transformations) {
        this.transformations = transformations;
    }
}
