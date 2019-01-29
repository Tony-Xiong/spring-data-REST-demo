package com.xyz.model.pojo;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Team {
    private String teamName;

    private String teamCode;

}
