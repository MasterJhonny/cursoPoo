<?php
require_once("personal.php");
class Alumno extends Personal {
    public $semestre;
    public $materiasPasa;
    function __construct($name, $email, $password, $semestre){
        parent::__construct($name, $email, $password, $semest);
        $this->semestre = $semestre;
        $this->materiasPasa = null;
    }
}