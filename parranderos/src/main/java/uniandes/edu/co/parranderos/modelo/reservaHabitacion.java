package uniandes.edu.co.parranderos.modelo;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva_habitacion")
public class reservaHabitacion {

    @EmbeddedId
    private reservaHabitacionPK pk;

    

    public reservaHabitacion(cliente cliente_numero_documento,Habitacion habitacion_numero_habiatcion,planesDeConsumo planes_de_consumo_id , Integer id ,
     Date fecha, float costo_total) 
    {
        this.pk = new reservaHabitacionPK(habitacion_numero_habiatcion, cliente_numero_documento, planes_de_consumo_id, id, fecha, costo_total);
    }

   public reservaHabitacion()
    {;}

public reservaHabitacionPK getPk() {
    return pk;
}

public void setPk(reservaHabitacionPK pk) {
    this.pk = pk;
}



}
