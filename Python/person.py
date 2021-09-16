class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address

pedro = Person('Juan', 34, 'calle suarez')
# print(pedro.name)


class Car:
    def __init__(self, brand, model, age):
        self.brand = brand
        self.model = model
        self.age = age
    def __run__(self):
        print(f"this Car of model {self.model} is run")

# instance in object
auto = Car("Ford", "Cmax", 2020)

# run methods
auto.__run__()