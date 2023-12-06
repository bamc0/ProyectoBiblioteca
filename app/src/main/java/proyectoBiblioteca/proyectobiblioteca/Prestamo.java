package proyectoBiblioteca.proyectobiblioteca;

public class Prestamo {

    private String uuid;
    private Libro libro;
    private Socio socio;
    private int fecha;
    private int estado; //0=Prestado 1=Devuelto 2=Perdido 3=Deshabilitado

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public int getFecha() {
        return fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Prestamo(Libro libro, Socio socio, int fecha, int estado) {
        this.libro = libro;
        this.socio = socio;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Prestamo() {
    }
}
