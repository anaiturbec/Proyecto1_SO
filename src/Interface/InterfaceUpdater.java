/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Pana.Factory;
import Pana.Boss;
import Pana.Manager;



public class InterfaceUpdater extends Thread{
    private boolean running;
    private ControlPanel cPanel;
    private Factory factory;
    
    public InterfaceUpdater(ControlPanel cPanel, Factory factory){
        this.running = true;
        this.cPanel = cPanel;
        this.factory = factory;
               
    }
    
    @Override
    public void run(){
        while(this.running){
            this.cPanel.qBP.setText(String.valueOf(this.factory.getPBCount()));
            this.cPanel.qAP.setText(String.valueOf(this.factory.getPACount()));
            this.cPanel.qLP.setText(String.valueOf(this.factory.getPLCount()));
            this.cPanel.qBodP.setText(String.valueOf(this.factory.getPBodCount()));
            this.cPanel.deliveryDays.setText(String.valueOf(Boss.getDaysLeft()));
            this.cPanel.timerS.setText(Boss.awake());
            this.cPanel.managerS.setText(Manager.awake());
            this.cPanel.sB.setText(String.valueOf(Factory.getBCount()));
            this.cPanel.sA.setText(String.valueOf(Factory.getACount()));
            this.cPanel.sL.setText(String.valueOf(Factory.getLCount()));
            this.cPanel.sBod.setText(String.valueOf(Factory.getBodCount()));
            this.cPanel.panaDelivery.setText(String.valueOf(Manager.getPanas()));
            this.cPanel.qAss.setText(String.valueOf(this.factory.getAssCount()));
            
            
            
        }
    }
    
  
}
