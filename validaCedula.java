//importando scanner
import java.util.Scanner;
//iniciando clase 
public class validaCedula {
//iniciando metodo main
 public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
//atributos
    String cedula;
    int sora =0;
    int suma = 0;
    int resultado = 0;
//solicitando cedula y almacenandola en una variable cedula
    System.out.println("Ingrese su cedula: ");
    cedula = scanner.nextLine();
  //ciclo for para recorrer la variable cedula
    for (int i = 0; i < cedula.length(); i++){
        sora = Integer.parseInt(String.valueOf(cedula.charAt(i)));
      //validando 
        if((i%2) != 1){
            sora = sora * 2;
            if(sora > 10){
                sora = sora - 10;
              }
    
            }
            suma = suma + sora;
        }
        //calculo de digito y impresion por pantalla...........................
        if (suma%11 != 0){
         resultado = 11 - (suma%10);

         if(resultado == sora){
            System.out.println("Su cedula verdadera...");
            System.out.println("Su digito verificado es: " + resultado);
         }else{
            System.out.println("Su cedula es falsa...");
            System.out.println("Su digito verificado es: " + resultado);
         }

        }else{
            System.out.println("Su cedula verdadera...");
            System.out.println("Su digito verificado es: " + resultado);           
        }

    }

}