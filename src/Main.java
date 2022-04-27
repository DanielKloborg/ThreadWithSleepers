
public class Main {  
  public static void main( String[] argv ) {
    
    ThreadOne tråd1 = new ThreadOne();
    ThreadTwo tråd2 = new ThreadTwo();
    
    tråd1.start();
    tråd2.start();
    
    //Sleeper.sleepRandom(2);
  }
}          