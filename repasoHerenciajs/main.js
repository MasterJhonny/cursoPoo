import Personal from './personal.js';
import Profesor from './profesor.js';
import Alumno from './alumno.js';
import Ayudante from './ayudante.js';

let juan = new Profesor("Juan Mamani", "juan3434@gmail.com", "1234patito", 34, "Licenciatura");
juan.printData()

let carlosAl = new Alumno("Carlos Villa", "carolso345435@gmail.com", "234344were", 23, 'Tercer semestre');
carlosAl.printData()

let mario = new Ayudante("Mario Miranda", "miranda345@gmail.com", "qwert", 24, 'second semestre');
mario.printData()