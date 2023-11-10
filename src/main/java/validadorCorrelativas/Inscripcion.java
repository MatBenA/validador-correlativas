package validadorCorrelativas;

import java.time.LocalDate;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;
    public Inscripcion(Alumno alumno, Materia materia){
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDate.now();
    }

    public boolean aprobada(){
        return !this.materia.tieneCorrelativas() || this.materia.puedeCursar(this.alumno);
    }
    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDate getFecha() {
        //TODO
        return fecha;
    }
}
