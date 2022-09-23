public class App {
    public static void main(String[] args) throws Exception {
        Secretario JoseSecretario = new Secretario("Jose", "Ramirez", 22, 005, "C/ Club de leones #12 Alma rosa", "829963854", 15000, "Secretario", "55555554");

        Secretario JulisaSecretaria = new Secretario("Julisa", "Pena", 22, 010, "C/ Club de leones #12 Alma rosa", "829963854", 15000, "Secretario", "55555554");

        Vendedor AlanVendedor = new Vendedor("Alan", "Montero", 25, 006, "Av. 27 de febrero, Esperilla", "8299563321", 25000, "Vendedor", 11523654, "Toyota", "Corolla", "Alma Rosa");

        Vendedor PedroVendedor = new Vendedor("Pedro", "Perez", 26, 007, "C/ Bonaira #5, Alma Rosa", "8296534879", 25000, "Vendedor", 11523856, "Honda", "Civic", "Los Mina");

        Vendedor GeorgeVendedor = new Vendedor("George", "Lopez", 28, 004, "C/ Costa Rica #4, Alma Rosa", "8096765234", 25000, "Vendedor", 11523884, "Hyundai", "Cantus", "Calero");

        JefeDeZona JulioJefe = new JefeDeZona("Julio", "Voltio", 25, 001, "Ave. Venezuela #54, Los Mina", "8095564123", 50000, "Jefe De Zona", true, JoseSecretario, 115238562, "Audi", "S6");

        JoseSecretario.supervisor = JulioJefe;
        AlanVendedor.supervisor = JulioJefe;
        PedroVendedor.supervisor = JulioJefe;
        GeorgeVendedor.supervisor = JulioJefe;
        JulioJefe.supervisor = JulioJefe;

        // Imprimir Empleados
        JulioJefe.Imprimir();
        System.out.println("Salario incrementado con un 20%: "+ JulioJefe.IncrementoSalary(JulioJefe.salary));
        JulioJefe.ChangeSecretario(JulisaSecretaria);
        System.out.println("Nuevo secretario: "+ JulioJefe.secretario.name);
        JulioJefe.ChangeCar(777888554, "Ferrari", "Spider");
        System.out.println("Nuevo carro: "+ JulioJefe.brandCar +" - "+ JulioJefe.carModel + " - "+ JulioJefe.matriculaCar);
        System.out.println("");

        JoseSecretario.Imprimir();
        System.out.println("");

        JulisaSecretaria.Imprimir();
        System.out.println("");

        AlanVendedor.Imprimir();
        System.out.println("");

        PedroVendedor.Imprimir();
        System.out.println("");
        
        GeorgeVendedor.Imprimir();


    }
}
