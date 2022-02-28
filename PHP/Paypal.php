<?php
require_once('payment.php');
class Paypal extends Payment{
    public $correo ;
    
    public function __construct($id,$correo){
       parent::__construct($id);
        $this->correo = $correo;
    
     
    }
    public function ImprimirPayment(){
        echo "El metodo de pago es Paypal y pago: {$this->correo}";
      }
} ?>