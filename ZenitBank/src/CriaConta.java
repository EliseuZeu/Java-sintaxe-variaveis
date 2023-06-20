public class CriaConta {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.getSaldo();
        System.out.println(primeirConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.getSaldo();

        System.out.println("Primeira conta tem: " + primeirConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
        primeirConta.deposita(100);
        System.out.println("Primeira conta tem: " + primeirConta.getSaldo());

    }
}
