package com.rytheturtle.demo.optional.user;

import com.rytheturtle.demo.optional.user.address.Address;

public class User {
    private UserName userName; 
    private Address  address;
    private PhoneNumber phoneNumber; 

    public UserName getUserName() {
        return this.userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
}
