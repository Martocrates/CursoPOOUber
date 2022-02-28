<?php
require_once('payment.php');
class Efectivo extends Payment{

    public $fecha;
    
    public function __construct($id,$fecha){
       parent::__construct($id);
        $this->fecha = $fecha;
        
    }
    public function ImprimirPayment(){
        echo "El metodo de pago es Efectivo en {$this->fecha}";
      }
} ?>