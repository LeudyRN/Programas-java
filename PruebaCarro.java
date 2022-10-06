//Iniciando clase 
public class PruebaCarro {

    //iniciando metodo main
    public static void main(String[]args){
        //Utilizando la clase Carro
        Carro micarro = new Carro();
        //atributos
       String marca = "Chevrolet ", modelo = "Camaro del 2019", color = "Negro",  matricula = "P-49087";
       int puertas = 2;
       //imprimir por pantalla
       System.out.println("La marca de su vehiculo es: " + marca);
       System.out.println("Su modelo es: " + modelo);
       System.out.println("Del color: " + color);
       System.out.println("Cantidad de puertas: " + puertas);
       System.out.println("Su matricula es: " + matricula);
    }
   
}
