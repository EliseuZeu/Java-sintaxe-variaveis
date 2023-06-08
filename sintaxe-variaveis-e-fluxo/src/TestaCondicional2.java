public class TestaCondicional2 {
    public static void main(String[] args) {
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("Voce tem mais de 18 anos");
            System.out.println("Bem vindo");
        } else {
            System.out.println("Voce e menor de idade");
        }

    }
}
