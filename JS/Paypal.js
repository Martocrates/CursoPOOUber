class Paypal extends Payment{
    constructor(id,correo){
        super(id)
        this.correo = correo;

    }
    ImprimirPayment(){

        console.log("El metodo de pago es con Paypal con el correo: "+correo);
    }
}