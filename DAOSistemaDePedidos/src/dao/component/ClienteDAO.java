/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.component;

import dao.design.IClienteDAO;
import dao.ds.AccesoDB;
import dao.to.ClienteTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*  
 *
 * @author CARLOS
 */
public class ClienteDAO implements IClienteDAO {
    AccesoDB db;
    public ClienteDAO(){
        db= new AccesoDB();
    }
    
    @Override
    public ArrayList<ClienteTO> listaClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarCliente(ClienteTO cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizarCliente(ClienteTO cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarCliente(List<Integer> idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteTO datoClienteporDni(Integer dni) {
        ClienteTO nuevo= new ClienteTO();
        String procedimiento= "{CALL loginCliente(?)}";
        Connection dbc= db.getConnection();
        if(dbc!=null){
            try{
                
                CallableStatement cs= dbc.prepareCall(procedimiento);
                cs.setInt(1,dni);
                ResultSet rs= cs.executeQuery();
                if(rs.next()){
                    nuevo.setId(rs.getString("idCliente"));
                    nuevo.setNombres(rs.getString("Nombres"));
                    nuevo.setApellidos(rs.getString("Apellidos"));
                    nuevo.setTelefono(rs.getString("Telefono"));
                    nuevo.setEmail(rs.getString("e-mail"));
                    nuevo.setDireccion(rs.getString("Direccion"));
                    nuevo.setDistrito(rs.getString("Distrito"));
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
