package clases;
import enums.TipoProducto;
public abstract class Producto {
    private String codigo;
    private String nombre;
    private float precioU;
    private TipoProducto tipoProducto;

    public Producto(String coidgo, String nombre, float precioU, TipoProducto tipoProducto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioU = precioU;
        this.tipoProducto = tipoProducto;
    }

    public String getCodigo(){
        return codigo;

    }

    @Override

    public String toString(){
        return "";
    }
}
