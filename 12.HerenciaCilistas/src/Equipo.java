import java.util.ArrayList;

public class Equipo {
    private String nameTeam;
    private static float sumTotalTeam; // in minutes
    private String nameCountry;
    private ArrayList<Ciclista> ciclistas; // lista de ciclistas
    
    public Equipo(){
        ciclistas = new ArrayList<Ciclista>();
    }

    public  ArrayList<Ciclista> getCiclistas()
    {
        return this.ciclistas;
    }

    public void listarCiclistas(){ // imprime los nombres de los ciclistas de un equipo
        for (Ciclista ciclista : ciclistas) {
           System.out.println(ciclista.getId());
           System.out.println(ciclista.getName());
           System.out.println(ciclista.getRaceTime());
           System.out.println(ciclista.getName());
           if (ciclista.getClass() == Escalador.class) {// casting to a specific class makes world better 
                System.out.println(((Escalador) ciclista).getGradoRampaSoportada());
                System.out.println(((Escalador) ciclista).getAceleracionAvg());
            }else if(ciclista.getClass() == Contrarrelojista.class){
                System.out.println(((Contrarrelojista) ciclista).getVelocidadMax());
            }else if(ciclista.getClass() == Velocista.class){
                System.out.println(((Velocista) ciclista).getPotenciaAvg());
                System.out.println(((Velocista) ciclista).getVelocidadAvg());
                
            }

        }
    }

    public void identCiclista(int id){
        
        for (Ciclista ciclista : ciclistas) {
            if(ciclista.getId() == id){
                ciclista.imprimirInfo();
                return;
            }

        }
        System.out.println("No está!");
    }

    public void remove(int id){
        System.out.println(ciclistas.size());
        for (Ciclista ciclista : ciclistas) {
            if(ciclista.getId() == id){
                ciclistas.remove(ciclista);
            }

        }
    }
    public void calcularTotalTiemposEquipo(){

        for (Ciclista it : ciclistas) { // For each como el python :D
            sumTotalTeam+=it.getRaceTime();
        }

        System.out.println("Tiempo del equipo: "+ sumTotalTeam + " minutos.");  
    }
    // add ciclista a un equipo
    public void addCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);
    }

    // Imprimir datos del Team
    public void imprimirTeam(){
        System.out.println("Team Name: "+ nameTeam);
        System.out.println("Total race time: "+ sumTotalTeam);
        System.out.println("Team Country: "+ nameCountry);
    }
    // Name
    public String getNameTeam() {
        return nameTeam;
    }
    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    // SumTotal Team
    public static float getSumTotalTeam() {
        return sumTotalTeam;
    }
    public static void setSumTotalTeam(float sumTotalTeam) {
        Equipo.sumTotalTeam = sumTotalTeam;
    }

    // Country
    public String getNameCountry() {
        return nameCountry;
    }
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    
}
