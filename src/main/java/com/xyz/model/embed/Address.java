package com.xyz.model.embed;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String city;
    private String province;
    private String district;
    private String country;
    private String addr;
}
