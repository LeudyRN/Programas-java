import java.util.Scanner;

public class DateTwo {

   public int dayNumber = 0;

    public void displayDay(){
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Introduce un numero del 1 al 7\nPara identificar el dia");

        dayNumber = scanner.nextInt();

        if(dayNumber == 1){

         System.out.println("Lunes ");
        }
        else if(dayNumber == 2){

         System.out.println("Martes ");
        }else if(dayNumber == 3){

         System.out.println("Miercoles ");
        }else if(dayNumber == 4){

         System.out.println("Jueves ");   
        }else if(dayNumber == 5){

         System.out.println("Viernes ");
        }else if(dayNumber == 6){

         System.out.println("Sabado ");
        }else if(dayNumber == 7){

         System.out.println("Domingo ");
        }else{
            
        System.out.println("Introduce un numero 1 al 7... que este dia no existe");        
 
        }
    }
}
