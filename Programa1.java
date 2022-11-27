//Leudy Randy Nolasco
//Matricula: 100576672
//Asignatura: Lenguaje de Programacion II 
//Seccion: INF 5140-Z03
//10/11/2022
//11:58 AM
//Jose Manuel Amado P





import java.util.Scanner;

class Programa1{


    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int numero = 0;
    int cuadrado;
    boolean con = false;
    double factorial = 1;

    System.out.println("Introduce un numero: ");
    numero = scanner.nextInt();

    if(numero>0){

        System.out.println("Es positivo\n");
 
         } else {
 
         System.out.println("Es negativo\n");
      }
 
//---------------------------------------------------------------------------


    if ( numero % 2 == 0 ) {
    System.out.printf( "ES PAR\n" );

  }else {

    System.out.printf( "ES IMPAR\n" );
} 

//----------------------------------------------------------------------------


for(int i = 2; i <= numero/2; ++i){

    if(numero % i == 0){

        con = true;

        break;

    }

}
     if (!con){

    System.out.println(numero + " Es Primo.\n");

     } else{

    System.out.println(numero + " No es primo.\n");
     }


 //-----------------------------------------------------------------------------------

    for (int i=numero;i>0;i--) {


    factorial=factorial*i;

 }
   System.out.println("El factorial de " + numero + " es: " + factorial);

//------------------------------------------------------------------------------------
    while(numero>=0){ 

        cuadrado=numero*numero;

        System.out.println(numero+ "² es igual a "+ cuadrado);
        System.out.print("Introduzca otro número: ");
        numero=scanner.nextInt(); 

        } 
        
        System.out.print("Fin... ");

      
     }
    


}