public class main {

    public static void main(String[] args) {

        // 1. Criando o objeto usuário com os 3 parâmetros que a classe espera
        usuario u = new usuario("Giselle", "giselle@email.com", "123456");

        // 2. Exibindo o nome do usuário no console para testar se funcionou
        System.out.println("Nome do usuário criado: " + u.getNome());
    }
}