from car import Car
from account import Account

from user import User
from driver import Driver
if __name__ == "__main__":
    print("HOLA MUNDOS")

    car = Car("AMS234",Account("Andres Herrera","AND123"))
    print(vars(car))
    print(vars(car.driver))

    driver1= Driver("Conductor Herrera","AND123")
    print(vars(driver1))
    print(vars(driver1.name))

    usuario1= User("Conductor Herrera","AND123")
    print(vars(usuario1))
    print(vars(usuario1.name))

   


