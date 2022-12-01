package web.model;

import org.springframework.stereotype.Component;

@Component

public class Car {
    private String name;
    private String colour;
    private int year;

    public Car() {

    }

    public Car(String name, String colour, int year) {
        this.name = name;
        this.colour = colour;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
