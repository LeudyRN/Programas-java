//Inicio de la clase
class producto {
    
    //inicio del metodo main
    public static void main(String[] args) {

        //Imprimir por pantalla
        System.out.println("Ingrese el precio del producto a pagar: ");
        //atributos
        double precio = Double.parseDouble(System.console().readLine());
        //imprimir por pantalla
        System.out.println("Ingrese el monto con el que pagara: ");
        //atributos
        double monto = Double.parseDouble(System.console().readLine());
        double cambio = (monto - precio);
         
        //Sentencia de if para determinar diferentes casos
        if (monto < precio){

            System.out.println("No se pudo realizar la compra\nNo cuenta con dinero suficiente....");

        } else {

            System.out.println("Su pago se ha realizado");
        }

        if (monto > precio){

            System.out.println("Su cambio es de: " + cambio);
        }

    }
}
