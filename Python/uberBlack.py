from car import Car
class UberBlack(Car):
    typeCardAcepted = []
    material = []
    def __init__(self,license, driver, typeCardAcepted, material):
        super(UberBlack, self).__init__(license, driver)
        self.typeCardAcepted = typeCardAcepted
        self.material = material