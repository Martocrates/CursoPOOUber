<?php
require_once('car.php');
class UberX extends Car{
    public $brand;
    public $model;
    public function __construct($license,$driver,$brand,$model){
       parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }
    public function PrintDataCar(){
        echo "La licencia es: $this->license, conductor: {$this->driver->name}, documento: {$this->driver->document}
        Modelo: {$this->model} Marca: {$this->brand}";
      }
} ?>