import java.util.Scanner;

public class Sequence2 {

    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber = 0;
    int sumador = 1;
    
    public void displaySequence(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce la cantidad de numeros a generar ");
        nextNumber = scanner.nextInt();

        for (int i = 0; i < nextNumber; i++){


            System.out.println(sumador + " + ");

            sumador = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumador;
        }
    }
}
