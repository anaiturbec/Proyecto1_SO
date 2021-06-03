
package Pana;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;
import java.util.logging.Level;
import Interface.Controller;
import Interface.ControlPanel;

public class Producer extends Thread{
    private Storage storage;
    private Semaphore semaMutex, semaProd, semaAss;
    private int time, type;
    private boolean hired;
    
    public Producer(Storage storage, Semaphore semaMutex, Semaphore semaProd, Semaphore semaAss, int time, int type){
        this.hired = true;
        this.storage = storage;
        this.semaMutex = semaMutex;
        this.semaProd = semaProd;
        this.semaAss = semaAss;
        this.time = time;
        this.type = type;
                
    }
    
    @Override
    public void run(){
        while(this.hired){
            try{
               this.semaProd.acquire();
               Thread.sleep(this.time);
               this.semaMutex.acquire();
               switch(this.type){
                   case 0:
                       this.storage.setVec(Factory.nextPB, 1);
                       Factory.nextPB = (Factory.nextPB  + 1) % this.storage.getSize();
                       
                       Factory.addBCount();
                       break;
                   case 1:
                       this.storage.setVec(Factory.nextPA, 1);
                       Factory.nextPA = (Factory.nextPA + 1) % this.storage.getSize();
                       Factory.addACount();
                       break;
                   case 2:
                       this.storage.setVec(Factory.nextPL, 1);
                       Factory.nextPL = (Factory.nextPL + 1) % this.storage.getSize();
                       Factory.addLCount();
                       break;
                   case 3:
                       this.storage.setVec(Factory.nextPBod, 1);
                       Factory.nextPBod = (Factory.nextPBod + 1) % this.storage.getSize();
                       Factory.addBodCount();
                       break;
                   default:
                       System.out.println("Bug en Producer");
               }
               this.semaAss.release();
               this.semaMutex.release();
            }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        switch(this.type){
            case 0:
                Factory.rmvBP();
                break;
            case 1:
                Factory.rmvAP();
                break;
            case 2:
                Factory.rmvLP();
                break;
            case 3:
                Factory.rmvBodP();
                break;
            default:
                System.out.println("bug en Producer");
        }
    }
    
    public void fire(){
        this.hired = false;
    }
}
