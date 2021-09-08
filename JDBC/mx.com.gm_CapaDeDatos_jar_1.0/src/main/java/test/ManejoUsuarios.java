package test;

import datos.*;
import domain.*;
import java.sql.*;

public class ManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;

     
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioJDBC usuarioJdbc = new UsuarioJDBC(conexion);
            
            Usuario cambioUsuario = new Usuario(2);
            cambioUsuario.setUsername("Penesaurio");
            cambioUsuario.setPassword("Gomez");
            usuarioJdbc.update(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("Carlos11");
            //nuevaPersona.setApellido("Ramirez1111111111111111111111111111111111111111111");
            nuevoUsuario.setPassword("Ramirez");
            usuarioJdbc.insert(nuevoUsuario);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
