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
public class PedidoTO {
    private String _Id;
    private String _ID_Cliente;
    private String _Fecha;
    private String _Distrito;
    private String _Direccion;

    public PedidoTO(String _Id, String _ID_Cliente, String _Fecha, String _Distrito, String _Direccion) {
        this._Id = _Id;
        this._ID_Cliente = _ID_Cliente;
        this._Fecha = _Fecha;
        this._Distrito = _Distrito;
        this._Direccion = _Direccion;
    }
    
    public PedidoTO(PedidoTO aux) {
        this._Id = aux._Id;
        this._ID_Cliente = aux._ID_Cliente;
        this._Fecha = aux._Fecha;
        this._Distrito = aux._Distrito;
        this._Direccion = aux._Direccion;
    }
    /**
     * @return the _Id
     */
    public String getId() {
        return _Id;
    }

    /**
     * @param _Id the _Id to set
     */
    public void setId(String _Id) {
        this._Id = _Id;
    }

    /**
     * @return the _ID_Cliente
     */
    public String getID_Cliente() {
        return _ID_Cliente;
    }

    /**
     * @param _ID_Cliente the _ID_Cliente to set
     */
    public void setID_Cliente(String _ID_Cliente) {
        this._ID_Cliente = _ID_Cliente;
    }

    /**
     * @return the _Fecha
     */
    public String getFecha() {
        return _Fecha;
    }

    /**
     * @param _Fecha the _Fecha to set
     */
    public void setFecha(String _Fecha) {
        this._Fecha = _Fecha;
    }

    /**
     * @return the _Distrito
     */
    public String getDistrito() {
        return _Distrito;
    }

    /**
     * @param _Distrito the _Distrito to set
     */
    public void setDistrito(String _Distrito) {
        this._Distrito = _Distrito;
    }

    /**
     * @return the _Direccion
     */
    public String getDireccion() {
        return _Direccion;
    }

    /**
     * @param _Direccion the _Direccion to set
     */
    public void setDireccion(String _Direccion) {
        this._Direccion = _Direccion;
    }
}
