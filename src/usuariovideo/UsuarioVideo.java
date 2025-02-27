/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author juqui
 */
public class UsuarioVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Usuario usuario=new Usuario("MACACO","macaco@gmail.com");
       Video video=new Video ("Monky Flip" , 3600);
       usuario.verVideo(video);
       video.detener();
       Comentario comentario1 = new Comentario("¡Este video es increíble!");
       

    // Mostrar los comentarios
    System.out.println("\nComentarios sobre el video '" + video.getTitulo() + "':");
    comentario1.mostrarComentario();
    }
    
}
