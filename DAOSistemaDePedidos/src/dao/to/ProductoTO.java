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
public class ProductoTO {
    private int _Id;
    private String _Nombre;
    private String _Descripcion;
    private int _Stock;
    private String _Fecha_Vencimiento;
    private String _Tipo;
    private String _Marca;
    private String _Unidad;
    private float _Precio_Unidad;

    public ProductoTO(int _Id, String _Nombre,int _Stock, String _Tipo, float _Precio_Unidad) {
        this._Id = _Id;
        this._Nombre = _Nombre;
        this._Descripcion = "";
        this._Stock = _Stock;
        this._Fecha_Vencimiento = "";
        this._Tipo = _Tipo;
        this._Marca = "";
        this._Unidad = "";
        this._Precio_Unidad = _Precio_Unidad;
    }
    
    public ProductoTO(ProductoTO aux) {
        this._Id = aux._Id;
        this._Nombre = aux._Nombre;
        this._Descripcion = aux._Descripcion;
        this._Stock = aux._Stock;
        this._Fecha_Vencimiento = aux._Fecha_Vencimiento;
        this._Tipo = aux._Tipo;
        this._Marca = aux._Marca;
        this._Unidad = aux._Unidad;
        this._Precio_Unidad = aux._Precio_Unidad;
    }
    
    /**
     * @return the _Id
     */
    public int getId() {
        return _Id;
    }

    /**
     * @param _Id the _Id to set
     */
    public void setId(int _Id) {
        this._Id = _Id;
    }

    /**
     * @return the _Nombre
     */
    public String getNombre() {
        return _Nombre;
    }

    /**
     * @param _Nombre the _Nombre to set
     */
    public void setNombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    /**
     * @return the _Descripcion
     */
    public String getDescripcion() {
        return _Descripcion;
    }

    /**
     * @param _Descripcion the _Descripcion to set
     */
    public void setDescripcion(String _Descripcion) {
        this._Descripcion = _Descripcion;
    }

    /**
     * @return the _Stock
     */
    public int getStock() {
        return _Stock;
    }

    /**
     * @param _Stock the _Stock to set
     */
    public void setStock(int _Stock) {
        this._Stock = _Stock;
    }

    /**
     * @return the _Fecha_Vencimiento
     */
    public String getFecha_Vencimiento() {
        return _Fecha_Vencimiento;
    }

    /**
     * @param _Fecha_Vencimiento the _Fecha_Vencimiento to set
     */
    public void setFecha_Vencimiento(String _Fecha_Vencimiento) {
        this._Fecha_Vencimiento = _Fecha_Vencimiento;
    }

    /**
     * @return the _Tipo
     */
    public String getTipo() {
        return _Tipo;
    }

    /**
     * @param _Tipo the _Tipo to set
     */
    public void setTipo(String _Tipo) {
        this._Tipo = _Tipo;
    }

    /**
     * @return the _Marca
     */
    public String getMarca() {
        return _Marca;
    }

    /**
     * @param _Marca the _Marca to set
     */
    public void setMarca(String _Marca) {
        this._Marca = _Marca;
    }

    /**
     * @return the _Unidad
     */
    public String getUnidad() {
        return _Unidad;
    }

    /**
     * @param _Unidad the _Unidad to set
     */
    public void setUnidad(String _Unidad) {
        this._Unidad = _Unidad;
    }

    /**
     * @return the _Precio_Unidad
     */
    public float getPrecio_Unidad() {
        return _Precio_Unidad;
    }

    /**
     * @param _Precio_Unidad the _Precio_Unidad to set
     */
    public void setPrecio_Unidad(float _Precio_Unidad) {
        this._Precio_Unidad = _Precio_Unidad;
    }
}
