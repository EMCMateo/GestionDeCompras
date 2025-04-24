package clases;

public class Persona {
    private String nombre;
    private String email;
    private int codigo;

    public Persona(String nombre, String email, int codigo) {
        this.nombre = nombre;
        this.email = email;
        this.codigo = codigo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return "";
    }
}
