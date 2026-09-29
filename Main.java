public class Main {
    public static void main(String[] args) {
        // En la rama main iniciamos con la comisión estándar
<<<<<<< HEAD
        Vendedor vendedor = new Vendedor("Eduardo Rodríguez", 5000.0, new ComisionEstandar());
=======
        Vendedor vendedor = new Vendedor("Eduardo Rodríguez", 1000.0, new ComisionPersonalizada());
>>>>>>> feature/comision-personalizada
        vendedor.mostrarDetalle();
    }
}