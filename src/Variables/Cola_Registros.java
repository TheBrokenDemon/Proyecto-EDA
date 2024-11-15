package Variables;
import tda.*;
import java.util.Scanner;

public class Cola_Registros {
    Scanner src = new Scanner(System.in);
    public Cola<Acta_Electoral> cola;
    
    public Cola_Registros(){
        this.cola = new Cola();
    }

    public Cola<Acta_Electoral> getCola() {
        return cola;
    }

    public void setCola(Cola<Acta_Electoral> cola) {
        this.cola = cola;
    }
    
    
    public void Regsitrar_actas(Lista_Mesas listMe){
        System.out.println("Ingrese el numero de la mesa para la acta: ");
        int pos = src.nextInt();
        int i = listMe.ubicar(pos);
        System.out.print("Ingrese el Tiulo de la acta: ");
        String title = src.next();
        System.out.print("Ingrese el numero de votos en la mesa: ");
        int tot = src.nextInt();
        Lista_Miembros aux1 = listMe.getList().iesimo(i).getList();
        String aux2 = listMe.getList().iesimo(i).getUbicacion();
        int aux3 = listMe.getList().iesimo(i).getNumMesa();
        Acta_Electoral treat = new Acta_Electoral(aux1, aux2, aux3, title, tot);
        cola.encolar(treat);
        
    }
    
    public int Contar(){
        int cont = 0;
        for (int i = 1; i <= cola.longitud(); i++) {
            cont = cont + getCola().Iesimo(i, cola).getNumVotos();
        }
        return cont;
    }
    
    
}
