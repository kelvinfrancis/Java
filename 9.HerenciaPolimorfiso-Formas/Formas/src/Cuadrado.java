public class Cuadrado extends Rectangulo {
  // Investigar que son los constructores y para que se usan en las clases 
  // Aplicar su uso en este proyecto

    public Cuadrado(String nameForma, String color, int coordenada_x, int coordenada_y,int lado){
        super(nameForma,color, coordenada_x, coordenada_y);
        this.lado = lado;
    }

    int lado;

    @Override
    public void Imprimir() {
        System.out.println("Nombre: " + nameForma);
        System.out.println("Color: "+ color);
        System.out.println("Centro: ("+ coordenada_x + "," + coordenada_y + ")");
        System.out.println("Lado: "+ lado);
    }

    @Override
    double CalcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    float CambiarSizes(float factorEscala) {
        float ladoEscalado =  (float) ((Math.pow(lado, 2)) * factorEscala);
        return ladoEscalado;
    }

}
