public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNombre("Roberto");
        cliente.setEdad(23);
        cliente.setTelefono(123123123);
        cliente.setCredito(2000);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Daniela");
        trabajador.setEdad(21);
        trabajador.setTelefono(12375673);
        trabajador.setSalario(250);

        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito: "+cliente.getCredito());

        System.out.println("----------------------------------");

        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Salario: "+trabajador.getSalario());



    }
}

abstract class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {

    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

}

class Trabajador extends Persona {

    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

}
