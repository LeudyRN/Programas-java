import java.util.Scanner;

public class Month {
    
    public int monthNumber = 0;

    public void displayMonth(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 12\nPara identificar el mes del anio");
        monthNumber = scanner.nextInt();

        switch (monthNumber)
     
       {
           case 1: System.out.println("Enero");
           break;
         
           case 2: System.out.println("Febrero");
           break;
         
           case 3: System.out.println("Marzo");
           break;
         
           case 4: System.out.println("Abril");
           break;
         
           case 5: System.out.println("Mayo");
           break;
         
           case 6: System.out.println("Junio");
           break;
         
           case 7: System.out.println("Julio");
           break;
         
           case 8: System.out.println("Agosto");
           break;
         
           case 9: System.out.println("Septiembre");
           break;
         
           case 10: System.out.println("Octubre");
           break;
         
           case 11: System.out.println("Noviembre");
           break;
         
           case 12: System.out.println("Diciembre");
           break;

           default:
            if(monthNumber<1 || monthNumber>12){
            System.out.println("\n\tError el mes no existe" ); 
            }
            break;
        }

    }
}