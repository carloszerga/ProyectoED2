/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.component;

import dao.design.IRepartidorDAO;
import dao.ds.AccesoDB;
import dao.to.RepartidorTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public class RepartidorDAO implements IRepartidorDAO {
    AccesoDB db;
    public RepartidorDAO(){
        db= new AccesoDB();
    }
    @Override
    public ArrayList<RepartidorTO> listaRepartidor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarRepartidor(RepartidorTO repartidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizarRepartidor(RepartidorTO repartidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarRepartidor(List<Integer> idrepartidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepartidorTO datoRepartidorporId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public RepartidorTO repartidorLogin(String usuario, String pwd){
        RepartidorTO nuevo= new RepartidorTO();
        String procedimiento= "{CALL loginEmpleado(?,?)}";
        Connection dbc= db.getConnection();
        if(dbc!=null){
            try{
                CallableStatement cs= dbc.prepareCall(procedimiento);
                cs.setString(1,usuario);
                cs.setString(2,pwd);
                ResultSet rs= cs.executeQuery();
                if(rs.next()){
                    nuevo.setId(rs.getString("idRepartidor"));
                    nuevo.setUsario(rs.getString("idUsuario"));
                    nuevo.setContraseña(rs.getString("contraseña"));
                    nuevo.setNombres(rs.getString("Nombres"));
                    nuevo.setApellidos(rs.getString("Apellidos"));
                    nuevo.setTelefono(rs.getString("Telefono"));
                    nuevo.setEmail(rs.getString("e-mail"));
                    nuevo.setTurno(rs.getString("Turno"));
                    nuevo.setDni(rs.getInt("dni"));
                }
                return nuevo;
            }catch(Exception ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
        return nuevo;
    }
    
}
