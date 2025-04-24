package clases;

import java.util.GregorianCalendar;

public class Proveedor {
    private int codigo;
    private String nombre;
    private String importadora;
    private GregorianCalendar fechaEntrega;

    public Proveedor(int codigo, String nombre, String importadora, GregorianCalendar fechaEntrega) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.importadora = importadora;
        this.fechaEntrega = fechaEntrega;
    }

    public Proveedor() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImportadora() {
        return importadora;
    }

    public void setImportadora(String importadora) {
        this.importadora = importadora;
    }

    public GregorianCalendar getFechaEntrega() {
        return fechaEntrega;
    }



    public void setFechaEntrega(GregorianCalendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString(){
        return"";
    }
}

