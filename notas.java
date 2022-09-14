
//Inicio de la clase
class notas {
    //inicio del metodo main
    public static void main(String[] args) {

        //Solicitando datos por pantalla
        System.out.println("Ingresar la primera calificacion del primer examen parcial: ");
        //atributo
        double examenparcial1 = Double.parseDouble(System.console().readLine());
        //Solicitando datos por pantalla
        System.out.println("Ingresar la segunda calificacion del segundo examen parcial: ");
        //atributo
        double examenparcial2 = Double.parseDouble(System.console().readLine());
        //Solicitando datos por pantalla
        System.out.println("Ingresar la tercera calificacion del tercer examen parcial: ");
        //atributo
        double examenparcial3 = Double.parseDouble(System.console().readLine());
        //Solicitando datos por pantalla
        System.out.println("Ingresar la calificacion del examen final: ");
        //atributo
        double examenFinal = Double.parseDouble(System.console().readLine());
        //Solicitando datos por pantalla
        System.out.println("Ingresar la calificacion del trabajo final: ");
        //atributo        
        double trabajoFinal = Double.parseDouble(System.console().readLine());
        //Solicitando datos por pantalla
        System.out.println("Ingresar los puntos de calificacion: ");
        //atributo        
        double participacion = Double.parseDouble(System.console().readLine());

        //atributos y calculo de porcentajes para sacar la calificacion final total
        double promedio = (examenparcial1 + examenparcial2 + examenparcial3)/3; 
        double porciento1 = (promedio / 100) * 45;

        double porciento2 = (examenFinal /100) * 25;
        double porciento3 = (trabajoFinal /100) * 20;
        double porciento4 = (participacion /100) * 10;

        double CalificacionFinal = (porciento1 + porciento2 + porciento3 + porciento4);
        //imprimiendo los datos
        System.out.println("Su calificacion final es: " + CalificacionFinal);
    }
}
