package test;

import datos.PersonaDAO;
import domain.Persona;
import java.sql.SQLException;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) throws SQLException {
        PersonaDAO personaDao = new PersonaDAO();

//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "55241235561");
//        personaDao.insertar(personaNueva);
//        
//        Persona personaEliminar = new Persona(9);
//        
//        personaDao.eliminar(personaEliminar);

        Persona personaActualizar = new Persona(6, "Esteban", "Cacado", "Ecacado@gmail.com", "5544332211");
        personaDao.actualizar(personaActualizar);
        
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

        /*
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
         */
    }

}
