import java.util.ArrayList;

public class Lista {
    ArrayList<Produto> produtos;

    public Lista() {
        this.produtos = new ArrayList<Produto>();
    }

    public boolean add(Produto prod) {
        if (prod != null) {
            if (!prod.nome.isEmpty()&& prod.quantidade >= 0){
                this.produtos.add(prod);

            }
        }
        return false;
    }

    public void imprimir(){
        String txt = "";
        for(Produto prod: this.produtos){
            txt += prod.nome;
        }
    }
}