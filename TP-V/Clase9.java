/////////////////////////////////////CitaMedico/////////////////////////////////

public class CitaMedico {

    private String fecha;
    private String hora;

    private Paciente paciente;
    private Profesional profesional;

    public CitaMedico(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    @Override
    public String toString() {
        return "El paciente " + paciente.getNombre() + " tiene un turno el " + fecha + " a las " + hora + " para "+ profesional.getEspecialidad() + " con " + profesional.getNombre() ;
    }
}

/////////////////////////////////////Paciente/////////////////////////////////

public class Paciente {

    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
}

/////////////////////////////////////Profesional/////////////////////////////////

public class Profesional {

    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "El profesional " + nombre + " tiene especialidad en " +especialidad;
    }
}
