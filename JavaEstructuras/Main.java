package JavaEstructuras;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();
        UsuarioMetodoCola colaUsuario = new UsuarioMetodoCola();
        ListaCircularD lista = new ListaCircularD();
        Arboles_inventario_limpieza miarbol_inventario = new Arboles_inventario_limpieza();
        ListaSimple milistaS = new ListaSimple();
        pila mipila=new pila();
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        colaUsuario.Encola(new UsuarioNodoCola("man", "123")); //COLA


        Object[] message
                = {"Username:", username,
                    "Password:", password};
        
int seleccion_inven_limpieza = 0;
int seleccion_inven_lavados = 0;
int seleccion_inven_accesorios = 0;
int contador=0;
String carrito="";
Random x=new Random();

//menu pre-creado para el cliente
        listaCircular.inserta(new tipoLavado(1, "Lavado Sencillo", 25));
        listaCircular.inserta(new tipoLavado(2, "Lavado Sencillo c/ Aspirado", 35));
        listaCircular.inserta(new tipoLavado(3, "Lavado Vehiculos TodoTerreno 4x4", 30));
        
        lista.inserta(new Inventario_Pauto(1, "Escobilla", 40));
        lista.inserta(new Inventario_Pauto(2, "Gata", 25));
        
        milistaS.inserta(new Inventario_limpieza(1, "Limpieza de vidrios y parabrisas", 17.50));
        milistaS.inserta(new Inventario_limpieza(2, "Limpiador de tapiceria", 15));
        milistaS.inserta(new Inventario_limpieza(3, "Gel limpiador de llantas", 25.50));

// Proyecto con temática de aplicación de AutoLavado para clientes
        int opcion = 0;
        int i = 0;
        int j = 1;
//Menú de Acceso principal
try{
while (i < j) {
            opcion = menuAcceso();

            if (opcion == 1) {

                int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    if (colaUsuario.existe(username.getText(), password.getText())) {
                        JOptionPane.showMessageDialog(null, "Login successful");

                        JOptionPane.showMessageDialog(null, "Admin. Bienvenido.");
try{
                        while (i < j) {
                            int opcion2 = 0;
                            opcion2 = menuAdmin();
//INICIA MENU DE ADMINISTRADOR
                            if (opcion2 == 1) {
try{
                                while (i < j) {
                                    int opcion3 = 0;
                                    
                                    opcion3 = tiposLavado();
//VER
                                    if (opcion3 == 1) {
                                        JOptionPane.showMessageDialog(null, listaCircular);
                                    }
//AÑADIR
                                    if (opcion3 == 2) {
                                        System.out.println(listaCircular);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id de Lavado nuevo"));
                                        String nom = JOptionPane.showInputDialog("Ingrese descripcion del Lavado");
                                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
                                        listaCircular.inserta(new tipoLavado(id, nom, precio));
                                        System.out.println(listaCircular);
                                    }
//MODIFICAR
                                    if (opcion3 == 3) {
                                        System.out.println(listaCircular);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id de Lavado a modificar"));
                                        if (listaCircular.existe(id)) {

                                            String nom = JOptionPane.showInputDialog("Ingrese nueva descripcion del Lavado");
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nuevo precio"));
                                            listaCircular.modifica(new tipoLavado(id, nom, precio));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe TipoLavado con ese ID");
                                        }
                                        System.out.println(listaCircular);
                                    }
//ELIMINAR
                                    if (opcion3 == 4) {
                                        System.out.println(listaCircular);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id de Lavado a eliminar"));
                                        if (listaCircular.existe(id)) {
                                            listaCircular.elimina(id);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe TipoLavado con ese ID");
                                        }
                                        System.out.println(listaCircular);
                                    }
//SALIR
                                    if (opcion3 == 5) {
                                        i = 2;
                                        JOptionPane.showMessageDialog(null, "Regresando al menú de Administrador");

                                    }
                                }
                                            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
//Para regesar al menú principal sin salirse
                                i = 0;
                                j = 1;
                            }

                            if (opcion2 == 2) {
                                opcion = 0;
try{
                                while (i < j) {
                                    int opcion3 = 0;
                                    opcion3 = Inventario_limpieza();
//VER
                                    if (opcion3 == 1) {
                                        JOptionPane.showMessageDialog(null, milistaS);
                                    }
//AÑADIR
                                    if (opcion3 == 2) {
                                        System.out.println(milistaS);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del producto de limpieza"));
                                        String nom = JOptionPane.showInputDialog("Ingrese descripcion del producto de limpieza");
                                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
                                        milistaS.inserta(new Inventario_limpieza(id, nom, precio));
                                        System.out.println(milistaS);
                                    }
//MODIFICAR
                                    if (opcion3 == 3) {
                                        System.out.println(milistaS);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del producto de limpieza"));
                                        if (milistaS.existe(id)) {

                                            String nom = JOptionPane.showInputDialog("Ingrese nueva descripcion del producto de limpieza");
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nuevo precio"));
                                            milistaS.modifica(new Inventario_limpieza(id, nom, precio));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe producto de limpieza con ese ID");
                                        }
                                        System.out.println(milistaS);
                                    }
//ELIMINAR
                                    if (opcion3 == 4) {
                                        System.out.println(milistaS);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del producto de limpieza a eliminar"));
                                        if (milistaS.existe(id)) {
                                            milistaS.elimina(id);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe producto de limpieza con ese ID");
                                        }
                                        System.out.println(milistaS);
                                    }
//SALIR
                                    if (opcion3 == 5) {
                                        i = 2;
                                        JOptionPane.showMessageDialog(null, "Regresando al menú de Administrador");

                                    }
                                }
                                            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
//Para regesar al menú principal sin salirse
                                i = 0;
                                j = 1;
                            }

                            if (opcion2 == 3) {
try{
                                while (i < j) {
                                    int opcion3 = 0;
                                    opcion3 = tiposAccesorios();
//VER
                                    if (opcion3 == 1) {
                                        JOptionPane.showMessageDialog(null, lista);
                                    }
//AÑADIR
                                    if (opcion3 == 2) {
//                                        System.out.println(lista);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del Accesorio"));
                                        String descri = JOptionPane.showInputDialog("Ingrese descripcion del Accesorio");
                                        double pre = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio."));
                                        lista.inserta(new Inventario_Pauto(id, descri, pre));
                                        System.out.println(lista);
                                    }
//MODIFICAR
                                    if (opcion3 == 3) {
                                        System.out.println(lista);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del Accesorio a modificar"));
                                        if (lista.existe(id)) {

                                            String des = JOptionPane.showInputDialog("Ingrese nueva descripcion del Accesorio");
                                            double prec = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio."));
                                            lista.modifica(new Inventario_Pauto(id, des, prec));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe Accesorio con ese ID");
                                        }
                                        System.out.println(listaCircular);
                                    }
//ELIMINAR
                                    if (opcion3 == 4) {
                                        //System.out.println(lista);
                                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del Accesorio"));
                                        if (lista.existe(id)) {
                                            lista.eliminaValor(id);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No existe Accesorio con ese ID");
                                        }
                                        System.out.println(lista);
                                    }
                                    if (opcion3 == 5) {
                                        i = 2;
                                        JOptionPane.showMessageDialog(null, "Regresando al menú de Administrador");

                                    }
                                }
                                            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
//Para regesar al menú principal sin salirse
                                i = 0;
                                j = 1;
                            }
if(opcion2 == 4){
    i = 2;   
    JOptionPane.showMessageDialog(null, "Regresando al menú principal");     
    
} 
}
                                    } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
//Para regesar al menú principal sin salirse
i=0; j=1;

} else {
        JOptionPane.showMessageDialog(null,"login failed");
    }
} else {
    JOptionPane.showMessageDialog(null,"Login canceled");
}
}

//CLIENTE
            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Cliente. Bienvenido.");
//menu de clientes
try{
                while (i < j) {
                    int opcion3 = 0;
                    opcion3 = menuCliente();
                    //OPCION 1 CLIENTE
                    if (opcion3 == 1) { 
    do{
     seleccion_inven_lavados = Integer.parseInt(JOptionPane.showInputDialog(listaCircular+
            "\n"+"1. Añadir un ID al carrito "+"\n"+
            "2. Ver Carrito "+
            "\n"+"0. si desea salir digite o confirmar carrito "  ));
    switch (seleccion_inven_lavados){
        case 1:
    int producto_comp=Integer.parseInt(JOptionPane.showInputDialog("*****Inventario Lavados*****\n"+
    listaCircular+"\n"+"Digite el id del producto que desea comprar"));
           tipoLavado p = listaCircular.pasar(producto_comp);                      
            if(listaCircular.existe(producto_comp)){
    String detalle_producto_comp= p.getDescripcion();
    double precio_producto_comp=p.getPrecio();
    mipila.push(new Nodo_P(contador++, detalle_producto_comp, precio_producto_comp));
            }
            break;
            
        case 2:
           mipila.recorrer();
            break;
            
        case 0:
            //SALIR
            break;
       
        default:
                JOptionPane.showMessageDialog(null, "usted digito un valor incorrecto");
            break;
    } }while(seleccion_inven_lavados!=0); 
}                  
                    //OPCION 2 CLIENTE
                    if (opcion3 == 2) {
    do{
     seleccion_inven_limpieza=Integer.parseInt(JOptionPane.showInputDialog(milistaS+
            "\n"+"1. Añadir un ID al carrito "+"\n"+
            "2. Ver Carrito "+
            "\n"+"0. si desea salir digite o confirmar carrito "  ));
    switch (seleccion_inven_limpieza){
        case 1:
    int producto_comp=Integer.parseInt(JOptionPane.showInputDialog("*****Inventario limpieza*****\n"+
    milistaS+"\n"+"Digite el id del producto que desea comprar"));
           Inventario_limpieza p = milistaS.pasar(producto_comp);                      
            if(milistaS.existe(producto_comp)==true){           
            String detalle_producto_comp = p.getDescripcion();
    double precio_producto_comp = p.getPrecio();
    mipila.push(new Nodo_P(contador++, detalle_producto_comp, precio_producto_comp));
            }
            break;
            
        case 2:
           mipila.recorrer();
            break;
            
        case 0: 
            //SALIR
            break;
       
        default:
                JOptionPane.showMessageDialog(null, "usted digito un valor incorrecto");
            break;
    } }while(seleccion_inven_limpieza!=0); 
}
//OPCION 3 CLIENTE                    
if(opcion3 == 3){
    do{
     seleccion_inven_accesorios = Integer.parseInt(JOptionPane.showInputDialog(lista+
            "\n"+"1. Añadir un ID al carrito "+"\n"+
            "2. Ver Carrito "+
            "\n"+"0. si desea salir digite o confirmar carrito "  ));
    switch (seleccion_inven_accesorios){
        case 1:
    int producto_comp=Integer.parseInt(JOptionPane.showInputDialog("*****Inventario Accesorios*****\n"+
    lista+"\n"+"Digite el id del producto que desea comprar"));
           Inventario_Pauto p = lista.pasar(producto_comp);                      
            if(lista.existe(producto_comp)){
    String detalle_producto_comp= p.getDescripcion();
    double precio_producto_comp=p.getPrecio();
    mipila.push(new Nodo_P(contador++, detalle_producto_comp, precio_producto_comp));
            }
            break;
            
        case 2:
           mipila.recorrer();
            break;
            
        case 0:
            //SALIR
            break;
       
        default:
                JOptionPane.showMessageDialog(null, "usted digito un valor incorrecto");
            break;
    } }while(seleccion_inven_accesorios!=0);     
  
}
//OPCION 4 CLIENTE
if(opcion3 == 4){
    //VER Y CONFIRMAR CARRITO
    carrito=mipila.recorrer_to_String();
       System.out.print(carrito);
       if(!"".equals(mipila.cadena)){
   int confirmar=JOptionPane.showConfirmDialog(null,
                "¿Desea confirmar la compra?","Confirmar pedido",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si desea confirmar el carrito"));
    
   if(confirmar==0){
    String nombre=JOptionPane.showInputDialog("Digite nombre completo");
    String cedula=JOptionPane.showInputDialog("Digite la cedula completa");
    int n = x.nextInt(1000);     
    
    miarbol_inventario.insertar(n, carrito,nombre,cedula);
    miarbol_inventario.inOrden(n);
    System.out.print("\n");
   mipila.vaciar_pila();
   }
   }     
}
if(opcion3==5){
    //VACIAR CARRITO
    carrito=mipila.recorrer_to_String();
    System.out.print(carrito);
    if(!"".equals(mipila.cadena)){
    int confirmar=JOptionPane.showConfirmDialog(null,
                "¿Desea vaciar el carrito?","Vaciar Carrito",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(confirmar==0){
    mipila.vaciar_pila();
    }
}
}
//OPCION 5 CLIENTE
if(opcion3==6){
 i = 2;  
JOptionPane.showMessageDialog(null, "Regresando al menú principal");
}
}
                            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
//Para regesar al menú principal sin salirse
i=0; j=1;    
}    

           
//SALIR DEL MENU PRINCIPAL Y DEL PROGRAMA
            if (opcion == 3) {
                i = 2;
                JOptionPane.showMessageDialog(null, "Ha salido");
            }
        }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"No se ingresó un valor válido o se ha cancelado el programa");
            }
    }

////////////////////////////////////////////////
    public static int menuAcceso() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "*****MENÚ PRINCIPAL*****\n"
                + "1. Admin.\n"
                + "2. Cliente\n"
                + "3. Salir\n"
                + "Digite el # según su Rol"));
        return opcion;
    }
    public static int menuAdmin() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "*****MENÚ ADMINISTRADOR*****\n"
                + "1. Lavados p/ Autos\n"
                + //LISTA CIRCULAR - CHECK - MANUEL
                "2. Inventario p/ Limpieza\n"
                + // LISTA SIMPLE - JOSTIN WORK IN PROGRESS 
                "3. Inventario Accesorios p/ Autos\n"
                + // LISTA DOBLE CIRCULAR - DONALD WORK IN PROGRESS
                "4. Salir\n"
                + "Digite el # de lo que sea gestionar:"));
        return opcion;
    }
    public static int tiposLavado() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "*****Tipos de Lavado*****\n"
                + "1. Ver Tipos de Lavados\n"
                + "2. Añadir Lavados\n"
                + "3. Editar Lavados\n"
                + "4. Eliminar Lavados\n"
                + "5. Salir\n"
                + "Digite el # de lo que sea gestionar:"));
        return opcion;
    }
    public static int tiposLavadoCliente() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "*****Tipos de Lavado*****\n"
                + "1. Ver Tipos de Lavados\n"
                + "2. Salir\n"
                + "Digite el # de lo que sea gestionar:"));
        return opcion;
    }
    public static int Inventario_limpieza() {
        int opcion2_1 = Integer.parseInt(JOptionPane.showInputDialog(
                "*****Inventario de limpieza*****\n"
                + "1. Ver productos de limpieza\n"
                + "2. Añadir producto de limpieza\n"
                + "3. Editar producto de limpieza\n"
                + "4. Eliminar Producto de limpieza\n"
                + "5. Salir\n"
                + "Digite el # de lo que sea gestionar:"));
        return opcion2_1;
    }
    public static int tiposAccesorios() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "*****Tipos de Accesorios*****\n"
                + "1. Ver Tipos de Accesorios\n"
                + "2. Añadir Accesorio\n"
                + "3. Editar Accesorio\n"
                + "4. Eliminar Accesorio\n"
                + "5. Salir\n"
                + "Digite el # de lo que sea gestionar:"));
        return opcion;
    }
    public static int menuCliente(){
int opcion = Integer.parseInt(JOptionPane.showInputDialog(
"*****MENÚ CLIENTE*****\n"+
"1. Ver Lavados p/ Autos\n" +
"2. Ver Inventario p/ Limpieza\n" +
"3. Ver Inventario Accesorios p/ Autos\n" +
"4. Ver y confirmar carrito\n" +
"5. Vaciar Carrito\n"+
"6. Salir\n"+
"Digite la opción que desea ejecutar:"));
    return opcion;
}
}
