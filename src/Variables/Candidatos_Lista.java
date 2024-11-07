package Variables;
import java.util.Scanner;
import tda.*;

public class Candidatos_Lista {
    Scanner src = new Scanner(System.in);
    public Lista<Candidato> list;
    
    public Candidatos_Lista(){
        this.list = new Lista();
    }
    
    public void agregar(){
        System.out.print("Ingrese el dni de la persona: ");
        int DNI = src.nextInt();
        System.out.print("Ingrese el nombre de la persona: ");
        String name = src.next();
        System.out.print("Ingrese el partido de la persona: ");
        String party = src.next();
        Candidato cand = new Candidato(DNI, name, party);
        list.agregar(cand);
    }
    //----------------------------
    public int ubicar(int dni){
        for (int i = 0; i <= list.longitud(); i++) {
            if (list.iesimo(i).getDni() == dni) {
                return i;
            }
        }
        return -1;
    }
    
    public void eliminar(int dni){
        int pos = ubicar(dni);
        if (pos >= 0) {
            list.eliminar(pos);
        }
    }
    
    public void Cambiar(){
        System.out.println("1. Agregar");
        System.out.println("2. Cambiar datos");
        System.out.println("3. Eliminar");
        int y = src.nextInt();
        switch (y) {
            case 1 -> {
                System.out.println("Ingrese los datos del candidato.");
                agregar();
            }
            case 2 -> {
                System.out.println("Ingrese el Dni del candidato: ");
                int pos = src.nextInt();
                System.out.println("Ingrese nuevamente los datos.");
                System.out.println("DNI: ");
                int newdni = src.nextInt();
                System.out.println("Nombre: ");
                String name = src.next();
                System.out.println("Partido: ");
                String party = src.next();
                list.iesimo(pos).setDni(newdni);
                list.iesimo(pos).setNombres(name);
                list.iesimo(pos).setPartido(party);
            }
            case 3 -> {
                System.out.println("Ingrese el Dni del candidato: ");
                int pos = src.nextInt();
                list.eliminar(pos);
            }
        }
    }
}
