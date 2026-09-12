public class RedSocial {
    void enviarSolicitud(Usuario emisor, Usuario receptor) {
        String mensaje = "Nueva solicitud de amistad de : " + emisor.getNombreUsuario();


        receptor.recibirNotificaciones(mensaje);

        System.out.println("Solicitud enviada exitosamente de " + emisor.getNombreUsuario() + " a " + receptor.getNombreUsuario());
    }
}

