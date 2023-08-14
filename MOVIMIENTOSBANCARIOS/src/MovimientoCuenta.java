public class Cuenta {
    // Atributos
    private String titular;
    private double cantidad;

    // Constructor vacío
    public Cuenta() {
    }

    // Constructor con todos los atributos
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: " + cantidad);
    }

    // Método para ingresar una cantidad a la cuenta
    public void ingresar(double saldoIngresado) {
        cantidad += saldoIngresado;
    }

    // Método para retirar una cantidad de la cuenta
    public void retirar(double saldoRetirar) {
        if (cantidad - saldoRetirar >= 0) {
            cantidad -= saldoRetirar;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}
