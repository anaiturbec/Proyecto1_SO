
package Pana;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Boss extends Thread{
    private static int daysLeft;
    private int workTime, restTime;
    private Semaphore mutex;
    private static boolean awake;
    
    public Boss(int daysLeft, int workTime, int restTime, Semaphore mutex){
        this.daysLeft = daysLeft;
        this.workTime = workTime;
        this.restTime = restTime;
        this.mutex = mutex;
        this.awake = false;
        
    }
    
    @Override
    public void run(){
        while(true){
            try{
                this.mutex.acquire();
                this.awake = true;
                Thread.sleep(workTime);
                this.daysLeft--;
                
                this.awake = false;
                this.mutex.release();
                Thread.sleep(restTime);
            }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static int getDaysLeft(){
        return Boss.daysLeft;
    }
    
    public static void resetDaysLeft(int delivery){
        Boss.daysLeft = delivery;
    }
    
    public static String awake(){
        if(Boss.awake){
            return "Trabajando";
        }
      return "Descansando";
    }
}
