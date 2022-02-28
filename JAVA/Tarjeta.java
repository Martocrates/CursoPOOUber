package JAVA;

public class Tarjeta extends Payment{
    Integer noTarjeta;
    Integer cvv;
    String fecha;
    
    public Tarjeta(Integer id,String fecha,Integer noTarjeta,Integer cvv){
        super(id);
        this.fecha = fecha;
        this.noTarjeta = noTarjeta;
        this.cvv = cvv;

    }
    public void ImprimirPayment(){

        System.out.println("El metodo de pago es TARJETA");
    }
    
}
