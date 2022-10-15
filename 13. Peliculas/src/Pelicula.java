public class Pelicula{
    private String nombrePelicula;
    private String director;
    enum TipoGenero {ACCION, COMEDIA, DRAMA, SUSPENSO}
    private TipoGenero genero;
    private int duracion; // en minutos
    private int year;
    private double calificacion;

    Pelicula(String nombrePelicula, String director, TipoGenero genero, int duracion, int year, double calificacion){

        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.year = year;
        this.calificacion = calificacion;
    }

    public void imprimirPublico(){
        System.out.println("Nombre pelicula: "+ nombrePelicula);
        System.out.println("Director: "+ director);
        System.out.println("Genero: "+ genero);
        System.out.println("Duracion de pelicula: "+ duracion);
        System.out.println("Año de lanzamiento: "+ year);
        System.out.println("Calificacion: "+ calificacion);
    }

    public boolean esPeliculaEpica(){
        if(duracion >= 180){
            System.out.println("Es epica");
            return true;
        }else{
            System.out.println("No es epica");
            return false;
        }
    }

    public String calcularValoracion(){
        if (calificacion <= 2){
            return "Muy mala";
        }else if (calificacion > 2 && calificacion <= 5){
            return "Mala";
        }else if (calificacion > 5 && calificacion <= 7){
            return "Regular";
        }else if (calificacion > 7 && calificacion <= 8){
            return "Buena";
        }else if(calificacion > 8 && calificacion <= 10){
            return "Excelente";
        }
        return null;
    }

    public boolean esSimilar(Pelicula pelicula2){
        if (this.genero == pelicula2.genero && this.calificacion == pelicula2.calificacion){
            System.out.println("Son similares");
            return true;
        }else{
            System.out.println("No son similares");
            return false;
        }
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

}