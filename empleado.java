//iniciando clase empleado
class empleado {
    //iniciando el metodo main
public static void main(String[] args) {
//solicitar datos
    System.out.println("Ingrese su salario actualmente: ");
    //atributo
    double salario = Double.parseDouble(System.console().readLine());

//sentencia de if para sacar incremento y descuento
    if (salario > 5){
        salario = salario + (salario*0.15);
    }
    
    System.out.println("Su aumento salarial es de: " + salario);

    if (salario > 5){
        salario = salario - (salario /100) * 8.5 ;

    }
    //impresion en pantalla
    System.out.println("Aplicando los impuestos su sueldo sera de: " + salario);
}    
}
