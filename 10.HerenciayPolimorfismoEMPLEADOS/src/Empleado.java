public class Empleado {

    String name;
    String lastName;
    int id;
    String address;
    int age;
    String phoneNumber;
    int salary;
    String position;
    Empleado supervisor;

    public Empleado(String name, String lastName, int age, int id, String address, String phoneNumber, int salary, String position){

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.position = position;

    }

    public void Imprimir(){
        System.out.println("Nombre: "+ name);
        System.out.println("Apellido: "+ lastName);
        System.out.println("Edad: "+ age);
        System.out.println("Cedula: "+ id);
        System.out.println("Direccion: "+ address);
        System.out.println("Telefono: "+ phoneNumber);
        System.out.println("Salario: "+ salary);
        System.out.println("Puesto en la empresa: "+ position);
    }

    public void CambiarSupervisor(Empleado supervisor){
        this.supervisor = supervisor;
    
    }

    public double IncrementoSalary(int salary){
        double salaryIncrementado = 0;
        return salaryIncrementado;
    }

}
