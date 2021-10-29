from account import Account

class Car:
    id = int
    license = str
    driver = Account("", "")
    passegenger = int
    def __init__(self,license, driver):
        self.license = license
        self.driver = driver
    def getPasengers(self):
        return self.passegenger
    def setPasengers(self, pasenger):
        if(pasenger == 4):
            self.passegenger = pasenger
        else:
            print("passeger debe ser igual a cuatro!")
