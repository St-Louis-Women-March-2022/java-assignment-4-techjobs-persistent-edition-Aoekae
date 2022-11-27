package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 80)
    private String location;

    @OneToMany
    @JoinColumn (name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
