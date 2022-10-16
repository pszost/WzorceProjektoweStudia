package pl.edu.wszib.lab1.builder;

public class Female {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;

    private final Integer height;

    private final Integer eyeColor;

    private Female(final String firstName,
                   final String lastName,
                   final Integer age,
                   final Gender gender,
                   final Address address, Integer height, Integer eyeColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.height = height;
        this.eyeColor = eyeColor;
    }
}
