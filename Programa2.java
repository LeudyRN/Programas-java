//Leudy Randy Nolasco
//Matricula: 100576672
//Asignatura: Lenguaje de Programacion II 
//Seccion: INF 5140-Z03
//10/11/2022
//12:30 AM
//Jose Manuel Amado P

import java.util.Scanner;

class Programa2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        int multi;
        int numero1 = 0;
        int numero2 = 0;

       

        System.out.println("Introduce un numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Introduce otro numero: ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2) {

            System.out.println("Son iguales!\n");
        }else {

            System.out.println("No son iguales!\n");
        }

        multi = numero1%numero2;

        if (multi==0){
            System.out.println(numero1 + " Es múltiplo de " + numero2);

        } else{

            System.out.println(numero1 + " No es múltiplo de " + numero2);
        }

        if (numero1 >= numero2) {
            System.out.println("El numero mayor es: " + numero1);

        }  else if(numero2 >= numero1){

            System.out.println("El numero mayor es: " + numero2);
        }

        if (numero1 <= numero2) {

            System.out.println("El numero menor es: " + numero1);

        } else if(numero2 <= numero1){
            System.out.println("El numero menor es: " + numero2);
        }

        if (numero1 >= numero2){

          

            System.out.println(" " + numero1 + " " + numero2);

        } else if (numero2 >= numero1){

            System.out.println(" " + numero2 + " " + numero1);

        }

        System.out.println("ORDENANDO DE MAYOR A MENOR Y DE MENOR A MAYOR\n");

        if (numero1 <= numero2){

        

            System.out.println(" " + numero1 + " " + numero2);

        } else if (numero2 <= numero1){

          

            System.out.println(" " + numero2 + " " + numero1);
        }


    }
    
}
