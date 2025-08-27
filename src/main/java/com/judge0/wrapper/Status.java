package com.judge0.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    @JsonProperty("id")
    private int id;
    @JsonProperty("description")
    private String descriptionMohammed;

    public Status(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public Status(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
