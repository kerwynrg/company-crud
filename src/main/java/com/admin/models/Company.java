package com.admin.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Company {

    @Id private String id;

    private String name;
    private String address;
    private String city;
    private String country;
    private String email;
    private String phone;
    private String[] owners;

    @Override
    public String toString() {
        return this.name + "|" + this.address + "|" + this.city + "|" + this.country;
    }
}
