import java.util.Scanner;

public class Sequence1 {
 
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber = 0;
    int sumador = 1;

    public void displaySequence(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce la cantidad de numeros a generar ");
        nextNumber = scanner.nextInt();

        while (sumador <= nextNumber){
         
            System.out.println(firstNumber + " + ");

            int i = firstNumber + secondNumber;

            firstNumber =  secondNumber;

            secondNumber = i;


           sumador++;
        }
  
    }
}

