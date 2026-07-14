import modelo.usuario;

public class main {

    public static void main(String[] args) {

        usuario u = new usuario("Giselle", "giselle@email.com", "123456");

        System.out.println("Nome do usuário criado: " + u.getNome());
    }
}