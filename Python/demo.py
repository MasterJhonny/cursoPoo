class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address
    def saludar(self):
        print(f"Hi my name is {self.name} have {self.age} and live {self.address}")

juan = Person('Juan', 34, 'calle Vargas')

juan.saludar()
