package Variables;
import java.util.Scanner;

public class Elecciones {
    Scanner src = new Scanner(System.in);
    public String tipo; //Tipo de eleciones
    public Fecha dia_eleccion;
    public Candidatos_Lista lista;
    public Lista_Mesas listMe;
    
    public Elecciones(){
        this.tipo = "";
        this.dia_eleccion = new Fecha();
        this.lista = new Candidatos_Lista();
        this.listMe = new Lista_Mesas();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fecha getDia_eleccion() {
        return dia_eleccion;
    }

    public void setDia_eleccion(Fecha dia_eleccion) {
        this.dia_eleccion = dia_eleccion;
    }

    public Candidatos_Lista getLista() {
        return lista;
    }

    public void setLista(Candidatos_Lista lista) {
        this.lista = lista;
    }

    public Lista_Mesas getListMe() {
        return listMe;
    }

    public void setListMe(Lista_Mesas listMe) {
        this.listMe = listMe;
    }

    
    public void Crear(){
        System.out.print("Ingrese el tipo de elecciones que se haran: ");
        this.tipo = src.next();
        System.out.println("Ingrese el dia que se realizaran.");
        this.dia_eleccion.leer();
        System.out.print("Ingrese el numero de candidatos: ");
        int x = src.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(i+".");
            this.lista.agregar();
        }
        System.out.print("Ingrese el numero de mesas electorales: ");
        int y = src.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.println(i+".");
            this.listMe.agregar();
        }
    }
    
    public void Cambiar(){
        if(this.dia_eleccion.Actualidad()){
            System.out.println("1. Tipo");
            System.out.println("2. Fecha");
            System.out.println("3. Candidatos");
            System.out.println("4. Mesa Electoral");
            System.out.println("Que desea cambiar? ");
            int x = src.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Ingrese el nuevo tipo: ");
                    this.tipo = src.next();
                }
                case 2 -> {
                    System.out.println("Ingrese la nueva fecha.");
                    this.dia_eleccion.leer();
                }
                case 3 -> {
                    lista.Cambiar();
                }
                default -> {
                    listMe.cambiar();
                }
            }
        }else{
            System.out.println("Ya no es posible cambiar los datos.");
        } 
    }
    
    public void Registro_votos(){
        
        
        
        
    }
    
    
    
    
    
    
    
}
