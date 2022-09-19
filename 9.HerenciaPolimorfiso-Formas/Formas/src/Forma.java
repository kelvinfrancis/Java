public class Forma {
    //Atributes
    String nameForma;
    String color;
	int coordenada_x;
    int coordenada_y;

    public Forma(String nameForma, String color, int coordenada_x, int coordenada_y){
        this.nameForma = nameForma;
        this.color = color;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    //Metodos
    public void Imprimir(){
        System.out.println("Lol");
    }

	void CambiarColor(String color){
        this.color = color;
    }

    void MoverForma(int coordenada_x, int coordenada_y ){
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    double CalcularArea(){
        return 0;
    }


}
