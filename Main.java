public class Main {
    public static void main(String[] args) {
        // En la rama main iniciamos con la comisión estándar
        Vendedor vendedor = new Vendedor("Eduardo Rodríguez", 1000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}