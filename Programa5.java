import java.util.Scanner;

//Leudy Randy Nolasco
//Matricula: 50576672
//Asignatura: Lenguaje de Programacion II 
//Seccion: INF 5140-Z03
//7/11/2022
//08:56 AM
//Jose Manuel Amado P


class Programa5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       System.out.println("Ingresa hora");
       int h= scanner.nextInt();
       System.out.println("Ingresa minuto");
       int m= scanner.nextInt();
       System.out.println("Ingresa segundo");
       int s= scanner.nextInt();

       if(h < 24 && m < 60 && s < 60){
           if(s < 59 && s >= 0){
           System.out.println(h+"h "+m+"m "+(s+1)+"s");
           }else{
             if(s==59){
                   if(m==59){
                       if(h==23){
                           System.out.println("00h 00m 00s");
                       }else{
                           System.out.println((h+1)+"h 00m 00s");
                       }
                   }else{
                       System.out.println(h+"h "+(m+1)+"m 00s");
                   }
               }
           }
       }else{
           System.out.println("Fuera de Rango");
       }
      }
    
}
