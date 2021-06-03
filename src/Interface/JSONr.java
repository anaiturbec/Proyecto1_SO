package Interface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



 
public class JSONr {

    public JSONr() {
        
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader("config.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            int dayTime = Integer.parseInt((String) jsonObject.get("dayTime"));
            int delivery = Integer.parseInt((String) jsonObject.get("delivery"));
            int buttonStorage = Integer.parseInt((String) jsonObject.get("buttonStorage"));
            int armStorage = Integer.parseInt((String) jsonObject.get("armStorage"));
            int legStorage = Integer.parseInt((String) jsonObject.get("legStorage"));
            int bodStorage = Integer.parseInt((String) jsonObject.get("bodStorage"));
            int buttonsIP = Integer.parseInt((String) jsonObject.get("buttonsIP"));
            int legsIP = Integer.parseInt((String) jsonObject.get("legsIP"));
            int armsIP = Integer.parseInt((String) jsonObject.get("armsIP"));
            int bodIP = Integer.parseInt((String) jsonObject.get("bodIP"));
            int buttonsMP = Integer.parseInt((String) jsonObject.get("buttonsMP"));
            int legsMP = Integer.parseInt((String) jsonObject.get("legsMP"));
            int armsMP = Integer.parseInt((String) jsonObject.get("armsMP"));
            int bodMP = Integer.parseInt((String) jsonObject.get("bodMP"));
            int initAss = Integer.parseInt((String) jsonObject.get("initAss"));
            int maxAss = Integer.parseInt((String) jsonObject.get("maxAss"));
            
            if(dayTime <= 0 || 
                delivery <= 0 ||
                buttonStorage <= 0 ||
                armStorage <= 0 ||
                legStorage <= 0 ||
                bodStorage <= 0 ||
                buttonsIP < 0 ||
                armsIP < 0 ||
                legsIP < 0 ||
                bodIP < 0 ||
                buttonsMP <= 0 ||
                armsMP <= 0 ||
                legsMP <= 0 ||
                bodMP <= 0 ||             
                initAss < 0 ||
                maxAss <= 0){
                throw new Exception("Hay una o más propiedades menores o iguales a 0."); 
            }
            
            if(buttonsIP > buttonsMP || armsIP > armsMP || legsIP > legsMP || bodIP > bodMP || initAss > maxAss){
                throw new Exception("La cantidad inicial no puede ser mayor que la máxima");
            }
            
            Controller controller = new Controller();
            controller.startMattel(dayTime, delivery, buttonStorage, armStorage, legStorage, bodStorage, buttonsIP, armsIP, legsIP, bodIP, buttonsMP, armsMP, legsMP, bodMP, initAss, maxAss);
            
            
            
        } catch (Exception e) {
            if(e instanceof FileNotFoundException){
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            }else if (e instanceof NumberFormatException){
                JOptionPane.showMessageDialog(null, "El archivo tiene una propiedad que no es un int o está vacía.");
            }
            else{
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

}




