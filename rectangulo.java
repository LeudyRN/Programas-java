//Inicio de la clase
class rectangulo {
    //Inicio del metodo main
public static void main(String[] args) {

    //imprimir por pantalla
    
    System.out.println("Introducir la altura del rectangulo: ");
    //atributo
    int altura = Integer.parseInt(System.console().readLine());
    //imprimir por pantalla
    System.out.println("Introducir la base del rectangulo: ");
    //atributos
    int base = Integer.parseInt(System.console().readLine());
    int area = (base * altura);
    //imprimir resultados por pantalla
    System.out.println("El area del rectangulo es: " + area);
}   
}
