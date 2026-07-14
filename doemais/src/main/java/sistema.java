import java.util.ArrayList;

import modelo.campanha;
import modelo.usuario;

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

    public void cadastrarcampanha(campanha campanha1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarcampanha'");
    }

    public void login(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }
}