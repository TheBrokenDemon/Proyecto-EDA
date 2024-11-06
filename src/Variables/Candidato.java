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
    
    
}
