<?php
require_once('payment.php');
class Tarjeta extends Payment{
    public $cvv ;
    public $noTarjeta ;
    public $fecha;
    
    public function __construct($id,$cvv,$noTarjeta,$fecha){
       parent::__construct($id);
        $this->cvv = $cvv;
        $this->noTarjeta = $noTarjeta;
        $this->fecha = $fecha;
     
    }
    public function ImprimirPayment(){
        echo "El metodo de pago es Tarjeta en {$this->fecha}";
      }
} ?>