public class Carro{
    String type;
    String brand;
    String color;
    String country;
    int year;

    void acelerar(){
        System.out.println("Brrrmmm");
    }

    public String toString(){
        return type + "\n" + brand + "\n" + color + "\n" + year;
    }
}