from car import Car
from account import Account

if __name__ == "__main__":
    print("hola Mundo") 

    car = Car("MSD532", Account("Andres Herrera", "k345j4k5"))

    print(vars(car))
    car.driver.saludar()