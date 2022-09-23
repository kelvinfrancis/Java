import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    
    boolean despacho;
    Secretario secretario;
    int matriculaCar;
    String brandCar;
    String carModel;
    ArrayList<String> bossClientlist = new ArrayList<String>();
    Empleado supervisor;

    public JefeDeZona(String name, String lastName, int age, int id, String address, String phoneNumber, int salary, String position, boolean despacho, Secretario secretario, int matriculaCar, String brandCar, String carModel){

        super(name, lastName, age, id, address, phoneNumber, salary, position);
        this.matriculaCar = matriculaCar;
        this.brandCar = brandCar;
        this.carModel = carModel;
        this.despacho = despacho;
        this.secretario = secretario;
        bossClientlist.add("Corripio");
        bossClientlist.add("Cecomsa");
        bossClientlist.add("Bravo");
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
        System.out.println("Despacho: "+ despacho);
        System.out.println("Secretario: "+ secretario.name);
        System.out.println("Vehiculo asignado: "+ brandCar + " - "+ carModel + ", matricula: "+ matriculaCar);
    }

    @Override
    public double IncrementoSalary(int salary) {
        double salarioIncrementado = (salary * 0.20) + salary;
        return salarioIncrementado;
    }

    public void ChangeSecretario(Secretario newSecretario){
        this.secretario = newSecretario;
    }

    public void ChangeCar(int newMatriculaCar, String newBrandCar, String newCarModel){

        this.brandCar = newBrandCar;
        this.matriculaCar = newMatriculaCar;
        this.carModel = newCarModel;
    }

    public void AltaClient(String aClient){
        bossClientlist.add(aClient);
    }

    public void BajaClient(String bClient){
        bossClientlist.remove(bClient);
    }
}
