package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
    
    private Integer numero_Habitacion;

    private float costo;

    private String tipo;

    private Integer capacidad;

    public Habitacion()
    {;}

    public Habitacion(Integer numero_Habitacion, float costo, String tipo, Integer capacidad) {
        this.numero_Habitacion = numero_Habitacion;
        this.costo = costo;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Integer getNumero_Habitacion() {
        return numero_Habitacion;
    }

    public void setNumero_Habitacion(Integer numero_Habitacion) {
        this.numero_Habitacion = numero_Habitacion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    

}