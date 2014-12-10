package dao.to;

public class RepartidorTO {
    private int _Id;
    private int _Dni;
    private String _Nombres;
    private String _Apellidos;
    private String _Telefono;
    private String _Email;
    private String _turno;
    private String _usario;
    private String _contraseña;

    private String _cargo;
    
    public RepartidorTO(){
        
    }
            
    public RepartidorTO(int _Id, int _Dni, String _Nombres, String _Apellidos, String _Telefono, String _Email, String _turno, String _usario, String _contraseña, String cargo) {
        this._Id = _Id;
        this._Dni = _Dni;
        this._Nombres = _Nombres;
        this._Apellidos = _Apellidos;
        this._Telefono = _Telefono;
        this._Email = _Email;
        this._turno = _turno;
        this._usario = _usario;
        this._contraseña = _contraseña;
        this._cargo= cargo;
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
    
    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String _cargo) {
        this._cargo = _cargo;
    }
}
