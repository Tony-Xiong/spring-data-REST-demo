package com.xyz.model.entity;

import com.xyz.model.embed.Team;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Saler implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private Team team;
    private Integer stars;
    private Integer age;
    private String education;
    private String gender;
    private String company;
}
