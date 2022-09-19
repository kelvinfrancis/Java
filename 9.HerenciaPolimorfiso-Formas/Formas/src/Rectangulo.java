public class Rectangulo extends Forma {
    int ladoMenor;
	int ladoMayor;
    // constructores
    public Rectangulo(String nameForma, String color, int coordenada_x, int coordenada_y){
        super(nameForma,color, coordenada_x, coordenada_y);
    }
    
    public Rectangulo(String nameForma, String color, int ladoMayor, int ladoMenor, int coordenada_x, int coordenada_y){
        super(nameForma,color, coordenada_x, coordenada_y);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    // Llamamos metodo Imprimir de la case principal Formas
    @Override
    public void Imprimir(){
        System.out.println("Nombre: " + nameForma);
        System.out.println("Color: "+ color);
        System.out.println("Centro: ("+ coordenada_x + "," + coordenada_y + ")");
        System.out.println("Lado mayor: "+ ladoMayor + "\nLado menor: " + ladoMenor );
    }
    // Llamamos Metodo CalcularArea
    @Override
    double CalcularArea(){
        return ladoMenor*ladoMayor;
    }

    int CalcularPerimetro(){
        return (2*ladoMenor) + (2*ladoMayor);
    }

    float CambiarSizes(float factorEscala){
        float perimetroEscalado = ((ladoMayor*2) + (ladoMenor*2)) * factorEscala;
        return perimetroEscalado;
    }

}
