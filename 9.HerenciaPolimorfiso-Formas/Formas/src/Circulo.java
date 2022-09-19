public class Circulo extends Eclipse {

    public Circulo(String nameForma, String color, int coordenada_x, int coordenada_y) {
        super(nameForma, color, coordenada_x, coordenada_y);
    }
    
    public Circulo(String nameForma, String color, int radio, int coordenada_x, int coordenada_y) {
        super(nameForma, color, coordenada_x, coordenada_y);
        this.radio = radio;
    }


    int radio;

    // imprimir valores de Circulo
    @Override
    public
    void Imprimir() {
        System.out.println("Nombre: " + nameForma);
        System.out.println("Color: "+ color);
        System.out.println("Centro: ("+ coordenada_x + "," + coordenada_y + ")");
        System.out.println("Radio: "+ radio);
    }
    // calcular area de Circulo
    @Override
    double CalcularArea() {
        double area = 3.1416 * (Math.pow(radio, 2));
        return area;
    }

}
