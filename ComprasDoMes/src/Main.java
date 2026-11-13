import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lista listProd = new Lista();

        Produto p1 = new Produto("Coca-cola", 5);
        if(listProd.add(p1)) {
            JOptionPane.showMessageDialog(null, "Adicionou o P1");
        }else {
            JOptionPane.showMessageDialog(null, "Não adicionou o P1");
        }

        listProd.add(new Produto("Chocolate", 2));

        // listProd.add(new Produto());
        }
    }