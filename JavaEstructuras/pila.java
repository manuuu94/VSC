package JavaEstructuras;

public class pila {
    
    private Nodo_P Top;
    String cadena;
    
    public void push(Nodo_P elementonuevo){
    elementonuevo.setAbajo(Top);
    Top=elementonuevo;
    
    }
    
    public  Nodo_P pop(){
    Nodo_P aux = Top;
    if(Pilavacia()){
     System.out.println("no hay datos en la pila");
    }else{
    Top=Top.getAbajo();
    aux.setAbajo(null);
    }    
    return aux;   
    }
       
    public void recorrer(){  
    Nodo_P aux=Top;
    if(Pilavacia()){
     System.out.println("no hay datos en la pila");
    }else{
        while(aux!=null){
        System.out.print(aux+"\n");
        aux = aux.getAbajo();
        }
    }
    }
     
    public String recorrer_to_String(){
    Nodo_P aux=Top;
    cadena="";
    if(Pilavacia()){
     System.out.println("no hay datos en el carrito");
    }else{
        while(aux!=null){
        cadena=cadena+aux+"\n"; 
        aux=aux.getAbajo();
        }
    }
    return cadena;
}
    
     public void vaciar_pila(){
     Top=null;
     }
     
    public boolean Pilavacia (){    
    if(Top==null){
     return true;
    }else{
     return false;  
    } 
}

 
    
}


