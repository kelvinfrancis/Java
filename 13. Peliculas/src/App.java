public class App {
    public static void main(String[] args) throws Exception {
        
        Pelicula HarryPoter = new Pelicula("Harry Potter y la piedra filosofal", "Chris Columbus", Pelicula.TipoGenero.ACCION, 152, 2001, 9.2);

        Pelicula TheBatman = new Pelicula("The Batman", "Matt Reeves", Pelicula.TipoGenero.ACCION, 176, 2022, 7.9);

        HarryPoter.imprimirPublico();
        TheBatman.imprimirPublico();

        HarryPoter.esPeliculaEpica();
        TheBatman.esPeliculaEpica();

        System.out.println(HarryPoter.calcularValoracion());
        System.out.println(TheBatman.calcularValoracion());

        HarryPoter.esSimilar(TheBatman);
    }
}
