import javax.swing.JFrame; // libreria para presentar una pantalla (pop up a window like an app)
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {

    public ArrowKeys(){
        JFrame frame = new JFrame(); // call the window
        frame.setVisible(true); // present de window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tells swing to close de windows
        frame.setSize(400,400); // windows dimentions
        frame.setFocusable(true); // que sea enfocado en el click

        JPanel panel = new JPanel();
        JLabel up = new JLabel(); // flecha arriba
        JLabel down = new JLabel(); // flecha abajo
        JLabel left = new JLabel(); //flecha izquierda
        JLabel right = new JLabel(); // flecha derecha

        panel.add(up); // agregamos up a la pantalla
        panel.add(down); // agregamos down a la pantalla
        panel.add(left); // agregamos left a la pantalla
        panel.add(right); // agregamos right a la pantalla

        // texto que muestra cada boton en la pantalla
        up.setText("Up: 0 ");
        down.setText("Down: 0 ");
        left.setText("Left: 0 ");
        right.setText("Right: 0 ");

        frame.addKeyListener(new KeyListener(){ // para detectar las teclas cuando se presionen
            
            // variables para guardar el conteo de cada flecha presionada
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void keyPressed(KeyEvent e){ // detecta las teclas al presionar
               int keyCode = e.getKeyCode();
               switch(keyCode){ //creamos un switch de casos probables 
                    case KeyEvent.VK_UP: // caso cuando presiona flecha arriba hara lo siguiente
                        up.setText("Up: " + Integer.toString(upCount++)); // guarda conteo de la flecha arriba cuando se presiona
                        break;
                    case KeyEvent.VK_DOWN: // caso cuando presiona flecha abajo hara lo siguiente
                        down.setText("Down: " + Integer.toString(downCount++)); // guarda conteo de la flecha abajo cuando se presiona
                        break;
                    case KeyEvent.VK_LEFT: // caso cuando presiona flecha izquierda hara lo siguiente
                        left.setText("Left: " + Integer.toString(leftCount++)); // guarda conteo de la flecha izquierda cuando se presiona
                        break;
                    case KeyEvent.VK_RIGHT: // caso cuando presiona flecha derecha hara lo siguiente
                        right.setText("Right: " + Integer.toString(rightCount++)); // guarda conteo de la flecha derecha cuando se presiona
                        break;
               }
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub  
            }

        });

        frame.add(panel); // agregamos panel a frame(la pantalla)
    }
    public static void main(String[] args) {
        
        new ArrowKeys();
    }
}
