package JavaEstructuras;

public class UsuarioMetodoCola {
    private UsuarioNodoCola primero;
    private UsuarioNodoCola ultimo;
    
public void Encola(UsuarioNodoCola usuario){
        if(primero == null){
            primero = usuario;
            ultimo = usuario;
        }else{
            ultimo.setAtras(usuario);
            ultimo = usuario;
        }
    }
    
public boolean existe(String usuario, String contraseña){
    boolean esta = false;
    if (primero != null){
        UsuarioNodoCola aux = primero;
    while(aux != null && esta == false){
    esta = (aux.getUsuario().equals(usuario) && aux.getContraseña().equals(contraseña));
    aux = aux.getAtras();
    }
    }
    return esta;
}
    
}
