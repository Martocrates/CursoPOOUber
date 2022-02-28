class Efectivo extends Payment{
    constructor(id,efectivo,fecha){
        super(id)
        this.efectivo = efectivo;
        this.fecha = fecha;
    }
    ImprimirPayment(){

        console.log("El metodo de pago es Efectivo con un total de "+this.efectivo);
    }
}