import java.util.ArrayList;

public class sistema {
    private ArrayList<usuario> usuarios;
    

    // Construtor
    public sistema() {
        usuarios = new ArrayList<usuario>();
    }

    // Cadastro de usuário
    public boolean cadastrarUsuario(usuario usuario) {

        for (usuario u : usuarios) {

            if (u.getEmail().equals(usuario.getEmail())) {

                System.out.println("E-mail já cadastrado!");
                return false;
            }
        }

        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
        return true;
    }
}