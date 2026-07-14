package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.usuario;

public class UsuarioRepositorio {

    private Connection getConnection() throws SQLException {
        return GerenciadorDeConexao.getConnection();
    }

    public void salvar(usuario usuario) throws SQLException {

        String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";

        Connection conexao = getConnection();
        PreparedStatement comando = conexao.prepareStatement(sql);

        comando.setString(1, usuario.getNome());
        comando.setString(2, usuario.getEmail());
        comando.setString(3, usuario.getSenha());

        comando.executeUpdate();

        comando.close();
        conexao.close();
    }
}