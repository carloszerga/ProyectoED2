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
public class RepartidorTO {
    private String _Id;
    private String _Dni;
    private String _Nombres;
    private String _Apellidos;
    private String _Telefono;
    private String _Email;
    private String _turno;
    private String _usario;
    private String _contraseña;

    public RepartidorTO(String _Id, String _Dni, String _Nombres, String _Apellidos, String _Telefono, String _Email, String _turno, String _usario, String _contraseña) {
        this._Id = _Id;
        this._Dni = _Dni;
        this._Nombres = _Nombres;
        this._Apellidos = _Apellidos;
        this._Telefono = _Telefono;
        this._Email = _Email;
        this._turno = _turno;
        this._usario = _usario;
        this._contraseña = _contraseña;
    }
    public RepartidorTO(RepartidorTO aux) {
        this._Id = _Id;
        this._Dni = _Dni;
        this._Nombres = _Nombres;
        this._Apellidos = _Apellidos;
        this._Telefono = _Telefono;
        this._Email = _Email;
        this._turno = _turno;
        this._usario = _usario;
        this._contraseña = _contraseña;
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
     * @return the _Dni
     */
    public String getDni() {
        return _Dni;
    }

    /**
     * @param _Dni the _Dni to set
     */
    public void setDni(String _Dni) {
        this._Dni = _Dni;
    }

    /**
     * @return the _Nombres
     */
    public String getNombres() {
        return _Nombres;
    }

    /**
     * @param _Nombres the _Nombres to set
     */
    public void setNombres(String _Nombres) {
        this._Nombres = _Nombres;
    }

    /**
     * @return the _Apellidos
     */
    public String getApellidos() {
        return _Apellidos;
    }

    /**
     * @param _Apellidos the _Apellidos to set
     */
    public void setApellidos(String _Apellidos) {
        this._Apellidos = _Apellidos;
    }

    /**
     * @return the _Telefono
     */
    public String getTelefono() {
        return _Telefono;
    }

    /**
     * @param _Telefono the _Telefono to set
     */
    public void setTelefono(String _Telefono) {
        this._Telefono = _Telefono;
    }

    /**
     * @return the _Email
     */
    public String getEmail() {
        return _Email;
    }

    /**
     * @param _Email the _Email to set
     */
    public void setEmail(String _Email) {
        this._Email = _Email;
    }

    /**
     * @return the _turno
     */
    public String getTurno() {
        return _turno;
    }

    /**
     * @param _turno the _turno to set
     */
    public void setTurno(String _turno) {
        this._turno = _turno;
    }

    /**
     * @return the _usario
     */
    public String getUsario() {
        return _usario;
    }

    /**
     * @param _usario the _usario to set
     */
    public void setUsario(String _usario) {
        this._usario = _usario;
    }

    /**
     * @return the _contraseña
     */
    public String getContraseña() {
        return _contraseña;
    }

    /**
     * @param _contraseña the _contraseña to set
     */
    public void setContraseña(String _contraseña) {
        this._contraseña = _contraseña;
    }
    
}