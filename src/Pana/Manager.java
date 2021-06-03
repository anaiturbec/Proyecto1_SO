
package Pana;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends Thread {
    
    private static boolean awake;
    private int time, delivery;
    private static int panas;
    private Semaphore mutex;
    
    
    public Manager( int delivery, int time, Semaphore mutex){
        this.mutex = mutex;
        this.delivery = delivery;
        this.time = time;
        this.awake = true;
    }
    
    @Override
    public void run(){
        while(true){
            try{
               this.awake = true;
               Thread.sleep(this.time*4-9);
               this.mutex.acquire();
               if(Boss.getDaysLeft()==0){
                   this.panas = 0;
                   Boss.resetDaysLeft(this.delivery);            
               }
               this.awake = false;
               this.mutex.release();
               Thread.sleep(this.time);
            }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String awake(){
        if(Manager.awake){
            return "Despierto";
        }
      return "Durmiendo";
    }
    
    public static int getPanas(){
        return Manager.panas;
    }
    
    public static void addPanas(){
        Manager.panas++;
    }
}
