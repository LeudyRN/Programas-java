//importando scanner
import java.util.Scanner;

//iniciando clase
class primos{

    //iniciando metodo main
    public static void main(String[] args) {
        
        //Atributos
        int num;

        Scanner scanner = new Scanner(System.in);
        //solicitando cantidad para imprimir 
        System.out.print("Hasta que número desea saber los números primos: ");
        num = scanner.nextInt();
        //validando que los numeros introducidos por teclados sean menor a 100
        //De no ser asi no continua
        if (num > 100){
            System.out.println("Introduce un numero menor a 100...");

        } else if (num <= 100) {
        //Sentencias para calcuculas los numeros primos y imprimir por pantalla
        for(int i = 1; i < num; i++){
           int contador = 0;

           for (int l = 1; l <=i; l++){

            if (i % l == 0)
                contador++;
           }
           if (contador == 2){
           System.out.println(i);
           }
        }
        }
    } 
}