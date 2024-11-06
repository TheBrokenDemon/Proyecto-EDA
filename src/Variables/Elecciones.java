package Variables;
import java.util.Scanner;

public class Elecciones {
    Scanner src = new Scanner(System.in);
    public String tipo; //Tipo de eleciones
    public Fecha dia_eleccion;
    public Candidatos_Lista lista;
    
    public Elecciones(){
        this.tipo = "";
        this.dia_eleccion = new Fecha();
        this.lista = new Candidatos_Lista();
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
    }
    
    public void Cambiar(){
        if(this.dia_eleccion.Actualidad()){
            System.out.println("1. Tipo");
            System.out.println("2. Fecha");
            System.out.println("3. Candidatos");
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
                default -> {
                    System.out.println("1. Agregar");
                    System.out.println("2. Cambiar datos");
                    System.out.println("3. Eliminar");
                    int y = src.nextInt();
                    switch (y) {
                        case 1 -> {
                            lista.agregar();
                        }
                        case 2 -> {
                            System.out.print("Ingrese el DNI del candidato deseado: ");
                            int z = src.nextInt();
                            lista.Cambiar(z);
                        }
                        default -> {
                            System.out.print("Ingrese el DNI del candidato deseado: ");
                            int z = src.nextInt();
                            lista.eliminar(z);
                        }
                    }
                }
            }
        }else{
            System.out.println("Ya no es posible cambiar los datos.");
        }
            
    }
    
    
    
    
    
}
