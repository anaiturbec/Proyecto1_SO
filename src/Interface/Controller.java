
package Interface;


import Pana.Factory;


public class Controller {
    public Factory factory;
    private ControlPanel cPanel;
    private InterfaceUpdater iThread;
    
    public Controller(){
        this.cPanel = new ControlPanel(this);
        
    }
    
    
    public void startMattel(int dayTime, int delivery, int buttonStorage, int armStorage, int legStorage, int bodStorage, int buttonsIP, int armsIP, int legsIP, int bodIP, int buttonsMP, int armsMP, int legsMP, int bodMP, int initAss, int maxAss){
        this.factory = new Factory(dayTime, delivery, buttonStorage, armStorage, legStorage, bodStorage, buttonsIP, armsIP, legsIP, bodIP, buttonsMP, armsMP, legsMP, bodMP, initAss, maxAss);
        
        this.iThread = new InterfaceUpdater(this.cPanel, this.factory);
        this.iThread.start();
        
        this.cPanel.setVisible(true);
    }
    
    
}
