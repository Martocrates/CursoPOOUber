<?php
require_once('account.php');
class User extends Account{
 
    public function __construct($id,$name,$document,$email,$password){
       parent::__construct($id,$name,$document,$email,$password);
       
    }
    public function PrintDataUser(){
        echo "El usuari es: normal";
    }
}?>