package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(max = 500)
    private String description;

//    @JoinColumn
//    private final List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}