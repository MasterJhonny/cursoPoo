<?php
require_once("Car.php");
class UberBlack extends Car {
    public $typeCardAcepted;
    public $material;

    function __construct($license, $driver, $typeCardAcepted, $material) {
        parent::__construct($license, $driver);
        $this->typeCardAcepted = $typeCardAcepted;
        $this->material = $material;
    }
}