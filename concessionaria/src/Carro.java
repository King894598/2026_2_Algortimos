import java.util.Scanner;
public class Carro extends Veiculo{
    public int qtdPortas;
    public int volumePortaMalas;

    @Override
    public void cadastrar() {
        System.out.print("Cadastre seu Carro: ");
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de portas: ");
        this.qtdPortas = ler.nextInt();
        System.out.print("Digite o volume do porta-malas: ");
        this.volumePortaMalas = ler.nextInt();

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de Portas: " + this.qtdPortas);
        System.out.println("Volume do porta-malas: " + this.volumePortaMalas + "litros");

    }
}