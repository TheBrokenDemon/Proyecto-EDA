package Variables;
import java.util.Scanner;
import tda.*;

public class Mesa_Electoral{
    Scanner src = new Scanner(System.in);
    
    public Lista_Miembros list;
    public String ubicacion;
    public int numMesa;
    
    public Mesa_Electoral(){
        this.list = new Lista_Miembros();
        this.ubicacion = "";
        this.numMesa = 0;
    }
    
    public Mesa_Electoral(Lista_Miembros list, String ubi, int numMesa){
        this.list = list;
        this.ubicacion = ubi;
        this.numMesa = numMesa;
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

    public Lista_Miembros getList() {
        return list;
    }

    public void setList(Lista_Miembros list) {
        this.list = list;
    }
    
    
    public void declarar_miembros(){
        list.agregar();
    }
    
    public void cambiar_miembros(int num){
        list.Cambiar(num);
    }
    
    
}
