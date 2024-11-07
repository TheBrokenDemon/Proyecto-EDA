package Variables;
import tda.*;
import java.util.Scanner;

public class Lista_Miembros {
    Scanner src = new Scanner(System.in);
    public Lista<Miembro_de_Mesa> list;
    
    public Lista_Miembros(){
        this.list = new Lista();
    }
    
    public void agregar(){
        System.out.print("Ingrese el dni de la persona: ");
        int DNI = src.nextInt();
        System.out.print("Ingrese el nombre de la persona: ");
        String name = src.next();
        System.out.print("Ingrese el tipo de miembro: ");
        String tipo = src.next();
        System.out.print("Ingrese la clave del miembro: ");
        int pass = src.nextInt();
        Miembro_de_Mesa memb = new Miembro_de_Mesa(DNI, name, tipo, pass);
        list.agregar(memb);
    }
    
    public int ubicar(int clave){
        for (int i = 1; i <= list.longitud(); i++) {
            if (list.iesimo(i).getClave()== clave) {
                return i;
            }
        }
        return -1;
    }
    
    public void eliminar(int clave){
        int pos = ubicar(clave);
        if (pos >= 0) {
            list.eliminar(pos);
        }
    }
    
    public void Cambiar(int clave){
        int aux = ubicar(clave);
        System.out.println("Ingrese nuevamente los datos.");
        System.out.print("DNI: ");
        int newdni = src.nextInt();
        System.out.print("Nombre: ");
        String name = src.next();
        System.out.print("Tipo: ");
        String type = src.next();
        System.out.print("Clave: ");
        int numb = src.nextInt();
        list.iesimo(aux).setDni(newdni);
        list.iesimo(aux).setNombres(name);
        list.iesimo(aux).setTipo(type);
        list.iesimo(aux).setClave(numb);
    }
    
}
