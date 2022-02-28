<?php
class Payment {
public $id;

public function __construct($id) {
    $this->id = $id;
   
  }

  public function ImprimirPayment(){
    echo "El metodo de pago es indefinido";
  }
}

