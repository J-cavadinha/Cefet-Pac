public class PesoMedio extends Lutador {
    PesoMedio(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public String impressao(String nome, int idade, double peso, int categoria) {
        return nome + "/" + idade + "/" + peso + "/" + categoria;
    }

    private int modalidade = 3;

    public int getCategoria() {
        return this.modalidade;
    }
}
