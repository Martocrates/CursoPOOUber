<?php

require_once('Car.php');
require_once('Account.php');
require_once('User.php');
require_once('Driver.php');
require_once('UberX.php');
require_once('UberPool.php');

require_once('Payment.php');
require_once('Tarjeta.php');
require_once('Paypal.php');
require_once('Efectivo.php');

$usuario1 = new User(1,"Ferrero herrera","ASD123","Email@email.com","pasword123");
$usuario1 ->usuario1.PrintDataUser();

$driver1 = new Driver(1,"Ferrero herrera","ASD123","Email@email.com","pasword123");
$driver1 ->driver1.PrintDataUser();

$uberX = new UberX("CV1231",new Account(2,"Andres herrera","AND123","otro@gmail.com","contra123"),"Chevrolet","Spark");
$uberX->printDataCar();

$uberPool = new UberPool("ASD123",new Account(1,"Ferrero herrera","ASD123","Email@email.com","pasword123"),"Dodge","Challenger");
$uberPool->printDataCar();



$pago1 = new Tarjeta(1,123,54645654,"DICIEMBRE");
$pago1 ->ImprimirPayment();

$pago2 = new Paypal(1,"correo@correo.com");
$pago2 ->ImprimirPayment();

$pago3 = new Efectivo(1,"OCTUVE Y NOVIEMBRE");
$pago3 ->ImprimirPayment();