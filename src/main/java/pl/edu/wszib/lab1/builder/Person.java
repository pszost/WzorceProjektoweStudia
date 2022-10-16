package pl.edu.wszib.lab1.builder;

public class Person {

    String  firstname;

    String lastname;

    String sex;

    String city;

    String address;

    String houseNumber;

    String postalCode;

    int age;
    private Person(String firstname, String lastname, String sex, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;

    }

    public address(String city, String address, String houseNumber, string postalCode){
            this.city  = city;
            this.address = address;
            this.houseNumber = houseNumber;
            this.postalCode = postalCode;


    }
    public static class Builder {
        public Person build(){
            return new Person();
        }

    }
}
