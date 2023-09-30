package uniandes.edu.co.parranderos.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer numero_Documento;

    private String nombre;

    private String correo;

    private String tipo_Documento;

    

    public cliente(){;}



    public cliente(Integer numero_Documento, String nombre, String correo, String tipo_Documento) {
        this.numero_Documento = numero_Documento;
        this.nombre = nombre;
        this.correo = correo;
        this.tipo_Documento = tipo_Documento;
    }



    public Integer getNumero_Documento() {
        return numero_Documento;
    }



    public void setNumero_Documento(Integer numero_Documento) {
        this.numero_Documento = numero_Documento;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCorreo() {
        return correo;
    }



    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getTipo_Documento() {
        return tipo_Documento;
    }



    public void setTipo_Documento(String tipo_Documento) {
        this.tipo_Documento = tipo_Documento;
    }

    

}