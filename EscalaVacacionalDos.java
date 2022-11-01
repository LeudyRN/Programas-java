public class EscalaVacacionalDos {


 
     int [] diasVacaciones = new int[7];

    public void setEscalaVacacional(){

     // int [] diasVacaciones = new int[7];
    
        diasVacaciones[0] = 10;
        diasVacaciones[1] = 15;
        diasVacaciones[2] = 15;
        diasVacaciones[3] = 15;
        diasVacaciones[4] = 20;
        diasVacaciones[5] = 20;
        diasVacaciones[6] = 25;
    
    }


    public void muestraDiasVacaciones(){
    
        for(int i = 0; i < diasVacaciones.length; i++){

        System.out.println(" Sus vacaciones son: " + diasVacaciones[i] + " ");

        }
    
    }

    
}
