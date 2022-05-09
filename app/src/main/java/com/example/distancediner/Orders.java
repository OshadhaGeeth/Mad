package com.example.distancediner;

public class Orders {
    String name;
    String contact;
    String address;
    String parcels;

    public Orders(String name, String contact, String address, String parcels) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.parcels = parcels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParcels() {
        return parcels;
    }

    public void setParcels(String parcels) {
        this.parcels = parcels;
    }
}