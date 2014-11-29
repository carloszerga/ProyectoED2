/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.Detalle_PedidoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IDetalle_PedidoDAO {
    public abstract ArrayList<Detalle_PedidoTO> listaDetalle();
    public abstract String insertarDetalle(Detalle_PedidoTO detalle);
    public abstract String actualizarDetalle(Detalle_PedidoTO detalle);
    public abstract String eliminarDetalle(List<Integer> iddetalle);
    public abstract Detalle_PedidoTO datoDetalleporId(Integer id);
}
