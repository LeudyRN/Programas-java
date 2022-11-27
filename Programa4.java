//Leudy Randy Nolasco
//Matricula: 50576672
//Asignatura: Lenguaje de Programacion II 
//Seccion: INF 5140-Z03
//7/11/2022
//08:05 AM
//Jose Manuel Amado P



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Programa4 {

    public static void main(String[] args) {
 
        String fecha;

        Scanner leer=new Scanner(System.in);


        boolean res=true;

        System.out.println("RECUERDA QUE LA FEHCA DEBE DE INTRODUCIRSE: DD/MM/YYYY");
        System.out.print("Introducir Fecha: ");
        fecha=leer.next();

        res=validarFecha(fecha);


        if(res==true){
            System.out.println("La fecha es valida");
             }else
                 System.out.println("La fecha no es valida");


        

         }
 
public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

 }
    

