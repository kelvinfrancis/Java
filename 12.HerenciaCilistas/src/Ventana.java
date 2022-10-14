import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(1024,768); // sizes 
        setVisible(true); // present de window
        setFocusable(true); // que sea enfocado en el click
        setLayout(null); 
        setBackground(Color.GREEN);
    }
}
