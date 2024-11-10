package Variables;

import java.util.Calendar;
import java.util.Scanner;

public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        dia = 1;
        mes = 1;
        año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    // leer datos desde el teclado
    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Dia: ");
        this.dia = sc.nextInt();
        System.out.print("Ingrese el Mes: ");
        this.mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        this.año = sc.nextInt();        
    }
    public String verFecha(){
        return dia+"/"+mes+"/"+año;
    }
    public boolean Actualidad(){
        Calendar cal = Calendar.getInstance();
        int añoActual = cal.get(Calendar.YEAR);
        int mesActual = cal.get(Calendar.MONTH) + 1;
        int diaActual = cal.get(Calendar.DAY_OF_MONTH);
        if(año >= añoActual){
            return true;
        }else{
            if(mes >= mesActual){
                return true;
            }else{
                return dia > diaActual;
            }
        }
    }
    
}
