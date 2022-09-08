public class App {
    public static void main(String[] args) throws Exception {
/*  System.out.println("Hello, World!");

        //Ejemplo de instancia de clase Perro
        Perro abelito = new Perro();     // Asignando clase (planilla) a la variable "abelito"
        abelito.nombre = "Abel";
        abelito.raza = "Puddle";
        abelito.correr();
        abelito.ladrar();
        System.out.println(abelito.raza);

        Perro tito = new Perro();
        tito.nombre = "Tito";
        tito.raza = "Chihuahua";
        tito.correr();
        tito.ladrar();
        System.out.println(tito.raza); 
        */
        Carro carro1 = new Carro();
        carro1.type = "Sedán";
        carro1.brand = "BMW";
        carro1.color = "White";
        carro1.year = 2020;
        carro1.country = "USA";
        System.out.println(carro1);

        Carro carro2 = new Carro();
        carro2.type = "Sedán";
        carro2.brand = "Honda";
        carro2.color = "Morado";
        carro2.year = 2022;
        carro2.country = "USA";

        Carro carro3 = new Carro();
        carro3.type = "Coupe";
        carro3.brand = "Nissan";
        carro3.color = "azul";
        carro3.year = 2021;
        carro3.country = "USA";

        Carro carro4 = new Carro();
        carro4.color = "negro";
        carro4.country = "USA";
        Carro carro5 = new Carro();
        carro5.color = "negro";
        carro5.country = "Chile";
        Carro carro6 = new Carro();
        carro6.color = "negro";
        carro6.country = "Republica Dominicana";
        Carro carro7 = new Carro();
        carro7.color = "negro";
        carro7.country = "Korea";
        Carro carro8 = new Carro();
        carro8.color = "negro";
        carro8.country = "USA";
        Carro carro9 = new Carro();
        carro9.color = "rojo";
        carro9.country = "Germani";
        Carro carro10 = new Carro();
        carro10.color = "azul";
        carro10.country = "France";
        Carro carro11= new Carro();
        carro11.color = "azul";
        carro11.country = "Italy";
        Carro carro12 = new Carro();
        carro12.color = "verde";
        carro12.country = "USA";
        Carro carro13 = new Carro();
        carro13.color = "morado";
        carro13.country = "Spain";
        Carro carro14 = new Carro();
        carro14.color = "blanco";
        carro14.country = "USA";
        Carro carro15 = new Carro();
        carro15.color = "rojo";
        carro15.country = "Japan";

        Carro[] ArregloCarros = {carro1,carro2,carro3,carro4,carro5,carro6,carro7,carro8,carro9,carro10,carro11,carro12,carro13,carro14,carro15}; 
        int i = 0;
        while(i <= ArregloCarros.length){
            int n = i+1;
            System.out.println("El vehiculo numero "+ n +" es del pais "+ ArregloCarros[i].country);
            if(ArregloCarros[i].color == "negro"){
                System.out.println("Tiende a ensuciarse mucho");
            }
            i++;
        }


        // int[] numeros = {1,2,3,4,5}; //Arreglo de numeros enteros
        // String[] letras = {"Hola","Mundo"}; //Arreglo de palabras
        /*Para crear un arreglo de clases utilizamos la siguiente sintaxis
            Clase[] nombreArregloDeClase;
        En caso de asignarlos directamente:
             Clase[] nombreArregloDeClase = {clase1,clase2,clase3,etc...}
        */
        // System.out.print(ArregloCarros + "\n" + numeros + "\n" + letras);


    }
}
