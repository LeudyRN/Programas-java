//importando libreria Scanner
import java.util.Scanner;
//Iniciando clase
class pagos {

    //iniciando metodo main

   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    //atributos
    int pago;
    int suma =0;
    //Ciclo for para solicitar la cantidad de 5 pagos
    //para luego la ver el total o sumatoria de los 5
    for (int i = 1; i <= 5; i++){
        //solicitando datos y almacenando
        System.out.println("Ingrese los pagos del mes: ");
        pago = scanner.nextInt();
        //operacion para sumar la cantidad de pagos
        suma = suma + pago;

    }
    //imprimiendo por pantalla
    System.out.println("La suma total de sus pagos durante el mes es: " + suma);

   }
}
