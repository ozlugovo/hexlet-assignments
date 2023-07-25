package exercise;

import java.util.ArrayList;
import java.util.List;

import static exercise.App.buildApartmentsList;

public class Main {
    public static void main (String[] args) {
        List<Home> apartments = new ArrayList<>(List.of(
                new Flat(41, 3, 10),
                new Cottage(125.5, 2),
                new Flat(80, 10, 2),
                new Cottage(150, 3)
        ));

        Home Apar = new Flat(55,5,15);
        System.out.println(buildApartmentsList(apartments, 3));
        System.out.println(Apar);
        System.out.println("Hello");
    }
}
