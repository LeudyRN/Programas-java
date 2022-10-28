//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class divisibles {
    //iniciando metodo main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //atributos
        int a;
        int b;
        //Solicitando numeros
        System.out.print("Ingresa un numero 'a': ");
        a = scanner.nextInt();

        System.out.print("Ingresa un numero 'b': ");
        b = scanner.nextInt();
        //llamando al metodo divisible para la operacion
        divisibles(a);
        System.out.println("----------------------------------");
        divisibles(b);
    }
    //creando metodo divisibles
    public static void divisibles(int n){
        //Atributo
    String s;
    //Sentencias para calcular los divisibles
    for (int i = 2; i <= n; i++) {
        if (i % 2 == 0 && i % 3 != 0){
            s = i + "\nEs divisible por 2, pero no por 3";
        } else if (i % 2 != 0 && i % 3 == 0){
            s = i + "\nEs divisible por 3, pero no por 2";
        } else if (i % 2 != 0 && i % 3 != 0) {
            s = i + "\nNo es divisivle por 2 ni 3";
        } else {
            s = i + "\nEs divisible por 2 y 3";

        }

        System.out.println(s);
    }

    }
    
}
