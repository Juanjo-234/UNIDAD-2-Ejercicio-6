//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Usuario usuario1 = new Usuario("Juan Perez");
    Usuario usuario2  =new Usuario("Marcos Sanchez");


    RedSocial miRed = new RedSocial();

miRed.enviarSolicitud(usuario1, usuario2);

System.out.println();
usuario2.mostrarNotificaciones();

}

