Este programa está diseñado para modelar y gestionar el sistema de interacciones, solicitudes de amistad y notificaciones en una **red social** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Usuario`:** Modela un miembro registrado dentro de la plataforma conteniendo sus atributos principales: el nombre de usuario (`nombreUsuario`), una lista de amigos conectados (`listaAmigos`) y una bandeja de notificaciones (`bandejaNotificaciones`) implementada como una lista de cadenas de texto para almacenar los avisos y alertas recibidas.
* **Crea la clase `RedSocial`:** Implementa el componente de gestión central que contiene el método `enviarSolicitud(Usuario remitente, Usuario receptor)`, encargado de coordinar la lógica de negocio cuando un usuario desea conectar con otro.
* **Procesa la comunicación interna (`recibirNotificacion`):** Implementa un método específico dentro del receptor que recibe un mensaje formateado (por ejemplo, indicando que recibió una solicitud de amistad) y lo añade de forma automática a su bandeja de notificaciones personal.
* **Ejecuta la prueba (`main`):** Instancia dos usuarios distintos, simula el envío de una solicitud a través de la red social e imprime por consola el contenido de la bandeja de notificaciones del receptor para verificar que se haya actualizado correctamente.
