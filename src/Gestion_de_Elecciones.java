import java.util.Scanner;
public class Gestion_de_Elecciones {
    //Se debe iniciar cuando se ingrese la contraseña y el nombra del operador
    public static void Gestion_de_Elecciones(int cont, String nombre){
        if(cont == 12345 && "Hernan".equals(nombre)){
            //Inicia el programa
            System.out.println("Bienvenido.");
        }else{
            //No inicia el programa
            System.out.println("Error en contraseña o nombre.");
        }
        
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name = src.nextLine();
        System.out.print("Ingrese la contraseña: ");
        int contra = src.nextInt();
        Gestion_de_Elecciones(contra, name);
    }
}
