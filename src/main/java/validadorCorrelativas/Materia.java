package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    public Materia (String nombre){
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }
    public boolean puedeCursar(Alumno alumno){
        return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tieneCorrelativa(materiaCorrelativa));
    }

    public void agregarCorrelativa(Materia correlativa){
        this.correlativas.add(correlativa);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean tieneCorrelativas() {
        return !this.correlativas.isEmpty();
    }
}
