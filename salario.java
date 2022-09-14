//Importar scaner para introducir datos
import java.util.Scanner;
//iniciado la clase
class salario {
    //iniciando el metodo main
public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
//atributos
    String nombre;
    int horasTrabajadas;
    int valor;
    int total;
//solicitando datos
    System.out.println("Digite su nombre completo: ");
    nombre = scanner.nextLine();

    System.out.println("Digite la cantidad total de horas trabajadas: ");
    horasTrabajadas = Integer.parseInt(System.console().readLine());

    System.out.println("Digite el valor de las horas: ");
    valor = Integer.parseInt(System.console().readLine());
//operacion
    total = (horasTrabajadas * valor);
//impresion de datos
    System.out.println("Senior/ra " + nombre);
    System.out.println("Su total por las horas trabajadas es: " + total);

}   

}
