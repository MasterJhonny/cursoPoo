<?php
require_once("Car.php");
class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $bra, $mod) {
        parent::__construct($license, $driver);
        $this->brand = $bra;
        $this->model = $mod;
    }
}