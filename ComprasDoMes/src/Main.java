import javax.swing.*;

public class Main {

    public static int menu(){
        String txt = "1) Adicionar Produto \n"
                   + "2) Imprimir lista \n"
                   + "3) Remover último \n"
                   + "0) Sair \n\n"
                   + "Digite sua opção: ";
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static void main(String[] args) {
        Lista listProd = new Lista();

        Produto p1 = new Produto("Coca-cola", 5);
        if(listProd.add(p1)) {
            JOptionPane.showMessageDialog(null, "Adicionou o P1");
        }else {
            JOptionPane.showMessageDialog(null, "Não adicionou o P1");
        }

        listProd.add(new Produto("Chocolate", 2));

        listProd.imprimir();

        // listProd.add(new Produto());
        }
    }