public class TesteIRjoao {
    public static void main(String[] args) {
        double salario = 3300.0;

        if (salario >= 1900.0 && salario < 2800.0) {
            System.out.println("o IR é de 7.5% e pode deduzir na declara o valor de R$ 142");
        } else if (salario >= 2800.0 && salario < 3751.5) {
            System.out.println("o IR é de 15% e pode deduzir R$ 350");
        } else if (salario >= 3751.5 && salario < 4664.00) {
            System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
        } else {
            System.out.println("Salario invalido");
        }
    }
}
