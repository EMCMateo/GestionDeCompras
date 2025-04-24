package clases;

import enums.EstadoSolicitud;
import java.util.List;
import java.util.GregorianCalendar;

public class SolicitudDeCompra {
    private int idSolicitud;
    private EstadoSolicitud tipoSolicitud;
    private GregorianCalendar fechaSolicitud;
    private Departamento departamento;
    private List <Producto> producto;

    public SolicitudDeCompra() {
    }

    public SolicitudDeCompra(int idSolicitud, EstadoSolicitud tipoSolicitud, GregorianCalendar fechaSolicitud, Departamento departamento, List<Producto> producto) {
        this.idSolicitud = idSolicitud;
        this.tipoSolicitud = tipoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.departamento = departamento;
        this.producto = producto;
    }

    public GregorianCalendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(GregorianCalendar fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public EstadoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(EstadoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Override

    public String toString(){
        return "";
    }
}
