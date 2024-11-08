package Variables;
import java.util.Scanner;
import tda.*;

public class Lista_Mesas {
    Scanner src = new Scanner(System.in);
    public Lista<Mesa_Electoral> list;
    
    public Lista_Mesas(){
        this.list = new Lista();
    }

    public Lista<Mesa_Electoral> getList(){
        return list;
    }

    public void setList(Lista<Mesa_Electoral> list){
        this.list = list;
    }
    
    
    public void agregar(){
        Mesa_Electoral aux = new Mesa_Electoral();
        System.out.print("Ingrese la Ubicacion de la mesa: ");
        String ubi = src.next();
        System.out.print("Ingrese el numero de la mesa: ");
        int num = src.nextInt();
        System.out.println("Ingrese los datos de los miembros.");
        for (int i = 1; i <= 1; i++){
            System.out.println(i+".");
            aux.declarar_miembros();
        }
        aux.setNumMesa(num);
        aux.setUbicacion(ubi);
        list.agregar(aux);
    }
        
    public int ubicar(int num){
        for (int i = 1; i <= list.longitud(); i++) {
            if (list.iesimo(i).getNumMesa() == num) {
                return i;
            } 
        }
        return -1;
    }
    
    public void eliminar(int num){
        int pos = ubicar(num);
        if (pos >= 0) {
            list.eliminar(pos);
        }
    }
    
    public void cambiar(){
        System.out.print("Ingrese el numero de la mesa: ");
        int num = ubicar(src.nextInt());
        System.out.println("1. Ubicacion");
        System.out.println("2. Numero de mesa");
        System.out.println("3. Lista de Miembros");
        System.out.println("4. Eliminar");
        System.out.println("Que desea cambiar? ");
        int y = src.nextInt();
        switch (y) {
            case 1 -> {
                System.out.print("Ingrese la ubicacion de la mesa: ");
                String aux = src.next();
                list.iesimo(num).setUbicacion(aux);
            }
            case 2 -> {
                System.out.print("Ingrese el numero de mesa: ");
                int aux = src.nextInt();
                list.iesimo(num).setNumMesa(aux);
            }
            case 3 -> {
                System.out.print("Ingrese la clave del miembro: ");
                int aux = src.nextInt();
                list.iesimo(num).cambiar_miembros(aux);
            }
            default -> {
                System.out.println("Ingrese el numero de mesa: ");
                int aux = src.nextInt();
                list.eliminar(aux);
            }
        }
    }
    
    public int Longitud(){
        return list.longitud();
    }
    
    
   
        
        
        
        
    
    
}
