import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.util.Vector;

public class App {
    
    public static void main(String[] args) throws Exception {

        // EQUIPO CICLISTAS
        Equipo equipo = new Equipo();

        // VENTANA PRINCIPAL
        Ventana windowPrincipal = new Ventana();
        windowPrincipal.setTitle("Tour De France");
        windowPrincipal.setLocationRelativeTo(null);
        windowPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //BOTON VER EQUIPO 
        Boton verTeam = new Boton();
        Tabla tb = new Tabla(equipo);
        verTeam.setText("Ver Equipo");
        verTeam.setLocation(100, 80);
        windowPrincipal.add(verTeam);
        Ventana windowVerEquipo = new Ventana();
        windowVerEquipo.setVisible(false);
        verTeam.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // VENTANA VER EQUIPO
                windowVerEquipo.setVisible(true);
                windowVerEquipo.setTitle("Equipos Registrados");
                windowVerEquipo.setLocationRelativeTo(null);
                windowVerEquipo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // BOTON VOLVER A MENU PRINCIPAL
                Boton volverMenu = new Boton();
                volverMenu.setText("Volver");
                volverMenu.setLocation(860, 80);
                windowVerEquipo.add(volverMenu);
                volverMenu.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        windowVerEquipo.setVisible(false);
                    }
                });
              
                
            }
        });
        windowVerEquipo.add(tb.getTable());
      

        // BOTON AGREGAR CICLISTA
        Boton agregarCiclista = new Boton();
        agregarCiclista.setText("Crear Ciclista");
        windowPrincipal.add(agregarCiclista);
        agregarCiclista.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent action){        

                // VENTANA AGREGAR CICLISTA
                Ventana windowAddCiclista = new Ventana();
                windowAddCiclista.setTitle("Nuevo Ciclista");
                windowAddCiclista.setLocationRelativeTo(null);
                windowAddCiclista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // ID
                JLabel idCiclistaLabel = new JLabel("ID:");
                idCiclistaLabel.setSize(100, 20);
                idCiclistaLabel.setLocation(20, 30);
                windowAddCiclista.add(idCiclistaLabel);
                JTextField tIdClicista = new JTextField();
                tIdClicista.setSize(150, 20);
                tIdClicista.setLocation(135,30);
                windowAddCiclista.add(tIdClicista);

                // NOMBRE
                JLabel nombreCiclistaLabel = new JLabel("Nombre:");
                nombreCiclistaLabel.setSize(100, 20);
                nombreCiclistaLabel.setLocation(20, 60);
                windowAddCiclista.add(nombreCiclistaLabel);
                JTextField tnombreCiclista = new JTextField();
                tnombreCiclista.setSize(150, 20);
                tnombreCiclista.setLocation(135,60);
                windowAddCiclista.add(tnombreCiclista);

                // TIEMPO CARRERA
                JLabel tiempoCarreraLabel = new JLabel("Tiempo en carrera:");
                tiempoCarreraLabel.setSize(120, 20);
                tiempoCarreraLabel.setLocation(20, 90);
                windowAddCiclista.add(tiempoCarreraLabel);
                JTextField tTiempoCarrera = new JTextField();
                tTiempoCarrera.setSize(150, 20);
                tTiempoCarrera.setLocation(135, 90);
                windowAddCiclista.add(tTiempoCarrera);

                // TIPO
                JLabel tipolLabel = new JLabel("Tipo ciclista:");
                tipolLabel.setSize(120, 20);
                tipolLabel.setLocation(20, 120);
                windowAddCiclista.add(tipolLabel);
                Vector<String> elementos = new Vector<String>();
                elementos.addElement("Seleccione los elementos");
                for (TipoCiclista tipo : TipoCiclista.values()) {
                    elementos.addElement(tipo.toString());
                  }

                JComboBox<String> tTipo = new JComboBox<String>(elementos);
                tTipo.setSize(150, 20);
                tTipo.setLocation(135, 120);
                windowAddCiclista.add(tTipo);

                // ACELERACION PROMEDIO
                JLabel aceleracionPromLabel = new JLabel("Aceleracion prom.:");
                aceleracionPromLabel.setSize(120, 20);
                aceleracionPromLabel.setLocation(20, 150);
                windowAddCiclista.add(aceleracionPromLabel);
                JTextField tAceleracionProm = new JTextField();
                tAceleracionProm.setSize(150, 20);
                tAceleracionProm.setLocation(135, 150);
                windowAddCiclista.add(tAceleracionProm);

                // GRADO RAMPA SOPORTADO
                JLabel gradoRampaLabel = new JLabel("Grado de rampa:");
                gradoRampaLabel.setSize(120, 20);
                gradoRampaLabel.setLocation(20, 180);
                windowAddCiclista.add(gradoRampaLabel);
                JTextField tgradoRampa = new JTextField();
                tgradoRampa.setSize(150, 20);
                tgradoRampa.setLocation(135, 180);
                windowAddCiclista.add(tgradoRampa);

                // VELOCIDAD MAXIMA
                JLabel velocidadMaxlLabel = new JLabel("Velocidad maxima:");
                velocidadMaxlLabel.setSize(120, 20);
                velocidadMaxlLabel.setLocation(20, 210);
                windowAddCiclista.add(velocidadMaxlLabel);
                JTextField tVelocidadMax = new JTextField();
                tVelocidadMax.setSize(150, 20);
                tVelocidadMax.setLocation(135, 210);
                windowAddCiclista.add(tVelocidadMax);

                // POTENCIA PROMEDIO
                JLabel potenciaPromLabel = new JLabel("Potencia prom.:");
                potenciaPromLabel.setSize(120, 20);
                potenciaPromLabel.setLocation(20, 240);
                windowAddCiclista.add(potenciaPromLabel);
                JTextField tPotenciaprom = new JTextField();
                tPotenciaprom.setSize(150, 20);
                tPotenciaprom.setLocation(135, 240);
                windowAddCiclista.add(tPotenciaprom);

                // VELOCIDAD PROMEDIO
                JLabel velocidadPromediolLabel = new JLabel("Velocidad prom.:");
                velocidadPromediolLabel.setSize(120, 20);
                velocidadPromediolLabel.setLocation(20, 270);
                windowAddCiclista.add(velocidadPromediolLabel);
                JTextField tVelocidadprom = new JTextField();
                tVelocidadprom.setSize(150, 20);
                tVelocidadprom.setLocation(135, 270);
                windowAddCiclista.add(tVelocidadprom);


                // BOTON VOLVER A MENU PRINCIPAL
                Boton volver = new Boton();
                volver.setText("Volver");
                volver.setLocation(20, 310);
                windowAddCiclista.add(volver);
                volver.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        windowAddCiclista.setVisible(false);
                    }
                });
                // CONDICIONAL DE TIPO
                System.out.println(tTipo.getSelectedItem());
                System.out.println(TipoCiclista.VELOCISTA.toString());
                tTipo.addActionListener (new ActionListener () {
                    public void actionPerformed(ActionEvent e) {
                        if (tTipo.getSelectedItem() == TipoCiclista.VELOCISTA.toString()){

                            // BLOQUEANDO VARIABLES QUE NO SON DE VELOCISTA
                            tAceleracionProm.setEnabled(false);
                            tgradoRampa.setEnabled(false);
                            tPotenciaprom.setEnabled(true);
                            tVelocidadprom.setEnabled(true);
                            tVelocidadMax.setEnabled(false);
        
                       }else if (tTipo.getSelectedItem() == TipoCiclista.ESCALADOR.toString()){
        
                            // BLOQUEANDO VARIABLES QUE NO SON DE ESCALADOR
                            tAceleracionProm.setEnabled(true);
                            tgradoRampa.setEnabled(true);
                            tPotenciaprom.setEnabled(false);
                            tVelocidadprom.setEnabled(false);
                            tVelocidadMax.setEnabled(false);
        
                       }else if (tTipo.getSelectedItem() == TipoCiclista.CONTRARRELOJISTA.toString()){
        
                           // BLOQUEANDO VARIABLES QUE NO SON DE CONTRARRELOJISTA
                           tAceleracionProm.setEnabled(false);
                            tgradoRampa.setEnabled(false);
                            tPotenciaprom.setEnabled(false);
                            tVelocidadprom.setEnabled(false);
                            tVelocidadMax.setEnabled(true);
        
                       }else{
                            tAceleracionProm.setEnabled(true);
                            tgradoRampa.setEnabled(true);
                            tPotenciaprom.setEnabled(true);
                            tVelocidadprom.setEnabled(true);
                            tVelocidadMax.setEnabled(true);
                       }
                    }
                });
             


                // BOTON CREAR CICLISTA
                Boton addCiclista = new Boton();
                addCiclista.setText("Agregar");
                addCiclista.setLocation(180, 310);
                windowAddCiclista.add(addCiclista);
                addCiclista.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Ciclista ciclista = null;
                        if (tTipo.getSelectedItem() == TipoCiclista.VELOCISTA.toString()){
                             ciclista = new Velocista(Integer.parseInt(tIdClicista.getText()), tnombreCiclista.getText(), Float.parseFloat(tTiempoCarrera.getText()), Double.parseDouble(tPotenciaprom.getText()), Double.parseDouble(tVelocidadprom.getText()), TipoCiclista.valueOf((String) tTipo.getSelectedItem()));

                           // equipo.addCiclista(velocista);
                            JOptionPane.showMessageDialog(addCiclista, "Velocista Agregado","Success", JOptionPane.INFORMATION_MESSAGE);

                        }else if (tTipo.getSelectedItem() == TipoCiclista.ESCALADOR.toString()){
                            ciclista = new Escalador(Integer.parseInt(tIdClicista.getText()), tnombreCiclista.getText(), Float.parseFloat(tTiempoCarrera.getText()), Float.parseFloat(tAceleracionProm.getText()), Float.parseFloat(tgradoRampa.getText()), TipoCiclista.valueOf(tTipo.getSelectedItem().toString()));

                           // equipo.addCiclista(escalador);
                            JOptionPane.showMessageDialog(addCiclista, "Escalador Agregado","Success", JOptionPane.INFORMATION_MESSAGE);
                        }else if (tTipo.getSelectedItem() == TipoCiclista.CONTRARRELOJISTA.toString()){
                            ciclista = new Contrarrelojista(Integer.parseInt(tIdClicista.getText()), tnombreCiclista.getText(), Float.parseFloat(tTiempoCarrera.getText()), Integer.parseInt(tVelocidadMax.getText()), TipoCiclista.valueOf(tTipo.getSelectedItem().toString()));

                           // equipo.addCiclista(Contrarrelojista);
                           JOptionPane.showMessageDialog(addCiclista, "Contrarrelojista Agregado","Success", JOptionPane.INFORMATION_MESSAGE);

                        }
                        
                        equipo.addCiclista(ciclista);
                        tb.addData(ciclista);
                        
                   
                    }
                });

            }
        });

    }
}
