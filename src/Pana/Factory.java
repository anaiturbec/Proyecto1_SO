package Pana;
import java.util.concurrent.Semaphore;

public class Factory {
    private Storage buttons, arms, legs, bodies;
    private static int buttonsCount, armsCount, legsCount, bodiesCount;
    private static int prodBCount, prodACount, prodLCount, prodBodCount, assemblerCount;
    private int dayTime;
    private int delivery;
    private Producer[] buttonsProd, armsProd, legsProd, bodiesProd;
    private Assembler[] assemblers;
    private Semaphore prodB, prodA, prodL, prodBod, mutexPB, mutexPA, mutexPL, mutexPBod, mutexAB, mutexAA, mutexAL, mutexABod, assB, assA, assL, assBod, timerManager;
    public static int nextPB, nextPA, nextPL, nextPBod, nextAB, nextAA, nextAL, nextABod;
    private Manager manager;
    private Boss boss;
    
    public Factory (int dayTime, int delivery, int buttonStorage, int armStorage, int legStorage, int bodStorage, int buttonsIP, int armsIP, int legsIP, int bodIP, int buttonsMP, int armsMP, int legsMP, int bodMP, int initAss, int maxAss){
        this.prodB = new Semaphore(buttonStorage);
        this.prodA = new Semaphore(armStorage);
        this.prodL = new Semaphore(legStorage);
        this.prodBod = new Semaphore(bodStorage);
        
        this.delivery = delivery;
        
        this.mutexPB = new Semaphore(1);
        this.mutexPA = new Semaphore(1);
        this.mutexPL = new Semaphore(1);
        this.mutexPBod = new Semaphore(1);
        this.mutexAB = new Semaphore(1);
        this.mutexAA = new Semaphore(1);
        this.mutexAL = new Semaphore(1);
        this.mutexABod = new Semaphore(1);
        
        this.assB = new Semaphore(0);
        this.assA = new Semaphore(0);
        this.assL = new Semaphore(0);
        this.assBod = new Semaphore(0);
        
        this.timerManager = new Semaphore(1);
        
        this.nextPB = 0;
        this.nextPA = 0;
        this.nextPL = 0;
        this.nextPBod = 0;
        this.nextAB = 0;
        this.nextAA = 0;
        this.nextAL = 0;
        this.nextABod = 0;
        
        
        this.buttonsCount = 0; 
        this.armsCount = 0; 
        this.legsCount = 0; 
        this.bodiesCount = 0;
        
        this.dayTime = dayTime;
        this.buttons = new Storage(buttonStorage);
        this.arms = new Storage(armStorage);
        this.legs = new Storage(legStorage);
        this.bodies = new Storage(bodStorage);
        this.buttonsProd = new Producer[buttonsMP];
        this.armsProd = new Producer[armsMP];
        this.legsProd = new Producer[legsMP];
        this.bodiesProd = new Producer[bodMP];
        this.assemblers = new Assembler[maxAss];
        
        this.prodBCount = 0;
        this.prodACount = 0;
        this.prodLCount = 0;
        this.prodBodCount = 0;
        
        for(int i =0; i< buttonsIP; i++){
            this.hireBP();
        }
        for(int i =0; i< armsIP; i++){
            this.hireAP();
        }
        for(int i =0; i< legsIP; i++){
            this.hireLP();
        }
        for(int i =0; i< bodIP; i++){
            this.hireBodP();
        }
        for(int i =0; i< initAss; i++){
            this.hireAss();
        }
        
        this.boss = new Boss(this.delivery, this.getHours(8), this.getHours(24-8), this.timerManager);
        this.boss.start();
        
        this.manager = new Manager(this.delivery, this.getHours(8), this.timerManager);
        this.manager.start();
        
        
    }
    
    public int getHours(int hours){
        return (hours * this.dayTime * 1000)/24;
    }
    
    public int getDayTime(){
        return (1000 * this.dayTime);
    }
    
    public boolean hireBP(){
        if(this.prodBCount == this.buttons.getSize()){
            System.out.println("Estan full");
            return false;
        }
        for(int i = 0; i < this.buttonsProd.length; i++){
            if (this.buttonsProd[i] == null){
                this.buttonsProd[i] = new Producer(this.buttons, this.mutexPB, this.prodB, this.assB, this.getDayTime(), 0);
                this.buttonsProd[i].start();
                this.prodBCount++;
                return true;
            }
        }
        return false;
    }
    public boolean hireAP(){
        if(this.prodACount == this.arms.getSize()){
            System.out.println("Estan full");
            return false;
        }
        for(int i = 0; i < this.armsProd.length; i++){
            if (this.armsProd[i] == null){
                this.armsProd[i] = new Producer(this.arms, this.mutexPA, this.prodA, this.assA, this.getDayTime(), 1);
                this.armsProd[i].start();
                this.prodACount++;
                return true;
            }
        }
        return false;
    }
    
    public boolean hireLP(){
        if(this.prodLCount == this.legs.getSize()){
            System.out.println("Estan full");
            return false;
        }
        for(int i = 0; i < this.legsProd.length; i++){
            if (this.legsProd[i] == null){
                this.legsProd[i] = new Producer(this.legs, this.mutexPL, this.prodL, this.assL, this.getDayTime()*2, 2);
                this.legsProd[i].start();
                this.prodLCount++;
                return true;
            }
        }
        return false;
    }
    
    public boolean hireBodP(){
        if(this.prodBodCount == this.bodies.getSize()){
            System.out.println("Estan full");
            return false;
        }
        for(int i = 0; i < this.bodiesProd.length; i++){
            if (this.bodiesProd[i] == null){
                this.bodiesProd[i] = new Producer(this.bodies, this.mutexPBod, this.prodBod, this.assBod, this.getDayTime()*3, 3);
                this.bodiesProd[i].start();
                this.prodBodCount++;
                return true;
            }
        }
        return false;
    }
    
    public boolean hireAss(){
        if(this.assemblerCount == this.assemblers.length){
            System.out.println("Estan full");
            return false;
        }
        for(int i = 0; i < this.assemblers.length; i++){
            if (this.assemblers[i] == null){
                this.assemblers[i] = new Assembler(this.buttons, this.arms, this.legs, this.bodies, this.mutexAB, this.mutexAA, this.mutexAL, this.mutexABod, this.assB, this.assA, this.assL, this.assBod, this.prodB, this.prodA, this.prodL, this.prodBod, this.getDayTime(), this.assemblerCount);
                this.assemblers[i].start();
                this.assemblerCount++;
                return true;
            }
        }
        return false;
    }
    
    public boolean fireBP(){
        
        for(int i = buttonsProd.length-1; i>-1; i--){
            if(buttonsProd[i] != null){
                buttonsProd[i].fire();
                buttonsProd[i] = null;
                return true;
            }
        }
      return false;
    }
    
    public boolean fireAP(){
        
        for(int i = armsProd.length-1; i>-1; i--){
            if(armsProd[i] != null){
                armsProd[i].fire();
                armsProd[i] = null;
                return true;
            }
        }
      return false;
    }
    
    public boolean fireLP(){
        
        for(int i = legsProd.length-1; i>-1; i--){
            if(legsProd[i] != null){
                legsProd[i].fire();
                legsProd[i] = null;
                return true;
            }
        }
      return false;
    }
    
    public boolean fireBodP(){
        
        for(int i = bodiesProd.length-1; i>-1; i--){
            if(bodiesProd[i] != null){
                bodiesProd[i].fire();
                bodiesProd[i] = null;
                return true;
            }
        }
      return false;
    }
    
    public boolean fireAss(){
        for(int i = assemblers.length-1; i>-1; i--){
            if(assemblers[i] != null){
                assemblers[i].fire();
                assemblers[i] = null;
                Factory.rmvAss();
                return true;
            }
        }
      return false;
    }
    
    public int getPBCount(){
        return prodBCount;
    }
    
    public int getPACount(){
        return prodACount;
    }
    public int getPLCount(){
        return prodLCount;
    }
    public int getPBodCount(){
        return prodBodCount;
    }
    public int getAssCount(){
        return assemblerCount;
    }
    public static int getBCount(){
        return buttonsCount;
    }
    public static int getACount(){
        return armsCount;
    }
    public static int getLCount(){
        return legsCount;
    }
    public static int getBodCount(){
        return bodiesCount;
    }
    public static void addBCount(){
        Factory.buttonsCount++;
    }
    public static void addACount(){
        Factory.armsCount++;
    }
    public static void addLCount(){
        Factory.legsCount++;
    }
    public static void addBodCount(){
        Factory.bodiesCount++;
    }
    public static void reduceBCount(){
        Factory.buttonsCount--;
    }
    public static void reduceACount(){
        Factory.armsCount--;
    }
    public static void reduceLCount(){
        Factory.legsCount--;
    }
    public static void reduceBodCount(){
        Factory.bodiesCount--;
    }
    public int getBPSize(){
        return buttonsProd.length;
    }
    public int getAPSize(){
        return armsProd.length;
    }
    public int getLPSize(){
        return legsProd.length;
    }
    public int getBodPSize(){
        return bodiesProd.length;
    }
    public int getAssize(){
        return assemblers.length;
    }
    public static void rmvBP(){
        Factory.prodBCount--;
    }
    public static void rmvAP(){
        Factory.prodACount--;
    }
    public static void rmvLP(){
        Factory.prodLCount--;
    }
    public static void rmvBodP(){
        Factory.prodBodCount--;
    }
    public static void rmvAss(){
        Factory.assemblerCount--;
    }
    
    
    
    
    
    
    
}
