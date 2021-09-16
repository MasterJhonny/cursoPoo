<?php
class Car {

    public $id;
    public $license;
    public $driver;
    public $passengenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->model = $model;
    }

    public function printDataCar() {
        echo "License Car:  $this->license, driver name: {$this->driver->name}"
    }
}

