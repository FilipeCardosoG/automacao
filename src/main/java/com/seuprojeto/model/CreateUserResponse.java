package com.seuprojeto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResponse {

    @JsonProperty("name")
    private String differentFieldName;
    private String name;
    private String job;
    private String id;
    private String createdAt;

    // getters e setters

    // Construtor padrão
    public CreateUserResponse() {
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object statusCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'statusCode'");
    }
}
