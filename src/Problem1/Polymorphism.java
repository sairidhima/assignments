package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String args[]) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add(new Dog());


        for(Pet pet : pets){
            pet.makeSound();
        }

    }
}

