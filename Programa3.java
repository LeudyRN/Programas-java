//Leudy Randy Nolasco
//Matricula: 50576672
//Asignatura: Lenguaje de Programacion II 
//Seccion: INF 5140-Z03
//5/11/2022
//07:05 PM
//Jose Manuel Amado P

import java.util.Scanner;

class Programa3 {
      
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        int numeros[];
        
        numeros = new int[5];

        for (int i = 1; i < 5; i++){

            System.out.print("Introduce 5 numeros: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los numeros son: ");
        for (int i = 0; i < 5; i++){
            System.out.println(numeros[i]);
        }
        

        inverso();
        media();
        nume();
        noMorir();
    }


    public static void inverso(){

        Scanner scanner = new Scanner( System.in );
		int t[]=new int[5];

		 for (int i=0;i<5;i++)
		 {
		 System.out.print("Introduzca un número: ");
		 t[i]=scanner.nextInt();
		 }

		 System.out.println("Los números (en orden inverso):");
		 for (int i=4;i>=0;i--)
		 System.out.println(t[i]);
    }


    public static void media(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int pos = 0, neg = 0, cero = 0; 
        int i;
       
                                                    
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = scanner.nextInt();
        }
  
        
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
  
        
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }


    public static void nume(){
   
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c;

        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        a = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        b = scanner.nextInt();
        System.out.print("Ingrese numero 3: ");
        c = scanner.nextInt(); 

        if(a>b) {
            if(a>c) {
                if(b>c) {
                    System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
                    System.out.println("Orden descendente: " + a + " " + b + " " + c);                 
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            }else {
                System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        }else {
            if(b>c) {
                if(a>c) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }              
            }else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }

    }
}


  public static void noMorir(){

    Scanner teclado = new Scanner( System.in );

		int i, t[];

		 t = new int[10];

		for (i=0;i<10;i++){

		 System.out.print("Introduzca numero: ");
		 t[i]=teclado.nextInt();

		}


		 System.out.println("El resultado es:");

		 for (i=0;i<=4;i++){

		 System.out.println (t[i]); 
		 System.out.println(t[9-i]); 

		 }
  }

}