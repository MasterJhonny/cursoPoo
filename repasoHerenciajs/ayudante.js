import Personal from './personal.js'
class Ayudanate extends Personal {
    constructor(name, email, password, age, semestre) {
        super(name, email, password, age);
        this.materiasDicta = new Array();
        this.semestre = semestre;
    }
}

export default Ayudanate;