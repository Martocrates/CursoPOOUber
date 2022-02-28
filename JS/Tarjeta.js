class Tarjeta extends Payment{
    constructor(id,cvv,tarjetaNo,fecha){
        super(id)
        this.cvv = cvv;
        this.tarjetaNo = tarjetaNo;
        this.fecha = fecha;
    }
    ImprimirPayment(){

        console.log("El metodo de pago es con Tarjeta en"+fecha);
    }
}