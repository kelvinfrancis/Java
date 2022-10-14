public class Velocista extends Ciclista {

    private double potenciaAvg; //en vatios
    private double velocidadAvg; // km/h

    Velocista(int id, String name, float raceTime, double potenciaAvg, double velocidadAvg, TipoCiclista tipo) {
        super(id, name, raceTime, tipo);
        this.potenciaAvg = potenciaAvg;
        this.velocidadAvg = velocidadAvg;
    }


    @Override
    String imprimirTipo() {
        String tipo = "Es un Velocista.";
        return tipo;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Potencia Avg.: "+ potenciaAvg);
        System.out.println("Velocidad Avg.: "+ velocidadAvg);
    }

    public double getPotenciaAvg() {
        return potenciaAvg;
    }

    public void setPotenciaAvg(double potenciaAvg) {
        this.potenciaAvg = potenciaAvg;
    }

    public double getVelocidadAvg() {
        return velocidadAvg;
    }

    public void setVelocidadAvg(double velocidadAvg) {
        this.velocidadAvg = velocidadAvg;
    }

    
}
