package JAVA;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car van = new UberVan("RTX123", new Account(3,"Andro","ADRO376","micorreo@correo.com","contrsa2313"), "brand", "model");
        van.setPassegenger(4);
        van.printDataCar();

        Car car = new Car("AMQ123", new Account(1,"Andres Herrera","AND123","correo@correo.com","password123"));
        car.setPassegenger(4);
        car.printDataCar(); 

        Car car2 = new Car("QWERTY", new Account(2,"Andrea Herrera","ANDA876","otro@correo.com","Contra123"));
        car2.setPassegenger(4);
        car2.printDataCar();

        Car car3 = new UberX("RTX123", new Account(3,"Andro","ADRO376","micorreo@correo.com","contrsa2313"), "brand", "model");
        car3.setPassegenger(4);
        car3.printDataCar();

        Payment pago1 = new Payment(1);
        pago1.ImprimirPayment();

        Payment pago2 = new Tarjeta(2, "Noviembre", 123452341, 543);
        pago2.ImprimirPayment();

        Payment pago3 = new Paypal(2, "correo@correo.com");
        pago3.ImprimirPayment();

        Account usuario1 = new User(1,"Marto","N/A","correo@correo.com","pasword");
        usuario1.ImprimirUsuario();

        Account driver1 = new Driver(1,"Marto","N/A","correo@correo.com","pasword");
        driver1.ImprimirUsuario();

    }
}
