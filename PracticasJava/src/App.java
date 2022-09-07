public class App {
    public static void main(String[] args) throws Exception {


        clasePersona persona1 = new clasePersona();
        persona1.nombre = "Kelvin";
        persona1.apellido = "Moquete";
        persona1.id = 1;
        persona1.year = 1997;

        clasePersona persona2 = new clasePersona();
        persona2.nombre = "Alicia";
        persona2.apellido = "Polanco";
        persona2.id = 2;
        persona2.year = 1998;

        System.out.println(persona1);
        System.out.println(persona2);

    }
}
