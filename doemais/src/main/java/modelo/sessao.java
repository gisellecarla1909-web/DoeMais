package modelo;
public class sessao {
 private boolean ativa;

    public void iniciarSessao() {
        ativa = true;
    }

    public void encerrarSessao() {
        ativa = false;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
