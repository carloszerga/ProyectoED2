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
public class FacturaTO {
    private String _Id;
    private String _Fecha;
    private String _Costo;
    private String _Id_Pedido;
    private String _Id_Repartidor;

    public FacturaTO(String _Id, String _Fecha, String _Costo, String _Id_Pedido, String _Id_Repartidor) {
        this._Id = _Id;
        this._Fecha = _Fecha;
        this._Costo = _Costo;
        this._Id_Pedido = _Id_Pedido;
        this._Id_Repartidor = _Id_Repartidor;
    }
    
    public FacturaTO(FacturaTO aux) {
        this._Id = aux._Id;
        this._Fecha = aux._Fecha;
        this._Costo = aux._Costo;
        this._Id_Pedido = aux._Id_Pedido;
        this._Id_Repartidor = aux._Id_Repartidor;
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
     * @return the _Costo
     */
    public String getCosto() {
        return _Costo;
    }

    /**
     * @param _Costo the _Costo to set
     */
    public void setCosto(String _Costo) {
        this._Costo = _Costo;
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
     * @return the _Id_Repartidor
     */
    public String getId_Repartidor() {
        return _Id_Repartidor;
    }

    /**
     * @param _Id_Repartidor the _Id_Repartidor to set
     */
    public void setId_Repartidor(String _Id_Repartidor) {
        this._Id_Repartidor = _Id_Repartidor;
    }
}
