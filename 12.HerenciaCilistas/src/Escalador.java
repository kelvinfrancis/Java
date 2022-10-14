public class Escalador extends Ciclista {
    private float aceleracionAvg; // (m/s^2)
    private float gradoRampaSoportada;// (grado)

    Escalador(int id, String name, float raceTime, float aceleracionAvg, float gradoRampaSoportada, TipoCiclista tipo) {
        super(id, name, raceTime, tipo);
        this.aceleracionAvg = aceleracionAvg;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }
 

    @Override
    String imprimirTipo() {
        String tipo = "Es un Escalador.";
        return tipo;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Aceleracion Avg.: "+ aceleracionAvg);
        System.out.println("Grado de rampa soportada: "+ gradoRampaSoportada);
    }

    public float getAceleracionAvg() {
        return aceleracionAvg;
    }

    public void setAceleracionAvg(float aceleracionAvg) {
        this.aceleracionAvg = aceleracionAvg;
    }

    public float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }
    
}
