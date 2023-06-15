public class CriaConta {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 200;
        System.out.println(primeirConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println("Primeira conta tem: " + primeirConta.saldo);
        System.out.println("Segunda conta tem: " + segundaConta.saldo);

    }
}
