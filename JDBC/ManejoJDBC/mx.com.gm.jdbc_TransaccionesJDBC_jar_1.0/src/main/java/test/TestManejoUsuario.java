package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) throws SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

//        Usuario usuarioNuevo = new Usuario("Juana", "1234");
//        usuarioDao.insertar(usuarioNuevo);
//        
//        Usuario usuarioEliminar = new Usuario(3);
//        
//        usuarioDao.eliminar(usuarioEliminar);

        Usuario usuarioActualizar = new Usuario(2, "Esteban", "1234");
        usuarioDao.actualizar(usuarioActualizar);
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("persona = " + usuario);
        });

        /*
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
         */
    }

}
