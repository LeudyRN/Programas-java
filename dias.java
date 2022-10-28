//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
public class dias {
    //iniciando metodo main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //atributo
        int dia;
        //solicitando numeros
        System.out.print("Ingrese un numero del 1 al 7: ");
        dia = scanner.nextInt();
        //utilizando sentencia switch para utilizar el valor guardado en la variable
        //Y asi imprimir por pantalla el dia correspondido
        switch(dia){

            case 1: 
            System.out.println("El dia seleccionado es Lunes...");
            break;

            case 2:
            System.out.println("El dia seleccionado es Martes...");
            break;

            case 3:
            System.out.println("El dia seleccionado es Miercoles...");
            break;

            case 4:
            System.out.println("El dia seleccionado es Jueves...");
            break;

            case 5:
            System.out.println("El dia seleccionado es Viernes...");
            break;

            case 6:
            System.out.println("El dia seleccionado es Sabado...");
            break;

            case 7: 
            System.out.println("El dia seleccionado es Domingo...");
            break;
            default:
            System.out.println("Numero incorrecto. ");
        }
    }
}
