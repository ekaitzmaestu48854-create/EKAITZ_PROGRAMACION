import java.time.LocalDate;
import java.util.ArrayList;

public class Pedidos {
    private LocalDate fecha;
    private ArrayList<Usuarios> usuario_pedido;
    private ArrayList<Productos> productos_de_pedido;

    public Pedidos(LocalDate fecha, ArrayList<Usuarios> usuario_pedido, ArrayList<Productos> productos_de_pedido) {
        this.fecha = fecha;
        this.usuario_pedido = usuario_pedido;
        this.productos_de_pedido = productos_de_pedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Productos> getProductos_de_pedido() {
        return productos_de_pedido;
    }

    public void setProductos_de_pedido(ArrayList<Productos> productos_de_pedido) {
        this.productos_de_pedido = productos_de_pedido;
    }

    public ArrayList<Usuarios> getUsuario_pedido() {
        return usuario_pedido;
    }

    public void setUsuario_pedido(ArrayList<Usuarios> usuario_pedido) {
        this.usuario_pedido = usuario_pedido;
    }
}
