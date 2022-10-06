//Importando scanner para obtener lo solicitado por teclado
import java.util.Scanner;
//Iniciado clase
public class contrasena {
  //iniciando metodo main
    public static void main(String[] args) {
      //atributos
        int passL=8, alta = 0, bajo = 0;
        
        int digitos=0;
        char ch;
        //metodo scanner
        Scanner scanner = new Scanner(System.in);
        //Solicitando contrasena para guardarla en un atributo llamado contra
        System.out.println("Introducir Contrasena: ");
        String contra = scanner.nextLine();
        //nuevo atributo que sera igual a contra.length
        int total =contra.length();
          //ciclo if else para validar 
          if(total < passL){
         System.out.println("La contrasena debe tener al menos 8 caracteres o mas " );
         return;
        }else {
            for (int i=0; i<total; i++){
                ch = contra.charAt(i);
                if(Character.isUpperCase(ch))
                  alta = 2;
                else if(Character.isLowerCase(ch))
                  bajo = 3;
                else if(Character.isDigit(ch))
                 digitos = 3;
            }
        }
        //ciclo if else para saber si fuerte o debil
        if(alta == 2 && bajo == 3 && digitos == 3){
        System.out.println("La contrasena es fuerte");

        }else {
        System.out.println("La contrasena es debil");
        }
    }
}
