
public class Colaborador {

    int matricula;
    String nome;
    double salarioBase;

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario final: " + calcularSalarioFinal());
    }
}
