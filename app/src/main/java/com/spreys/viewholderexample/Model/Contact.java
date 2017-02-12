package com.spreys.viewholderexample.Model;

public class Contact {
    private String firstName;
    private String lastName;
    private String mobile;
    private String landline;

    public Contact(String firstName, String lastName, String mobile, String landline) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.landline = landline;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLandline() {
        return landline;
    }

    public String getName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
}
