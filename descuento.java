//Inicio de la clase
class descuento {
    //Inicio del metodo main
    public static void main(String[] args) {
         //imprimir por pantalla
        System.out.println("Ingrese el valor del producto de la tienda: ");
        //Atributos
        double valor = Double.parseDouble(System.console().readLine());
        //Sentencia de if para sacar el descuento
        if (valor > 5){
            valor = valor - (valor*0.25);
        }

        System.out.println("La cantidad total a pagar es: " + valor);
    }
}
