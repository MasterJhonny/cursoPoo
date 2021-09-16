<?php
require_once("Car.php");
class UberPull extends Car {
    public $brand;
    public $model;

    function __construct($license, $driver, $brand, $model) {
        parent::__construct($license, $driver);
        this->model = $model;
        this->brand = $brand;
    }

}