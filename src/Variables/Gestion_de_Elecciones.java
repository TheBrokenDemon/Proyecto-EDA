package Variables;

import java.util.Scanner;
public class Gestion_de_Elecciones {
    //Se debe iniciar cuando se ingrese la contraseña y el nombra del operador
    public static void Gestion_de_Elecciones(){
        Scanner src = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = src.nextLine();
        System.out.print("Ingrese la contraseña: ");
        int cont = src.nextInt();
        
        if(cont == 12345 && "Hernan".equals(nombre)){
            //Inicia el programa
            System.out.println("Bienvenido.");
            Elecciones demo = new Elecciones();
            demo.Crear();
            demo.Cambiar();
        }else{
            //No inicia el programa
            System.out.println("Error en contraseña o nombre.");
        }
    }
    public static void main(String[] args) {
        Gestion_de_Elecciones();
    }
}
