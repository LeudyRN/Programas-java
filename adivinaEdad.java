//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class adivinaEdad {
    //iniciando metodo main

    public static void main(String[] args) {
        //atributos
        int edadReal = 20;
        int edad;
        int salir;

        Scanner scanner = new Scanner(System.in);
        //sentencia para volver a pedir este bloque de codigo si
        //el resultado no es el mismo
    do{ 
        System.out.println("Si quieres salir del programa pulse 1 de lo contrario pulse 2 ");
        salir = scanner.nextInt();

        if ( salir == 1){

            System.exit(0); 
        }

        System.out.print("Introduce una edad: ");
        edad = scanner.nextInt();
        

    }while (edad != edadReal );

        System.out.println(" ");


    }


}
