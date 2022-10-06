//importando scanner
import java.util.Scanner;
//iniciando clase
public class Rectangulo {
    //iniciando metodo main
    public static void main(String[] args) {
    //Atributos   
    double perimetro,area;

    double base = numeroReal("Introduce la base del rectangulo: ");
    double altura = numeroReal("Introduce la altura del rectangulo: ");
    //asignando valores para obtener los resultados esperados
    perimetro = 2 *(base+altura);
    area = base * altura;
    //imprimiento resultados
    System.out.println("El perimetro del rectangulo es: " + perimetro);
    System.out.println("El area del rectangulo es: " + area);
    }
    
    //metodo privado numeroReal
    //Sirve para usar el scanner basicamente como metodo
    //donde pongamos numeroRea; ejecutara esta bloque de codigo
    private static double numeroReal(String s){
       Scanner scanner = new Scanner(System.in);

       System.out.println(s);
       return scanner.nextDouble();
    }
}
