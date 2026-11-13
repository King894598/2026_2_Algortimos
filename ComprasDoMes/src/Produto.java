public class Produto {
    String nome;
    int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.quantidade + "unidade";
    }

    public Produto(){

    }
}
