//importando libreria java
import java.util.Scanner;
//iniciando clase
class vocales {
    
    //iniciando metodo main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //atributos
        char caracter;
        //Solicitando caracter 
        System.out.print("Introduce un caracter: ");
        caracter = scanner.next().charAt(0);
        //validando y comparando si el caracter introducido es una vocal
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' )

            System.out.println(caracter + " Es una vocal");

        else

            System.out.println(caracter + " No es una vocal");
    }
}
