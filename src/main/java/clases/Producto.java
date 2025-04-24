package clases;
import enums.TipoProducto;
public abstract class Producto {
    private String codigo;
    private String nombre;
    private float precioU;
    private TipoProducto tipoProducto;

    public Producto(String codigo, String nombre, float precioU, TipoProducto tipoProducto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioU = precioU;
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public float getPrecioU() {
        return precioU;
    }

    public void setPrecioU(float precioU){
        this.precioU = precioU;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto){
        this.tipoProducto = tipoProducto;
    }

    abstract float calcularCosto();
    @Override
    public String toString(){

        return "Codigo: " + codigo +
                "\nProducto:" + nombre +
                "\nPrecio Unitario: " + precioU +
                "\nTipo: " + tipoProducto;
    }
}
