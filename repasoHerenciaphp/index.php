<?php
require_once("alumno.php");
$juan = new Alumno("Juan","wer324@gmail.com", "1234", "tecer semestre");
$juan->printData();

$juan->materiasPasa = array(1 => "mate",2 => "Fisica",3 => "Conta",4 => "Literatura",5 => "Programacion");

for($i = 1; $i < sizeof($juan->materiasPasa); $i++) {
    echo "{$juan->materiasPasa[$i]}\n";
}
#echo $i;