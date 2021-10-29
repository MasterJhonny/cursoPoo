<?php
require_once("personal.php");
class Ayudante extends Personal {
    public $materiasDicta;
    public $semestre;
    function __construct($name, $email, $password, $semestre){
        parent::__construct($name, $email, $password, $semest);
        $this->semestre = $semestre;
    }
}