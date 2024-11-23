package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private String brand;
    private String description;
    private double averageKmPerLiter;
    private int cylinders;

    // Yeni kurucu
    public GasPoweredCar(String brand, String description, double averageKmPerLiter, int cylinders) {
        super(brand, description); // CarSkeleton kurucusunu çağır
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String starEngine() {
        runEngine(this);
        return getName() + " car starting...";
    }

    @Override
    public String drive() {
        return "run from GasPowered car";
    }
}
