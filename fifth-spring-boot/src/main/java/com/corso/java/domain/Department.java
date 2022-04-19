package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Department {

    @Id
    private String Id;

    private String name;
    private String description;

    public Department() {
    }

    public Department(String id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
    }

    public Department(String name, List<Student> students) {
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
