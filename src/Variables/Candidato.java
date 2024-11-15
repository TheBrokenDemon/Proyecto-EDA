package Variables;

public class Candidato extends Persona {
    public String partido;
    
    public Candidato(){
        super();
        this.partido = "";
    }
    
    public Candidato(int dni, String nombre, String partido){
        super(dni, nombre);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    @Override
    public int getDni() {
        return dni;
    }
    
    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }
    @Override
    public String getNombres() {
        return nombres;
    }
    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}
