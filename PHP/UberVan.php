<?php
require_once("Car.php");
class UberVan extends Car {
    public $typeCardAcepted;
    public $material;
    private $passengenger;

    function __construct($license, $driver, $typeCardAcepted, $material) {
        parent::__construct($license, $driver);
        $this->typeCardAcepted = $typeCardAcepted;
        $this->material = $material;
    }

    public function printDataCar() {
        echo "License Car: {$this->license} and model is: {$this->model} pasenger: {$this->passengenger}<br>";
    }

    public function getPasenger() {
        return $this->passengenger;
    }

    public function setPasenger($passenger) {
        if($passenger == 6){
            $this->passengenger = $passenger;
        } else {
            echo "El valor de Passenger: debe ser seis. <br>";
        }
    }

}