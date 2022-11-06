package JavaEstructuras;

public class UsuarioNodoCola {
    private String usuario;
    private String contraseña;
    private UsuarioNodoCola atras;

    public UsuarioNodoCola(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public UsuarioNodoCola getAtras() {
        return atras;
    }

    public void setAtras(UsuarioNodoCola atras) {
        this.atras = atras;
    } 
    
}

