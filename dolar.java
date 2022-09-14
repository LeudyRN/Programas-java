//inicio de la classe
class dolar{
    //inicio del metodo main
    public static void main(String[] args) {

        //Imprimir por consola 

        System.out.println("Introducir la cantidad de dolares a cambiar: ");
        //atributos
        
        double cantidad = Double.parseDouble(System.console().readLine());
        double valor = (cantidad * 53.64);
        //imprimir resultado
        System.out.println("El cambio de dolares a pesos dominicanos es: " + valor) ;


        
    }
}