<?php
require_once("personal.php");
class Profesor extends Personal {
    public $materiasDicta;
    public $nivelAcademico;
    function __construct($name, $email, $password, $materiasDicta){
        parent::__construct($name, $email, $password);
        $this->materiasDicta = $materiasDicta;
    }
}