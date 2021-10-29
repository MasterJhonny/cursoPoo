<?php
class Car {

    public $id;
    public $license;
    public $driver;
    private $passengenger;

    public function __construct($lic, $dri) {
        $this->license = $lic;
        $this->driver = $dri;
        $this->passengenger = null;
    }

    public function printDataCar() {
        echo "License Car: {$this->license} and model is: {$this->model} pasenger: {$this->passengenger}<br>";
    }

    public function getPasenger() {
        return $this->passengenger;
    }

    public function setPasenger($passenger) {
        if($passenger == 4){
            $this->passengenger = $passenger;
        } else {
            echo "El valor de Passenger: debe ser cuatro.<br>";
        }
    }
}

