enum TipoCiclista{VELOCISTA, CONTRARRELOJISTA, ESCALADOR};

public abstract class Ciclista extends Equipo{
    private int id;
    private String name;
    private float raceTime = 0;
    private TipoCiclista tipo;


    //Constructor
    Ciclista(int id, String name, float raceTime, TipoCiclista tipo){
        this.id = id;
        this.name = name;
        this.raceTime = raceTime;
        this.tipo = tipo;
    }

    abstract String imprimirTipo();

    public void imprimirInfo(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Race Time: "+ raceTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(float raceTime) {
        this.raceTime = raceTime;
    }

    public TipoCiclista getTipoCiclista(){
        return tipo;
    }

    public void setTipo(TipoCiclista tipo){
        this.tipo = tipo;
    }

    
}
