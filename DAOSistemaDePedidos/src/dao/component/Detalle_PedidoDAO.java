/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.component;

import dao.design.IDetalle_PedidoDAO;
import dao.to.Detalle_PedidoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public class Detalle_PedidoDAO implements IDetalle_PedidoDAO{

    @Override
    public ArrayList<Detalle_PedidoTO> listaDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarDetalle(Detalle_PedidoTO detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizarDetalle(Detalle_PedidoTO detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarDetalle(List<Integer> iddetalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle_PedidoTO datoDetalleporId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
