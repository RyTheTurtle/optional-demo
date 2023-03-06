package com.rytheturtle.demo.optional.user.address;

import java.util.List; 

public class Address {
    private StreetAddress street;
    private StateAddress state; 

    public StreetAddress getStreet() {
        return this.street;
    }

    public void setStreet(StreetAddress street) {
        this.street = street;
    }

    public StateAddress getState() {
        return this.state;
    }

    public void setState(StateAddress state) {
        this.state = state;
    }
    
}
