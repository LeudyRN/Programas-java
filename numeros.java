//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class numeros {
    //iniciando metodo main
    public static void main(String[] args) { 

        Scanner escaner = new Scanner(System.in);  
        //Solicitando y almacenando datos
         System.out.println("Escribe un número real:");   
         double numero = escaner.nextDouble();

           if (numero != 0) if (numero < 0) {                 
           System.out.println("El número es negativo");  

              } else {              
                   System.out.println("El número es positivo");          
                } else {
                   System.out.println("El número es neutro");   
        }
        
    }    

}
