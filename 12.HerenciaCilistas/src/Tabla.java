import java.awt.Point;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla {
    DefaultTableModel tableModel;
    
    private String [] nombreColumnas = {"ID", "Name", "Race Time", "Type", "Aceleration Avg.", "Ramp grade", "Max Speed", "Power Avg.", "Speed Avg."};
    JTable table ;
    Equipo droga;
    public Tabla(Equipo equipo){
        tableModel = new DefaultTableModel(nombreColumnas, 0);
        tableModel.addRow(nombreColumnas);
        table = new JTable(tableModel);
        table.setSize(800, 800);
        table.setLocation(new Point(50,25));
        //addData(equipo);
    
    }   

    public void refreshTable(Equipo equipo){
        tableModel = new DefaultTableModel(nombreColumnas, 0);
        for(Ciclista ciclista: equipo.getCiclistas()){
            addData(ciclista);
        }
    }

    public JTable getTable(){
        return this.table;
    }

    public void addData(Ciclista ciclista) {
        if (ciclista.getTipoCiclista() == TipoCiclista.VELOCISTA){
            Object[] cilistaDetails = {ciclista.getId(), ciclista.getName(), ciclista.getRaceTime(), ciclista.getTipoCiclista(), null, null, null, ((Velocista)ciclista).getPotenciaAvg(), ((Velocista)ciclista).getVelocidadAvg()};

            tableModel.addRow(cilistaDetails);

       }else if (ciclista.getTipoCiclista() == TipoCiclista.ESCALADOR){
            Object[] cilistaDetails = {ciclista.getId(), ciclista.getName(), ciclista.getRaceTime(), ciclista.getTipoCiclista(), ((Escalador) ciclista).getAceleracionAvg(), ((Escalador)ciclista).getGradoRampaSoportada(), null, null, null};

            tableModel.addRow(cilistaDetails);

       }else if (ciclista.getTipoCiclista() == TipoCiclista.CONTRARRELOJISTA){
            Object[] cilistaDetails = {ciclista.getId(), ciclista.getName(), ciclista.getRaceTime(), ciclista.getTipoCiclista(), null, null, ((Contrarrelojista)ciclista).getVelocidadMax(), null, null};

            tableModel.addRow(cilistaDetails);

       }
        

    }
}
