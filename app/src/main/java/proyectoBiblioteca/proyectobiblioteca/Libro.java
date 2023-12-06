package proyectoBiblioteca.proyectobiblioteca;

public class Libro {

    private String uuid;
    private int imagen;
    private String titulo;
    private String autor;

    public int getImagen() {
        return imagen;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Libro(int imagen, String titulo, String autor){
        this.imagen = imagen;
        this.titulo =titulo;
        this.autor = autor;
    }

    public Libro(){}

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUuid() {
        return uuid;
    }
}
