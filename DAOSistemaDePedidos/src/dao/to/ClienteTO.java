package dao.to;

public class ClienteTO {
    private String _Id;
    private int _Dni;
    private String _Nombres;
    private String _Apellidos;
    private String _Telefono;
    private String _Email;
    private String _Direccion;
    private String _Distrito;
    public ClienteTO(){
        
    }

    public ClienteTO(String _Id, int _Dni, String _Nombres, String _Apellidos, String _Telefono, String _Email, String _Direccion, String _Distrito) {
        this._Id = _Id;
        this._Dni = _Dni;
        this._Nombres = _Nombres;
        this._Apellidos = _Apellidos;
        this._Telefono = _Telefono;
        this._Email = _Email;
        this._Direccion = _Direccion;
        this._Distrito = _Distrito;
    }


    public ClienteTO(ClienteTO aux){
        this._Id = aux._Id;
        this._Dni = aux._Dni;
        this._Nombres =aux. _Nombres;
        this._Apellidos =aux. _Apellidos;
        this._Telefono = aux._Telefono;
        this._Email =aux. _Email;
        this._Direccion =aux. _Direccion;
        this._Distrito =aux. _Distrito;
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
    public int getDni() {
        return _Dni;
    }

    /**
     * @param _Dni the _Dni to set
     */
    public void setDni(int _Dni) {
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
}
