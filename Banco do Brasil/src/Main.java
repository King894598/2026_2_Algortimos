import javax.swing.*;

public class Main {

    private static int menu(){
        String txt = "1) Mostrar Saldo \n";
        txt +=       "2) Depositar \n";
        txt +=       "3) Sacar \n";
        txt +=       "0) Sair \n\n";
        txt +=       "Digite sua opção:";
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static void main(String[] args){
        String txt = "Qual tipo de cliente \n1)Físico \n2)Jurídico:";
        int tipoCli = Integer.parseInt(JOptionPane.showInputDialog(txt));
        Cliente client = null;
        String nome = JOptionPane.showInputDialog("Nome do Cliente;");
        if(tipoCli == 1) {
            String cpf = JOptionPane.showInputDialog("CPF:");
            client = new Fisico(nome, cpf);
        }else {
            String cnpj = JOptionPane.showInputDialog("CNPJ:");
            client = new Juridico(nome, cnpj);
        }

        Conta c1 = new Conta();
        c1.titular = client;
    }
}