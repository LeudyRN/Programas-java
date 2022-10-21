public class Dice {

    int diceNumber1 = 0;
    int diceNumber2 = 0;
    int control = 1;
    
    public void throwDice(){

      do{
        System.out.println("Lanzando dados... ");
        diceNumber1 = (int)( Math.random()*6 + 1 );
        diceNumber2 = (int)( Math.random()*6 + 1 );
        System.out.println(diceNumber1 + " y " + diceNumber2);

        control++;
      }
      
      while (control < 11);
        

    }

}

