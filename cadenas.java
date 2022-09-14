//importando scanner para guardar datos
import java.util.Scanner;
//iniciamos la clase
class cadenas {
//iniciando el metodo main
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//Atributos
    String nombre;
    String apellido;
    String segundoapellido;
    String principales;

//Solicitud de datos
    System.out.println("Digite su Nombre: ");
    nombre = scanner.nextLine();
    System.out.println(("Digite su primer Apellido: "));
    apellido = scanner.nextLine();
    System.out.println("Digite su segundo Apellido: ");
    segundoapellido = scanner.nextLine();

    principales = nombre.substring(0,1) + apellido.substring(0,1) + segundoapellido.substring(0,1);

    //Imprimir por pantalla
    System.out.println("Sus iniciales parecen ser: " + principales);

}    


}
