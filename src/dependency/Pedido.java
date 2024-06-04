package dependency;

public class Pedido {
    
    public void procesar(Producto producto) {
        System.out.println("Procesando el producto: " + producto.getNombre());
    }

}
