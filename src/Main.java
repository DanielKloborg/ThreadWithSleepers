
public class Main {  
  public static void main( String[] argv ) {
    
    ThreadOne tr�d1 = new ThreadOne();
    ThreadTwo tr�d2 = new ThreadTwo();
    
    tr�d1.start();
    tr�d2.start();
    
    //Sleeper.sleepRandom(2);
  }
}          