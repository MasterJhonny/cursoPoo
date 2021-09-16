<?php
require_once('Car.php');
require_once('Account.php');
require_once('UberX');

$UberX = new UberX("ASD345", new Account("Frederic Taylor", "ADS546565"), "Toyota", "2021");

$car->printDataCar();


$UberPoll = new UberPoll("AS4566", new Account("Andrea Herrera", "ASDF546565"), "DOYTE", "Acrfg");

$UberPoll->printDataCar();

