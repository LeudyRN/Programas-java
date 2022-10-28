//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class negativos {
    //iniciando metodo main
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);  
    //Atributos
    int sumaPositivos = 0;     
    int n;
    //sentencia do while
    do {   

        //aviso
        System.out.println("Cuando quieras terminar el prgrama puedes poner un numero negativo (-1)....");

        //solicitando datos y almacenando el mismo
        System.out.println("Ingresa un numero: ");
        n= Scanner.nextInt(); 
        //sentencia if para calcular si es positivo o negativo
        if(n==0){  

        System.out.println("El numero "+n+" es Cero");
        } else{

          if(n>0 && n!= -1){  
            System.out.println("El numero "+n+" es positivo");
                                 
          sumaPositivos = sumaPositivos + n;     
           }else{
             System.out.println("El numero "+n+" es negativo");  
            
            }             
        }         
    }while(n != -1);
    //mostrando por pantalla
        System.out.println("la suma de los numeros positivos introducidos es "+sumaPositivos);     } 
}
