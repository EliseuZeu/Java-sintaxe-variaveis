public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 1231345325353l;
        short numeroPequeno = 13;
        float pontoFlutuante = 3.14f;
        System.out.println("Numero grande e" + numeroGrande + ", Numero pequeno e " + numeroPequeno
                + "e ponto Flutuante e" + pontoFlutuante);
    }
}
