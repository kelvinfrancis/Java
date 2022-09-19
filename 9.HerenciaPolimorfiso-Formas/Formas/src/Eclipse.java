public class Eclipse extends Forma {
    // constructor
    public Eclipse(String nameForma, String color, int coordenada_x, int coordenada_y){
        super(nameForma,color, coordenada_x, coordenada_y);
    }

    public Eclipse(String nameForma, String color, int radioMayor, int radioMenor, int coordenada_x, int coordenada_y){
        super(nameForma,color, coordenada_x, coordenada_y);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    int radioMayor;
    int radioMenor;
    //imprimir valores de Eclipse
    public void Imprimir(){
        System.out.println("Nombre: " + nameForma);
        System.out.println("Color: "+ color);
        System.out.println("Centro: ("+ coordenada_x + "," + coordenada_y + ")");
        System.out.println("Radio mayor: "+ radioMayor + "\nRadio menor: " + radioMenor );
    }

    // calcular area de Eclipse
    double CalcularArea(){
        double area = 3.1416 * (radioMayor*radioMenor);
        return area;
    }

}
