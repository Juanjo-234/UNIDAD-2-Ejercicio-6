import java.util.ArrayList;
import java.util.List;

 class Usuario {
    String nombreUsuario;
    List<Usuario> listaAmigos;
    List<String> BandejaNotificaciones;

 public Usuario(String nombreUsuario){
     this.nombreUsuario = nombreUsuario;
        this.listaAmigos = new ArrayList<>();
        this.BandejaNotificaciones = new ArrayList<>();
    }

String getNombreUsuario(){
        return  nombreUsuario;
}

void recibirNotificaciones(String mensaje){
     BandejaNotificaciones.add(mensaje);
}



     void mostrarNotificaciones(){
     System.out.println("Notificacion recibida de parte de: " + getNombreUsuario());
         if (BandejaNotificaciones.isEmpty()) {
             System.out.println("(Sin notificaciones)");
         }else {
             for(String notificacion : BandejaNotificaciones){
                 System.out.println("- " + notificacion);
             }
         }
     }
 }
