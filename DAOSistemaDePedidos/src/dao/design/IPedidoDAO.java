/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.PedidoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IPedidoDAO {
    public abstract ArrayList<PedidoTO> listaPedido();
    public abstract String insertarPedido(PedidoTO pedido);
    public abstract String actualizarPedido(PedidoTO pedido);
    public abstract String eliminarPedido(List<Integer> idpedido);
    public abstract PedidoTO datoPedidoporId(Integer id);
}
