package JavaObjetoOrientado;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();
        primeiraConta.deposita(200);
        segundaConta.deposita(300);
        primeiraConta.transfere(100, segundaConta);
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
    }
}
