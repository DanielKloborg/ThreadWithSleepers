
public class Sleeper{
	
	public static double sleepInterruptable(double seconds){
		long start = System.currentTimeMillis();
    
		try {
			Thread.sleep((long)(seconds*1000));
		} 
		catch (InterruptedException e){
			// accept interruption
		}

		return((double)System.currentTimeMillis()-start)/1000;
  }
  
  public static double sleep(double seconds){
	  double delta=0;

	  while(delta<seconds){
		  delta += sleepInterruptable(seconds-delta);
	  }
	  
    return delta;  
  }
  
  public static double nap(){
    return sleep(0.1);
  }
  
  public static double sleepRandom(double seconds){
    return sleep(seconds * Math.random());
  }
  
  public static void wait(Object obj){
    try {
      obj.wait();
    } 
    catch (InterruptedException e){
      // ignore
    }
  }
}