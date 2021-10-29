import Driver from './Driver.js'
import UberX from './UberX.js'
import UberPull from './UberPull.js'


let auto = new UberPull('WERT345', new Driver("Juan Mamani"), "toyota", "2020"); 

auto.printData()
console.log(auto)


let auto2 = new UberX('ASDF234', new Driver("Frederik Taylor"), "Nissan", "2021"); 

auto2.printData()
// auto.passengenger = 23;
auto.setPassenger = 23;
console.log(auto.getPassenger)