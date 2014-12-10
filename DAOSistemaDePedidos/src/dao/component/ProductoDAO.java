/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.component;

import dao.design.IProductoDAO;
import dao.ds.AccesoDB;
import dao.to.ProductoTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public class ProductoDAO implements IProductoDAO{
    AccesoDB db;
    public ProductoDAO(){
        db= new AccesoDB();
    }
    
    @Override
    public ArrayList<ProductoTO> listaProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarProducto(ProductoTO producto) {
        String rpta=null;
        Connection cn= db.getConnection();
        String procedimientoalmacendo ="{CALL sp_insertarproducto(?,?,?,?,?)}";
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacendo);
                cs.setInt(1,producto.getId());
                cs.setString(2,producto.getNombre());
                cs.setFloat(3,producto.getPrecio_Unidad());
                cs.setString(4,producto.getTipo());
                cs.setInt(5,producto.getStock());
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
    public String actualizarProducto(ProductoTO producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarProducto(List<Integer> idproducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductoTO datoProductoporId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
