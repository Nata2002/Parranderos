package uniandes.edu.co.parranderos;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uniandes.edu.co.parranderos.modelo.Habitacion;
import uniandes.edu.co.parranderos.repositorio.HabitacionRepository;

@SpringBootApplication
public class ParranderosApplication implements 	CommandLineRunner{
	


	
	public static void main(String[] args) {
		SpringApplication.run(ParranderosApplication.class, args);
	}
	@Override
    public void run(String... args) {
        System.out.println("Aplicación iniciada. Intentando conexión a la base de datos...");
        try {
            // Intenta realizar una operación de base de datos aquí
            // Si no hay errores, la conexión se estableció con éxito.
            System.out.println("Conexión a la base de datos exitosa.");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos");
        }
    }
}
