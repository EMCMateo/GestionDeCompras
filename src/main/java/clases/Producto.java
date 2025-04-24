package clases;
import java.util.List;
public class Producto {
    private float costo;
    private float pvp;
    private String nombreProducto;
    private String marcaProducto;
    private int cantidadProducto;
    private List <String> tipoProducto;

    public Producto(float costo, float pvp, String nombreProducto, String marcaProducto, int cantidadProducto) {
        this.costo = costo;
        this.pvp = pvp;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override

    public String toString(){
        return "";
    }
}
