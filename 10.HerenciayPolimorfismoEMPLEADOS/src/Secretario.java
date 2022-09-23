public class Secretario extends Empleado{

    public Secretario(String name, String lastName, int age, int id, String address, String phoneNumber, int salary, String position, String numFax){

        super(name, lastName, age, id, address, phoneNumber, salary, position);
        this.numFax = numFax;

    }
    String numFax;
    Empleado supervisor;
    
    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
        super.Imprimir();
    }

    @Override
    public double IncrementoSalary(int salary) {
        double salarioIncrementado = (salary * 0.05) + salary;
        return salarioIncrementado;
    }

}
