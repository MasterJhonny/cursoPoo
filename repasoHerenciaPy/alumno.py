from personal import Personal
class Alumno(Personal):
    materiasPasa = str
    semestre = str
    def __init__(self, name, email, semestre):
        super(Alumno, self).__init__(name, email)
        self.semestre = semestre