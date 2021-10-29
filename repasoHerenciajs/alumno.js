import Personal from './personal.js'
class Alumno extends Personal {
    constructor(name, email, password, age, semestre) {
        super(name, email, password, age);
        this.materiasCursando = new Array();
        this.semestre = semestre;
    }
}

export default Alumno;