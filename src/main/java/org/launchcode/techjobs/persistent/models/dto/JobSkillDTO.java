package org.launchcode.techjobs.persistent.models.dto;

import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;

import javax.validation.constraints.NotNull;

public class JobSkillDTO {
    @NotNull
    private Job job;

    @NotNull
    private Skill skills;

    public JobSkillDTO() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }
}
