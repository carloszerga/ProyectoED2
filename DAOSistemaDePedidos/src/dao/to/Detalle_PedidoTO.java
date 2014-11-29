/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.to;

/**
 *
 * @author CARLOS
 */
public class Detalle_PedidoTO {
    private String _Id_Pedido;
    private String _Id_Producto;
    private String _Cantidad;
    private String _Precio_Total;

    public Detalle_PedidoTO(String _Id_Pedido, String _Id_Producto, String _Cantidad, String _Precio_Total) {
        this._Id_Pedido = _Id_Pedido;
        this._Id_Producto = _Id_Producto;
        this._Cantidad = _Cantidad;
        this._Precio_Total = _Precio_Total;
    }
    public Detalle_PedidoTO(Detalle_PedidoTO aux) {
        this._Id_Pedido = aux._Id_Pedido;
        this._Id_Producto = aux._Id_Producto;
        this._Cantidad = aux._Cantidad;
        this._Precio_Total = aux._Precio_Total;
    }
    
    

    /**
     * @return the _Id_Pedido
     */
    public String getId_Pedido() {
        return _Id_Pedido;
    }

    /**
     * @param _Id_Pedido the _Id_Pedido to set
     */
    public void setId_Pedido(String _Id_Pedido) {
        this._Id_Pedido = _Id_Pedido;
    }

    /**
     * @return the _Id_Producto
     */
    public String getId_Producto() {
        return _Id_Producto;
    }

    /**
     * @param _Id_Producto the _Id_Producto to set
     */
    public void setId_Producto(String _Id_Producto) {
        this._Id_Producto = _Id_Producto;
    }

    /**
     * @return the _Cantidad
     */
    public String getCantidad() {
        return _Cantidad;
    }

    /**
     * @param _Cantidad the _Cantidad to set
     */
    public void setCantidad(String _Cantidad) {
        this._Cantidad = _Cantidad;
    }

    /**
     * @return the _Precio_Total
     */
    public String getPrecio_Total() {
        return _Precio_Total;
    }

    /**
     * @param _Precio_Total the _Precio_Total to set
     */
    public void setPrecio_Total(String _Precio_Total) {
        this._Precio_Total = _Precio_Total;
    }
}
