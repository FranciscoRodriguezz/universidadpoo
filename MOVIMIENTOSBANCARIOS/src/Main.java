public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona titular = new Persona("Juan Pérez", 30, "123456789");

        // Crear una instancia de Cuenta
        Cuenta cuenta = new Cuenta(titular.getNombre(), 1000.0);

        // Crear una instancia de MovimientoCuenta para ingreso
        MovimientoCuenta movimientoIngreso = new MovimientoCuenta(titular.getNombre(), 500.0);
        cuenta.setIngreso(movimientoIngreso.getCantidad());

        // Crear una instancia de MovimientoCuenta para retiro
        MovimientoCuenta movimientoRetiro = new MovimientoCuenta(titular.getNombre(), 300.0);
        cuenta.setRetiro(movimientoRetiro.getCantidad());

        // Mostrar los datos de la cuenta después de los movimientos
        cuenta.mostrar();

        // Mostrar si el titular de la cuenta es mayor de edad
        System.out.println("¿Es mayor de edad? " + titular.esMayorDeEdad());
    }
}

