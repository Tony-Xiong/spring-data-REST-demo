package com.xyz.model.entity;

import com.xyz.model.embed.Address;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;

    private String name;

    private Integer age;

    private String phone;

    private Address address;

    private String gender;

    private String remark;
}
