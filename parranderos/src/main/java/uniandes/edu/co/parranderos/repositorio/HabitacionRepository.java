package uniandes.edu.co.parranderos.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.parranderos.modelo.Habitacion;
import uniandes.edu.co.parranderos.modelo.cliente;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
        @Query(value = "SELECT* FROM habitacion", nativeQuery = true)
        Collection<Habitacion> darHabitaciones();

        @Query(value = "SELECT * FROM habitacion WHERE numero_habitacion=:numero_habitacion", nativeQuery = true)
        Habitacion darHabitacion(@Param("numero_habitacion") int numero_Habitacion);

        @Modifying
        @Transaction
        @Query(value = "INSERT INTO habitacion(numero_habitacion,costo,tipo,capacida) VALUES(hotel_sequence.nextval,:numero_habitacion,costo,tipo,capacidad)", nativeQuery = true)
        void insertarHabitacion(@Param("numero_habitacion") Integer numero_Habitacion, @Param("costo") float costo,
                        @Param("tipo") String tipo, @Param("capacidad") Integer capacidad);

        @Modifying
        @Transactional
        @Query(value = "UPDATE habitacion SET costo = :costo, tipo = :tipo, capacidad = :capacidad WHERE numero_habitacion = :numero_habitacion", nativeQuery = true)
        void actualizarHabitacion(@Param("numero_habitacion") Integer numero_Habitacion, @Param("costo") float costo,
                        @Param("tipo") String tipo, @Param("capacidad") Integer capacidad);

        
        @Modifying
        @Transactional
        @Query(value = "DELETE FROM habitacion WHERE numero_habitacion = :numero_habitacion", nativeQuery = true)
        void eliminarHabitacion(@Param("numero_habitacion") int numero_Habitacion);

}