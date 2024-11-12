package Variables;
import java.util.Calendar;

public class Acta_Electoral extends Mesa_Electoral {
    Calendar cal = Calendar.getInstance();
    public String titulo;
    public int numVotos;
    public int numActa;
    public int Hora;
    
    public Acta_Electoral(){
        super();
        titulo = "";
        numVotos = 0;
        Hora = cal.get(Calendar.HOUR);
    }
    
    public Acta_Electoral(Lista_Miembros list, String ubi, int numMesa, String titulo, int numVoto){
        super(list, ubi, numMesa);
        this.titulo = titulo;
        this.numVotos = numVoto;
        Hora = cal.get(Calendar.HOUR);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }

    public int getNumActa() {
        return numActa;
    }

    public void setNumActa(int numAct) {
        this.numActa = numAct;
    }
}
