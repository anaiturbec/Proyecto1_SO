
package Pana;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interface.ControlPanel;
       

public class Assembler extends Thread{
    Storage storageB, storageA, storageL, storageBod;
    Semaphore semMEB, semMEA, semMEL, semMEBod, assB, assA, assL, assBod, prodB, prodA, prodL, prodBod;
    int time;
    boolean hired;
    private static int assemblerCount;
    
    public Assembler(Storage storageB, Storage storageA, Storage storageL, Storage storageBod, Semaphore semMEB, Semaphore semMEA, Semaphore semMEL, Semaphore semMEBod, Semaphore assB, Semaphore assA, Semaphore assL, Semaphore assBod, Semaphore prodB, Semaphore prodA, Semaphore prodL, Semaphore prodBod, int time, int assemblerCount){
        this.storageB = storageB;
        this.storageA = storageA;
        this.storageL = storageL;
        this.storageBod = storageBod;
        
        this.semMEB = semMEB;
        this.semMEA = semMEA;
        this.semMEL = semMEL;
        this.semMEBod = semMEBod;
        
        this.assB = assB;
        this.assA = assA;
        this.assL = assL;
        this.assBod = assBod;
        
        this.prodB = prodB;
        this.prodA = prodA;
        this.prodL = prodL;
        this.prodBod = prodBod;
        
        this.time = time;
        this.hired = true;
        
    }
    
    @Override
    public void run(){
        while(this.hired){
            try{
                this.assB.acquire(8);
                this.assA.acquire(2);
                this.assL.acquire(2);
                this.assBod.acquire();
                
                this.semMEB.acquire();
                for(int i=0; i<8; i++){
                    this.storageB.setVec(Factory.nextPB, 0);
                    Factory.nextPB = (Factory.nextPB + 1) % this.storageB.getSize();
                    Factory.reduceBCount();
                }
                
                this.semMEB.release();
                
                this.semMEA.acquire();
                for(int i=0; i<2; i++){
                    this.storageA.setVec(Factory.nextPA, 0);
                    Factory.nextPA = (Factory.nextPA + 1) % this.storageA.getSize();
                    Factory.reduceACount();
                }                
                this.semMEA.release();
                
                this.semMEL.acquire();
                for(int i=0; i<2; i++){
                    this.storageL.setVec(Factory.nextPL, 0);
                    Factory.nextPL = (Factory.nextPL + 1) % this.storageL.getSize();
                    Factory.reduceLCount();
                }
                this.semMEL.release();
                
                
                this.semMEBod.acquire();
                for(int i=0; i<1; i++){
                    this.storageBod.setVec(Factory.nextPBod, 0);
                    Factory.nextPBod = (Factory.nextPBod +1)% this.storageBod.getSize();
                    Factory.reduceBodCount();
                }
                
                this.semMEBod.release();
                
                this.prodB.release(8);
                this.prodA.release(2);
                this.prodL.release(2);
                this.prodBod.release();
                
                this.buildPana();
                
            }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void buildPana(){
        try{
            
            Thread.sleep(this.time);
            Manager.addPanas();
            
            
            
            
        }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
       return;
    }
    
    public void fire(){
        this.hired = false;
    }
    
}
