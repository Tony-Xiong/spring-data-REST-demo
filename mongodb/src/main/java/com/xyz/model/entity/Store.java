package com.xyz.model.entity;

import com.xyz.model.embed.Address;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    private Address address;
    private String name;
    private String type;

}
