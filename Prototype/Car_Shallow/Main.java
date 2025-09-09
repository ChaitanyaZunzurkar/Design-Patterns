package Prototype.Car_Shallow;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car baseCar = new Car("BMW", "DF5",  new ArrayList<>(Arrays.asList("Engine" , "Wheel")));

        Car car1 = baseCar.clone();
        car1.setBrand("BMW");
        car1.setModel("DF19");
        car1.addFeature("Electric");
        
        Car car2 = baseCar.clone();
        car2.setBrand("F1");
        car2.setModel("F123");
        car2.addFeature("3000cc");

        System.out.println("This is base class : " + baseCar);
        System.out.println("This is first copy of the car : " + car1);
        System.out.println("This is Car 2nd : " + car2);
    }
}
