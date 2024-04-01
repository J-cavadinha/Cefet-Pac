public class PesoPesado extends Lutador {
    PesoPesado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public String impressao(String nome, int idade, double peso) {
        return nome + "/" + idade + "/" + peso;
    }

    private int modalidade = 1;

    public int getCategoria() {
        return this.modalidade;
    }
}
