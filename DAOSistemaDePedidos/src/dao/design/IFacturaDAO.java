/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.FacturaTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IFacturaDAO {
    public abstract ArrayList<FacturaTO> listaFactura();
    public abstract String insertarFactura(FacturaTO factura);
    public abstract String actualizarFactura(FacturaTO factura);
    public abstract String eliminarFactura(List<Integer> idfactura);
    public abstract FacturaTO datoFacturaporId(Integer id);
}
