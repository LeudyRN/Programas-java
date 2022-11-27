import java.util.Scanner;

class Programa9 {
   
    

    public static void main(String[] args) {
        
        int c,pl,cl,resul,acum=0; 
        
        
        Scanner scanner=new Scanner (System.in);
        
        for(c=1;c<=5;c++){
            
            System.out.println("ingrese el precio por litro ");
            pl=scanner.nextInt();
            System.out.println("ingrese la cantidfad  en litro  ");
            cl=scanner.nextInt();resul=pl*cl;
            System.out.println("el valo de la venta es  $: "+resul);
            System.out.println("el codigo del articulo es:"+c);
            
            if (resul>=601){System.out.println("el valor de la factura es mas de $600 dolares \n  ");
            acum=acum+1;
        
        }System.out.println("-------------------------------------");
    }
    
    System.out.println("las facturas que tubieron el  valor de mas de $600 dolares son:"+acum);
}

}