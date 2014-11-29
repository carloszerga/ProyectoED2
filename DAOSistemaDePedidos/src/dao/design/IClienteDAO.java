/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.ClienteTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IClienteDAO {
    public abstract ArrayList<ClienteTO> listaClientes();
    public abstract String insertarCliente (ClienteTO cliente);
    public abstract String actualizarCliente(ClienteTO cliente);
    public abstract String eliminarCliente(List<Integer> idcliente);
    public abstract ClienteTO datoClienteporId(Integer id);
}
