//importando scanner 
import java.util.Scanner;
//iniciando clase
public class TipoOracion {
  //iniciando el metodo main  
    public static void main(String[] args) {
        //Declarando scanner 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estamos muy creativos el dia de hoy");
        //Solicitando oracion para almacenarla en una variable
        System.out.println("Introduce una oracion: ");
        //atributos
        String oracion = scanner.nextLine();
        String[] adc = oracion.split("");
         //ciclo for para recorrer
        for (int i = 0; i < adc.length; i++){
            //if para validar y ponerle la mayusculas
            if( i == 0 || adc[i-1].equals(" ")){
                adc[i] = adc[i].toUpperCase(); 
            }
        }
        //Imprimiendo por pantalla
        System.out.println(String.join("", adc));
    }
}
