package JavaEstructuras;

public class Arboles_inventario_limpieza {
    Nodo_arbol_inventario_limpieza raiz;
     
    public void insertar(int x,String carrito,String nombre,String cedula){
        if(raiz==null){
        raiz=new Nodo_arbol_inventario_limpieza(x,carrito,nombre,cedula);
        
        }else{
            insertarR(raiz,x,carrito,nombre,cedula);
        }
    
    }
   
     private void insertarR(Nodo_arbol_inventario_limpieza n,int x,String carrito,String nombre, String cedula){
         
         
     if(x<=n.getId()){
      if(n.getHijoIzq()==null){
        n.setHijoIzq(new Nodo_arbol_inventario_limpieza(x,carrito,nombre,cedula));
      }else{
          insertarR(n.getHijoIzq(), x,carrito,nombre,cedula);
      }     
     }else{
       if(n.getHijoDer()==null){
           n.setHijoDer(new Nodo_arbol_inventario_limpieza(x,carrito,nombre,cedula));
              }else{
           insertarR(n.getHijoDer(), x,carrito,nombre,cedula);
          }
        }      
      }
    
     public void inOrden(int x){
        
      if(raiz!=null){
        inOrdenR(raiz, x);
       
      
      }else{
          System.out.print("Árbol vacío...");
         
          
      }}
    public void inOrdenR(Nodo_arbol_inventario_limpieza n, int x){
      if(n!=null){
          if(n.getId()==x){
           System.out.print("numero de pedido: "+n.getId()+"\n"+n.getCarrito()+n.getNombre()+", "+n.getCedula()+"\n");
          }
          inOrdenR(n.getHijoIzq(),x);
//          System.out.print("");
          inOrdenR(n.getHijoDer(),x);
          
      }  
}
    
    
    
}

