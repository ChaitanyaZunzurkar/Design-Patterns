package Prototype.Car_Shallow;

import java.util.ArrayList;

public class Car implements CarPrototype{
    private String brand;
    private String model;
    private ArrayList<String> features = new ArrayList<String>();

    public Car(String brand , String model , ArrayList<String> features) {
        this.brand = brand;
        this.model = model;
        this.features = features;
    }

    public void getBrand() {
        System.out.println("Brand Name : " + brand);
    }

    public void getModel() {
        System.out.println("Model : " + model);
    }

    public void getFeatures() {
        System.out.println("Features : ");
        for(String x : features) {
            System.out.println(x);
        }
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car addFeature(String newFeature) {
        features.add(newFeature);
        return this;
    }

    public Car removeFeature(String feature) {
        features.remove(feature);
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", features=" + features +
                '}';
    }

    @Override 
    public Car clone() {
        return new Car(this.brand , this.model , this.features);
    }
}
