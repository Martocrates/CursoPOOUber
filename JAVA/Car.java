package JAVA;

public class Car {
    Integer id;
    String license;
    Account driver;
   private Integer passegenger;

public Car(String license,Account driver){
    this.license=license;
    this.driver = driver;

}
    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.name);
    }
    Integer getPassegenger(){
        return passegenger;
    }
    void setPassegenger(Integer passegenger){
this.passegenger = passegenger;
    }
}

