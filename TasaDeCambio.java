//Importando scanner para pedir datos
import java.util.Scanner;
//iniciando clase
public class TasaDeCambio {
    //iniciando metodo main
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
      //atributos
       double p1,moneda,p2,p3,p4,p5 = 0;
      //imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Dolaes a Pesos***");
      //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Dolares a cambiar a Pesos: ");
       p1 = scanner.nextDouble();
       p2 = (p1 * 53.93);
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p2);
// ******************************************************************

//imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Pesos a Dolares***");
      //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Pesos a Cambiar a Dolares: ");
       moneda = scanner.nextDouble();
       p3 = (moneda * 0.019);
       
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p3);
// ******************************************************************
      //imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Euros a Pesos***");
      //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Euros a cambiar a Pesos: ");
       p4 = scanner.nextDouble();
       p5 = (p4 * 58.64);
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p5);       
// *******************************************************************
     //imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Euros a Pesos***");
      //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Pesos a Cambiar a Euros: ");
       moneda = scanner.nextDouble();
       p3 = (moneda * 0.017);
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p3);
// *******************************************************************       
//imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Dolares a Euros***");
       //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Dolares a cambiar a Euros");
       p1 = scanner.nextDouble();
       p2 = (p1 * 0.92);
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p2);
// *******************************************************************
//imprimir por pantalla  para saber que se esta haciendo
       System.out.println("***Conversion de Euros a Dolares***");
      //solicitando datos por pantalla para el uso de las variables
       System.out.println("Ingrese la cantidad de Euros a cambiar a Dolares: ");
  
       p4 = scanner.nextDouble();
       p5 = (p4 * 1.09);
       //Imprimiendo resultado por pantalla
       System.out.println("El total de su cambio es: " + p5);

    }
 }
