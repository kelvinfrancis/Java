public class Contrarrelojista extends Ciclista {
    
   private int velocidadMax; 

    Contrarrelojista(int id, String name, float raceTime,  int velocidadMax, TipoCiclista tipo) {
        super(id, name, raceTime,tipo);
        this.velocidadMax = velocidadMax;
    }


    @Override
    String imprimirTipo() {
        String xxxx = Contrarrelojista.class.getName();
        return "Es un Contrarrelojista." + xxxx;
    }
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Velocidad Max.: "+ velocidadMax);
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
}
