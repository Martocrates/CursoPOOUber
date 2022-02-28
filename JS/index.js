var cuenta1 = new Driver(1,"juan","123ad","correo@correo.com","contra");
cuenta1.ImprimirUsuario();
var cuenta1 = new User(1,"juancho","123ad","correo@correo.com","contra");
cuenta1.ImprimirUsuario();

var car = new Car("ASD123",new Account("Maro Herrera","QWERTY123"));
car.passenger = 4;
car.printDataCar();

var uberX = new Car("AMZ123",new Account("ALdo Herrera","QASDFG123"),"Chevrolet","Spark");
uberX.passenger = 4;
uberX.printDataCar();

var pago2 = new Efectivo(3,200,"Noviembre");
pago2.ImprimirPayment();

var pago3 = new Tarjeta(2,123,1445324,"NOVEMBER");
pago3.ImprimirPayment();

var pago1 = new Payment("XD");
pago1.ImprimirPayment();