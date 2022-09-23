import java.util.ArrayList;

public class Vendedor extends Empleado{
    
    int matriculaCar;
    String brandCar;
    String carModel;
    int cellPhone;
    String sellLocation;
    ArrayList<String> clientlist = new ArrayList<String>();
    Empleado supervisor;

    public Vendedor(String name, String lastName, int age, int id, String address, String phoneNumber, int salary, String position, int matriculaCar, String brandCar, String carModel, String sellLocation){

        super(name, lastName, age, id, address, phoneNumber, salary, position);
        this.matriculaCar = matriculaCar;
        this.brandCar = brandCar;
        this.carModel = carModel;
        this.sellLocation = sellLocation;
        clientlist.add("Claro");
        clientlist.add("Altice");
        clientlist.add("Viva");
    }

    @Override
    public void Imprimir() {
        System.out.println("Nombre: "+ name);
        System.out.println("Apellido: "+ lastName);
        System.out.println("Edad: "+ age);
        System.out.println("Cedula: "+ id);
        System.out.println("Direccion: "+ address);
        System.out.println("Telefono: "+ phoneNumber);
        System.out.println("Salario: "+ salary);
        System.out.println("Puesto en la empresa: "+ position);
        System.out.println("Vehiculo asignado: "+ brandCar + " - "+ carModel + ", matricula: "+ matriculaCar);
    }

    @Override
    public double IncrementoSalary(int salary) {
        double salarioIncrementado = (salary * 0.10) + salary;
        return salarioIncrementado;
    }

    public void AltaClient(String aClient){
        clientlist.add(aClient);
    }

    public void BajaClient(String bClient){
        clientlist.remove(bClient);
    }

    public void ChangeCar(int newMatriculaCar, String newBrandCar, String newCarModel){

        this.brandCar = newBrandCar;
        this.matriculaCar = newMatriculaCar;
        this.carModel = newCarModel;
    }
}
