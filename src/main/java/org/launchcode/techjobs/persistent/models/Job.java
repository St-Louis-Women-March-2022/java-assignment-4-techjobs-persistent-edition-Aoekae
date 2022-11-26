package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;

    private String skills;

//    private List<Skill> skills

    public Job() {
    }

    public Job(Employer anEmployer, String skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
