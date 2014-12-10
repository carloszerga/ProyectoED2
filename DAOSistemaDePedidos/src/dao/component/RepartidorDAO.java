package dao.component;

import dao.design.IRepartidorDAO;
import dao.ds.AccesoDB;
import dao.to.RepartidorTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String rpta=null;
        Connection cn= db.getConnection();
        String procedimientoalmacendo ="{CALL sp_insertarrepartidor(?,?,?,?,?)}";
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacendo);
                cs.setInt(1,repartidor.getId());
                cs.setString(2,repartidor.getContraseña());
                cs.setString(3,repartidor.getNombres());
                cs.setString(4,repartidor.getApellidos());
                cs.setInt(5,repartidor.getDni());
                int inserto= cs.executeUpdate();
                if(inserto==0){
                    rpta="Error";
                }
            }catch(SQLException ex){
                rpta=ex.getMessage();
            }
            finally{
                try{
                    cn.close();
                }catch(SQLException e){
                    rpta= e.getMessage();
                }
            }
        }
        return rpta;
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
    public RepartidorTO adminLogin(String usuario, String pwd){
        RepartidorTO nuevo= new RepartidorTO();
        String procedimiento= "{CALL loginadmin(?,?)}";
        Connection dbc= db.getConnection();
        if(dbc!=null){
            try{
                CallableStatement cs= dbc.prepareCall(procedimiento);
                cs.setString(1,usuario);
                cs.setString(2,pwd);
                ResultSet rs= cs.executeQuery();
                if(rs.next()){
                    nuevo.setId(Integer.parseInt(rs.getString("idRepartidor")));
                    nuevo.setUsario(rs.getString("idUsuario"));
                    nuevo.setContraseña(rs.getString("contraseña"));
                    nuevo.setNombres(rs.getString("Nombres"));
                    nuevo.setApellidos(rs.getString("Apellidos"));
                    nuevo.setTelefono(rs.getString("Telefono"));
                    nuevo.setEmail(rs.getString("e-mail"));
                    nuevo.setTurno(rs.getString("Turno"));
                    nuevo.setDni(rs.getInt("dni"));
                    nuevo.setCargo(rs.getString("cargo"));
                }
                return nuevo;
            }catch(Exception ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
        return nuevo;
    }
    public RepartidorTO repartidorLogin(String usuario, String pwd){
                RepartidorTO nuevo= new RepartidorTO();
        String procedimiento= "{CALL loginrepartidor(?,?)}";
        Connection dbc= db.getConnection();
        if(dbc!=null){
            try{
                CallableStatement cs= dbc.prepareCall(procedimiento);
                cs.setString(1,usuario);
                cs.setString(2,pwd);
                ResultSet rs= cs.executeQuery();
                if(rs.next()){
                    nuevo.setId(Integer.parseInt(rs.getString("idRepartidor")));
                    nuevo.setUsario(rs.getString("idUsuario"));
                    nuevo.setContraseña(rs.getString("contraseña"));
                    nuevo.setNombres(rs.getString("Nombres"));
                    nuevo.setApellidos(rs.getString("Apellidos"));
                    nuevo.setTelefono(rs.getString("Telefono"));
                    nuevo.setEmail(rs.getString("e-mail"));
                    nuevo.setTurno(rs.getString("Turno"));
                    nuevo.setDni(rs.getInt("dni"));
                    nuevo.setCargo(rs.getString("cargo"));
                }
                return nuevo;
            }catch(Exception ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
        return nuevo;
    }
    
}
