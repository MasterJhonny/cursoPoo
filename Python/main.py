from car import Car
from driver import Driver
from uberX import UberX
from uberBlack import UberBlack
if __name__ == "__main__":
    car = UberX("ASDF3245", Driver("Juan Mamani", "34545454"), "Toyota", "2020")
    car1 = UberBlack("ASDF3245", Driver("Juan Mamani", "34545454"), "Coll", "lino fino")

    car.setPasengers(4)
    print(car.getPasengers())

    print(vars(car))
    print(vars(car1))
