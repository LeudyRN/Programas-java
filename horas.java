//Inicio de la clase
class horas{

    //Inicio del metodo main
    public static void main(String[] args) {

    //Presentar por consola para introducir la cantidad de horas
    System.out.print("Horas: ");
    //atributo
    int hora = Integer.parseInt(System.console().readLine());
    int segundos = (hora * 3600);
    //Imprimir resultado
    System.out.println("Total de segundos de las horas son: " + segundos);
    }
        
    
}