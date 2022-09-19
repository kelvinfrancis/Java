public class Main {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo("Rectangulo","Azul",4,6, 1,2);
        rectangulo.Imprimir();
        System.out.println("Area rectangulo: "+ rectangulo.CalcularArea());
        System.out.println("Perimetro rectangulo: "+ rectangulo.CalcularPerimetro());
        System.out.println("Tamaño escalado a 2: "+rectangulo.CambiarSizes(2)+"\n");

        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Verde",3,4,25);
        cuadrado.Imprimir();
        System.out.println("Area cuadrado: "+ cuadrado.CalcularArea());
        System.out.println("Perimetro cuadrado: "+ cuadrado.CalcularPerimetro());
        System.out.println("Tamaño escalado a 2: "+cuadrado.CambiarSizes(2)+"\n");

        Eclipse eclipse = new Eclipse("Eclipse","Amarillo",8,6,5,6);
        eclipse.Imprimir();;
        System.out.println("Area eclipse: "+ eclipse.CalcularArea()+"\n");

        Circulo circulo = new Circulo("Circulo","Rojo",7,7,8);
        circulo.Imprimir();;
        System.out.println("Area circulo: "+ circulo.CalcularArea()+"\n");

        // Lista de Formas
        Forma[] ListaFormas = new Forma[]{rectangulo,cuadrado,eclipse,circulo};

        // Indicando el mismo color y las mismas coordenadas a cada figura
        for(int i = 0; i < ListaFormas.length; i++){
            ListaFormas[i].CambiarColor("dorado");
            ListaFormas[i].MoverForma(1, 0);
        }  
        // indicar cual es la area maxima e imprimir la info. de esa figura
        double areaMax = ListaFormas[0].CalcularArea();
        for(int i = 0; i < ListaFormas.length; i++){

            boolean verificador = ListaFormas[i].CalcularArea() > areaMax;
            if(verificador){
                areaMax = ListaFormas[i].CalcularArea();
            }
        }
        System.out.println("---- Figura con Area mas Grande ----");
        for(int i = 0; i < ListaFormas.length; i++){
            if(areaMax == ListaFormas[i].CalcularArea()){
                ListaFormas[i].Imprimir();
                System.out.println("Area mas grande: "+ areaMax);
            }
        }
        

    }
}
