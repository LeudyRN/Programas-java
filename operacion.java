//inicio de clase
class operacion {
    //inicio del metodo main
    public static void main(String[] args) {
        //imprimir por pantalla
        System.out.println("Operaciones matematicas como Sumar, Restar, Multiplicar y Dividir\n");

        System.out.println("Introducir el primer numero: ");
        //atributo
        int numero1 = Integer.parseInt(System.console().readLine());
        //imprimir por pantalla
        System.out.println("Introducir el segundo numero: ");
        //atributos
        int numero2 = Integer.parseInt(System.console().readLine());
        int numeros;
        //operaciones para arrojar los datos por pantalla
        numeros = numero1 + numero2;
        System.out.println("La suma de ambos numeros es: " + numeros);
        numeros = numero1 - numero2;
        System.out.println("La resta de ambos numeros es: " + numeros);
        numeros = numero1 * numero2;
        System.out.println("La multiplicacion de ambos numeros es: " + numeros);
        numeros = numero1 / numero2;
        System.out.println("La division de ambos numeros es: " + numeros);
        
    }
    
}
