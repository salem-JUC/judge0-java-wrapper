package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;

    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Language() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
