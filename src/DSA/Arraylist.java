package DSA;
// Dynamic Array
// manipulation is slow because of bits are shifted in memory
// it is better for storing data and accessing data

import java.util.ArrayList;
import java.util.Collections;

public class   Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("MG Hector");
        cars.add("Alto");
        cars.add("Discovery");
        cars.add("Fortuner");
        cars.add("Swift");
        System.out.println(cars+" ");

        cars.add(2,"Ferrari");
        System.out.println(cars+" ");
        System.out.println(cars.get(4));
        cars.remove(4);
        System.out.println(cars+" ");
        Collections.sort(cars);
        System.out.println(cars);

    }
}
