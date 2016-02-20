package com.admin.models;

import org.springframework.data.annotation.Id;

public class Company {

    @Id private String id;

    private String name;
    private String address;
    private String city;
    private String country;
    private String email;
    private String phone;
    private String[] owners;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String[] getOwners() {
        return this.owners;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] setOwners(String[] owners) {
        return this.owners = owners;
    }

    @Override
    public String toString() {
        return this.getName() + "|" + this.getAddress() + "|" + this.getCity() + "|" + this.getCountry();
    }
}
