package uniandes.edu.co.parranderos.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Embeddable
public class reservaHabitacionPK implements Serializable {

    @OneToMany
    @JoinColumn(name = "habitacion_numero_habiatcion", referencedColumnName = "numero_habitacion")
    private Habitacion numHabitacion;

    @OneToMany
    @JoinColumn(name = "cliente_numero_documetno", referencedColumnName = "numero_documento")
    private cliente numDocumento;;
    @ManyToOne
    @JoinColumn(name = "planes_de_consumo_id", referencedColumnName = "id")
    private planesDeConsumo idplanesDeConsumo;
    private Integer id ;
    private Date fecha;
    private float costo_total;
    public reservaHabitacionPK(Habitacion numHabitacion, cliente numDocumento, planesDeConsumo idplanesDeConsumo,
            Integer id, Date fecha, float costo_total) {
        this.numHabitacion = numHabitacion;
        this.numDocumento = numDocumento;
        this.idplanesDeConsumo = idplanesDeConsumo;
        this.id = id;
        this.fecha = fecha;
        this.costo_total = costo_total;
    }
    public reservaHabitacionPK() {
    }
    public Habitacion getNumHabitacion() {
        return numHabitacion;
    }
    public void setNumHabitacion(Habitacion numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
    public cliente getNumDocumento() {
        return numDocumento;
    }
    public void setNumDocumento(cliente numDocumento) {
        this.numDocumento = numDocumento;
    }
    public planesDeConsumo getIdplanesDeConsumo() {
        return idplanesDeConsumo;
    }
    public void setIdplanesDeConsumo(planesDeConsumo idplanesDeConsumo) {
        this.idplanesDeConsumo = idplanesDeConsumo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public float getCosto_total() {
        return costo_total;
    }
    public void setCosto_total(float costo_total) {
        this.costo_total = costo_total;
    }

    

    

}
