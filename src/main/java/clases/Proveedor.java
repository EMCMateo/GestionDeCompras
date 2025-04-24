package clases;

import java.util.GregorianCalendar;

public class Proveedor extends Persona{
    private String empresa;

    public Proveedor( String empresa, String nombre, String email, String cedula) {
        super(nombre, email, cedula);

    }

    public Proveedor() {

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString(){
        return"Proveedor: \n"
                + "Empresa: "+empresa;
    }
}

