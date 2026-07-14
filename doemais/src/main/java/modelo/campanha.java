package modelo;
public class campanha {

    private String titulo;
    private String descricao;
    private double meta;
    private double arrecadado;

    // Construtor
    public campanha(String titulo, String descricao, double meta) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.meta = meta;
        this.arrecadado = 0;
    }

    // Método para adicionar doação
    public void adicionarDoacao(double valor) {
        arrecadado += valor;
    }

    // Método para calcular progresso
    public double calcularProgresso() {
        return (arrecadado / meta) * 100;
    }

    // Método para exibir informações
    public void exibircampanha() {

        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Meta: R$ " + meta);
        System.out.println("Arrecadado: R$ " + arrecadado);
        System.out.println("Progresso: " + calcularProgresso() + "%");
    }

    // Método principal
    public static void main(String[] args) {

        campanha campanha1 = new campanha(
            "Ajuda Solidária",
            "Campanha para arrecadar alimentos",
            1000
        );

        campanha1.adicionarDoacao(250);
        campanha1.adicionarDoacao(150);

        campanha1.exibircampanha();
    }
}