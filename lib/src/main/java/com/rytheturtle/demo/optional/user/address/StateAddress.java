package com.rytheturtle.demo.optional.user.address;

public class StateAddress {
    private String city;
    private String state;
    private PostalCode postalCode; 

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PostalCode getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }


}
