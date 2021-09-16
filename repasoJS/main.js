import Aula from './aula.js';
import listaEstudents from './lista.js';

let curso = new Aula("curso 6to de sec.", listaEstudents)

// console.log(curso.curso)
// console.table(curso.listEstudents)
// curso.listEstudents.forEach(estudents => {
//     estudents.saludar()
// })

curso.callListEstudents()
console.table(curso.listToday)