package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {
            Person person = new Person.Builder()
                    .firstname()
                    .lastName()
                    .gender()
                    .sex()
                    .adres()
                    .age()
                    .build();
    }
}
