//importando metodos necesarios para calcular el cumpleano
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//iniciando clase
public class cumpleano {
    //iniciando el metodo main
  public static void main(String[] args) {
    //atributos
    String nombre;
    String nacimiento;
    //creando scanner
    Scanner scanner = new Scanner(System.in);
    //Solicitando datos para almacenar en la variable nombre
    System.out.println("Introduzca su Nombre: ");
    nombre = scanner.nextLine();
    //Solicitando datos para almacenar en la variable nacimiento
    System.out.println("Introduzca su fecha de nacimiento (dd//MM//yyyy)");
    nacimiento = scanner.nextLine();
    //implementando DateFormant y LocalDate para encontrar la fecha y comparar con la actual
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd//MM//yyyy");
    LocalDate fecha = LocalDate.parse(nacimiento, fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fecha, ahora);
    //Imprimir Resultados
    System.out.println("Senior o Seniora " + nombre);
    System.out.println( "Usted cumpleanos dentro de: " + (12 - periodo.getMonths()) + " meses y " + (30 - periodo.getDays()) + " dias");



  }
}
