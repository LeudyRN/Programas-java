//Iniciando clase Carro
public class Carro {
   //Atributos
    String marca;
    String modelo;
    String  color;
    int puertas;
    String matricula;
    //Constructor
    public Carro(){
    marca = "";
    modelo = "";
    color = "";
    matricula = "";

    }
    //Metodo Carro con parametros
    public Carro(String marca, String modelo, String color, int puertas, String matricula){
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.puertas = puertas;
    this.matricula = matricula;
    }

}