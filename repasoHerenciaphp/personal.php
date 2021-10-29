<?php
class Personal {
    public $name;
    public $email;
    public $password;
    public $age;
    function __construct($name, $email, $password) {
        $this->name = $name;
        $this->email = $email;
        $this->password = $password;
    }

    function printData(){
        echo "My name is {$this->name} and my email is {$this->email}\n";
    }
}