package Variables;
import java.util.Scanner;
import tda.*;

public class Elecciones {
    Scanner src = new Scanner(System.in);
    public String tipo; //Tipo de eleciones
    public Fecha dia_eleccion;
    public Candidatos_Lista lista;
    public Lista_Mesas listMe;
    public Cola_Registros cola;
    
    
    public Elecciones(){
        this.tipo = "";
        this.dia_eleccion = new Fecha();
        this.lista = new Candidatos_Lista();
        this.listMe = new Lista_Mesas();
        this.cola = new Cola_Registros();
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

    public Cola_Registros getCola() {
        return cola;
    }

    public void setCola(Cola_Registros cola) {
        this.cola = cola;
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
        boolean terminado = false;
        do{
            if(this.dia_eleccion.Actualidad()){
                System.out.println("1. Tipo");
                System.out.println("2. Fecha");
                System.out.println("3. Candidatos");
                System.out.println("4. Mesa Electoral");
                System.out.println("5. Actas Electorales");
                System.out.println("6. Contar votos");
                System.out.println("7. Mostrar datos");
                System.out.println("8. Salir");
                System.out.println("Que desea hacer? ");
                int x = src.nextInt();
                switch (x) {
                    case 1 -> {
                        System.out.println("Ingrese el nuevo tipo: ");
                        this.tipo = src.next();
                        break;
                    }
                    case 2 -> {
                        System.out.println("Ingrese la nueva fecha.");
                        this.dia_eleccion.leer();
                        break;
                    }
                    case 3 -> {
                        lista.Cambiar();
                        break;
                    }
                    case 4 -> {
                        listMe.cambiar();
                        break;
                    }
                    case 5 -> {
                        cola.Regsitrar_actas(listMe);
                        break;
                    }
                    case 6 -> {
                        Contar_Votos();
                        break;
                    }
                    case 7 -> {
                        Mostrar();
                        break;
                    }
                    default -> {
                        System.out.println("Hasta luego.");
                        terminado = true;
                        break;
                    }
                }
            }else{
                System.out.println("Ya no es posible cambiar los datos.");
                terminado = true;
                break;
            }
        }while(!terminado);
    }
    
    public void Contar_Votos(){
        Pila votos = new Pila();
        System.out.println("Numero total de votos: "+cola.Contar());
        for (int i = 1; i <= lista.getList().longitud(); i++) {
            System.out.println("Ingrese el numero de votos para: "+lista.getList().iesimo(i).getNombres());
            int aux = src.nextInt();
            votos.push(aux);
        }
        System.out.println("Ingrese el numero de  votos en blanco: ");
        int blanc = src.nextInt();
        
    }
    
    public void Mostrar(){
        System.out.println("-Elecciones-");
        System.out.println("Tipo: "+tipo);
        System.out.println("Fecha: "+dia_eleccion.verFecha());
        System.out.println("Lista de candidatos: ");
        for (int i = 1; i <= lista.getList().longitud(); i++) {
            System.out.println("- "+lista.getList().iesimo(i).getNombres());
        }
        System.out.println("----------");
        System.out.println("Info de mesas: ");
        System.out.println("Ubicacion"+"\t"+"Numero de mesa");
        for (int i = 1; i <= listMe.getList().longitud(); i++) {
            System.out.println(listMe.getList().iesimo(i).getUbicacion() + "\t" + listMe.getList().iesimo(i).getNumMesa());
        }
        System.out.println("----------");
        System.out.println("Info de actas: ");
        System.out.println("Titulo"+"\t"+"Numero de votos"+"\t"+"Numero de mesa");
        for (int i = 1; i <= cola.getCola().longitud(); i++) {
            System.out.println(this.cola.getCola().Iesimo(i, cola.getCola()).getTitulo() + "\t" +
                               this.cola.getCola().Iesimo(i, cola.getCola()).getNumVotos() + "\t" +
                               this.cola.getCola().Iesimo(i, cola.getCola()).getNumMesa());
        }
    }
}
