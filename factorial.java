//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class factorial {
    //iniciando metodo main
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
    //atributos
    long factorial=1;         
    int num;         
    //Solicitando numero y almacenando    
    System.out.print("Introduce un número: ");
    num = scanner.nextInt();
    //ciclo for para recorrer
    for (int i = num; i > 0; i--) {  

        factorial = factorial * i;

     }         

     System.out.println("El factorial de " + num + " es: " + factorial);   
    }
    
} 

