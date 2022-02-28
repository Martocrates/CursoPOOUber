package JAVA;

public class Efectivo extends Payment {

    float pago;
    String fechaTransaccion;
    public Efectivo(Integer id,float pago,String fechaTransaccion) {
        super(id);
        this.pago = pago;
        this.fechaTransaccion = fechaTransaccion;
        //TODO Auto-generated constructor stub

    }
    public void ImprimirPayment(){

        System.out.println("El metodo de pago es Efectivo con un total de "+pago+"$");
    }
    
}
