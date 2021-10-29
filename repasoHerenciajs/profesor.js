import Personal from './personal.js'
class Profesor extends Personal {
    constructor(name, email, password, age, titulo) {
        super(name, email, password, age);
        this.materiasDicta = new Array();
        this.titulo = titulo;
    }
}

export default Profesor;