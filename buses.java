//importando libreria Scanner
import java.util.Scanner;
//iniciando clase
class buses {
    //iniciando metodo main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //atributos
        double cobro = 150;
        double kilometros;
        double personas;

        //Solicitando datos y almacenando
        System.out.print("Cuantas personas van en el viaje: ");
        personas = scanner.nextDouble();

        System.out.print("Cantidad de kilometros a recorrer: ");
        kilometros = scanner.nextDouble();

        //Sentencia para calcular monto y descuento
       
        if (kilometros > 100){
    
           cobro = (cobro * 5);

        } 
        
        else if (kilometros > 200){

           cobro = cobro - (cobro * 0.5);

        } else if (personas >= 4){

           cobro = cobro - (cobro * 0.10);

        }else {

            System.out.println("Error...");
        }

        //imprimir resultados

        System.out.print("Total a pagar por el viaje es: " + cobro);
    }
}
