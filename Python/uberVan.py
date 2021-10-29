from car import Car
class UberVan(Car):
    typeCardAcepted = []
    material = []
    def __init__(self, license, driver, typeCardAcepted, material):
        super(UberVan, self).__init__(license, driver)
        self.typeCardAcepted = typeCardAcepted
        self.material = material