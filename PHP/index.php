<?php
require_once('Car.php');
require_once('Driver.php');
require_once('UberX.php');
require_once('UberVan.php');

$car = new Car("FDGH", new Driver("Freddy Mamani", "ERTY3456"));

$UberX = new UberX("ASD345", new Driver("Frederic Taylor", "ADS546565"), "Toyota", "2021");

// $UberX->setPasenger(4);
// $UberX->printDataCar();


echo "hola Mundo<br>";
$UberVan = new UberVan("QWER1234", new Driver("Andrea Herrera", "ASDF1234"), "DOYTE", "2020");

$UberVan->setPasenger(6);
$UberVan->printDataCar();
echo $UberVan->getPasenger();



