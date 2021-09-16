class Car:
    age = int
    color = str
    def __init__(self, age, color):
        self.age = age
        self.color = color
    def run(self):
        print(f"this car of colot {self.color} is run")
