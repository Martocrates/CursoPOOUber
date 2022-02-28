package JAVA;
import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
   String name;
   String model;

    private Integer passegenger;
    public UberVan(String license,
                    Account driver,
                    String name,String model) {
        super(license, driver);
                    this.name = name;
                    this.model = model;
        //TODO Auto-generated constructor stub
    }
                         /*POLIMORFISMO*/
    @Override
    Integer getPassegenger(){
        return passegenger;
    }
    @Override
    void setPassegenger(Integer passegenger){
        if(passegenger !=4){
            System.out.println("Necesitan ser 4 pasajeros");
        }else if (passegenger==4){
            this.passegenger = passegenger;
        }
    
    }
    @Override
    void printDataCar(){
        System.out.println("TIPO: VAN"+"License: " + license + " Driver: " + driver.name+ "Passegenger :"+passegenger);
    }
}
