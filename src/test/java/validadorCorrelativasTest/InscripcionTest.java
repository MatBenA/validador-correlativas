package validadorCorrelativasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class InscripcionTest {

    @Test
    public void juanSePuedeAnotarAProgramacionI() {
        Alumno juan = new Alumno("Juan", "1529987");
        Materia programacionI = new Materia("programacionI");
        Inscripcion inscripcionDeJuanAProgI = new Inscripcion(juan, programacionI);

        Assertions.assertTrue(inscripcionDeJuanAProgI.aprobada());
    }

    @Test
    public void juanNoSePuedeAnotarAProgII() {
        Alumno juan = new Alumno("Juan", "1529987");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia ("Programacion II");

        programacionII.agregarCorrelativa(programacionI);

        Inscripcion inscripcionDeJuanAProgII = new Inscripcion(juan, programacionII);

        Assertions.assertFalse(inscripcionDeJuanAProgII.aprobada());
    }

    @Test
    public void juanSePuedaAnotarAProgII(){
        Alumno juan = new Alumno("Juan", "1529987");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia ("Programacion II");

        programacionII.agregarCorrelativa(programacionI);
        juan.agregarMateriaAprobada(programacionI);

        Inscripcion inscripcionDeJuanAProgII = new Inscripcion(juan, programacionII);

        Assertions.assertTrue(inscripcionDeJuanAProgII.aprobada());
    }
}
