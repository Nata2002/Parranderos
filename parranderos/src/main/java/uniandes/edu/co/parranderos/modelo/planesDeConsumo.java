package uniandes.edu.co.parranderos.modelo;
import java.sql.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="planes_de_consumo")
public class planesDeConsumo {
    enum tipo{
        LARGAESTADIA,
        TIEMPOCOMPARTIDO,
        TODOINCLUIDO

    }
     private Integer id ;
     private float costo;
     private tipo tipo;

     public planesDeConsumo(){;}

    public planesDeConsumo(Integer id, float costo, uniandes.edu.co.parranderos.modelo.planesDeConsumo.tipo tipo) {
        this.id = id;
        this.costo = costo;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

     

}