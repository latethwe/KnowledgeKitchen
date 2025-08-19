package com.example.knowledgekitchen;

public class complaints {
    String name = "empty";
    String city = "empty";
    String email = "empty";
    String phone = "empty";
    String question = "empty";
    complaints(){}
    complaints(String name, String city, String email, String phone, String question){
        this.city = city;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.question = question;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCity: " + city + "\nEmail: " + email + "\nPhone: " + phone
                + "\nQuestion: " + question;
    }
}
