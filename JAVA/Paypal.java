package JAVA;

public class Paypal extends Payment {
String correo;
    public Paypal(Integer id,String correo) {
        super(id);
        this.correo = correo;
        //TODO Auto-generated constructor stub
    }
    public void ImprimirPayment(){

        System.out.println("El metodo de pago es PAYPAL con el correo: "+correo);
    }
}
