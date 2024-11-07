package Variables;

public class Miembro_de_Mesa extends Persona{
    public String tipo;
    public int clave;
    
    public Miembro_de_Mesa(){
        super();
        tipo = "";
        clave = 0;
    }
    
    public Miembro_de_Mesa(int dni, String nombre, String tipo, int clave){
        super(dni, nombre);
        this.tipo = tipo;
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
}
