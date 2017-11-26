package ghost;

public class Controller {
    java.awt.Point mouse_pos;
    Player p;
    
    Controller(javax.swing.JFrame f){
        
        mouse_pos = new java.awt.Point(0, 0);
        p = new Player(this);
        
        
    }
}
