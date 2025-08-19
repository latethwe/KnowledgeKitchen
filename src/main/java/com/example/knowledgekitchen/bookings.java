package com.example.knowledgekitchen;



public class bookings {
    String name = "empty";
    String surname = "empty";
    String email = "empty";
    String phone = "empty";
    int size = 0;
    String date = "empty";
    String time = "empty";
    String spec = "empty";
    bookings(){}
    bookings(String name, String surname, String email, String phone, String date, String time, int size, String spec){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.size = size;
        this.time = time;
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nEmail: " + email + "\nPhone: " + phone
                + "\nDate: " + date + " " + time + "\nSize: " + size
                + "\nSpecial requests: " + spec;
    }
}
