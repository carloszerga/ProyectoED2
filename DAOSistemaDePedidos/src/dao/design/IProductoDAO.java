/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.ProductoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IProductoDAO {
    public abstract ArrayList<ProductoTO> listaProducto();
    public abstract String insertarProducto(ProductoTO producto);
    public abstract String actualizarProducto(ProductoTO producto);
    public abstract String eliminarProducto(List<Integer> idproducto);
    public abstract ProductoTO datoProductoporId(Integer id);
}
