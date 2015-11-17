import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by miguelgomezcuesta on 17/11/15.
 */
@Entity
@Table(name = "PELICULA")
public class Pelicula {

    @Id
    @Column(name = "ID_PELICULA")
    private Integer idPelicula;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "FECHA_PUBLICACION")
    private String fechaPublicacion;

    public Pelicula() {
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
