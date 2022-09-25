public class Felino extends Animal{

    public Felino(String  sonido, String alimentos, String habitat, String nombreCientifico){
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public String getSonido() {
        return this.sonido;
    }

    @Override
    public String getAlimentos() {
        return this.alimentos;
    }

    @Override
    public String getHabitat() {
        return this.habitat;
    }

    @Override
    public String getNombreCientifico() {
        return this.nombreCientifico;
    }
}
