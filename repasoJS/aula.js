class Aula {
    constructor(curso, lisstEstudents){
        this.curso = curso;
        this.listEstudents = lisstEstudents;
    }
    callListEstudents(){
        this.listToday = this.listEstudents.map(estudents => {
            if(estudents.present){
                return {
                    name: estudents.name,
                    asistent: "presente"
                }
            } else {
                return {
                    name: estudents.name,
                    asistent: "no se encuentra"
                }
            }
        })
    }
}
export default Aula