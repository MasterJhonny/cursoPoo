<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
    function getName(){
        echo "the name of Driver is: " . $this->name;
    }
}




