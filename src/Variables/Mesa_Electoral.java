package Variables;
import tda.*;

public class Mesa_Electoral{
    public Lista_Miembros list;
    public String ubicacion;
    public int numMesa;
    
    public Mesa_Electoral(){
        this.list = new Lista_Miembros();
        this.ubicacion = "";
        this.numMesa = 0;
    }
 

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
    
    public void declarar_miembros(){
        list.agregar();
    }
    
    public void cambiar_miembros(int num){
        list.Cambiar(num);
    }
    
    

    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
