package org.example.arge;

public class HybridCar extends CarSkeleton {

    private String brand;
    private String description;
    private double avgKmPerLiter;  // avgKmPerLiter double olarak kalmalı
    private int batterySize;
    private int cylinders;

    // Yeni kurucu
    public HybridCar(String brand, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(brand, description); // CarSkeleton kurucusunu çağır
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;  // avgKmPerLiter doğru şekilde döndürülüyor
    }

    public int getBatterySize() {
        return batterySize;  // Hata düzeltildi: avgKmPerLiter yerine batterySize döndürülmeli
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
        return "run from Hybrid car";
    }
}
