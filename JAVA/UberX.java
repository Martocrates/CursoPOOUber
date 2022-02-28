package JAVA;

public class UberX extends Car{

    String brand;
    String model;
    
    public UberX(String license, Account driver,String brand, String model) {
        super(license, driver);
        //TODO Auto-generated constructor stub

        this.brand = brand;
        this.model = model;
    }
    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.name + " Brand: "+brand+" Model: "+model);
    }

}
