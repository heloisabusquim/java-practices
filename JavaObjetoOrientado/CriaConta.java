package JavaObjetoOrientado;

public class CriaConta {

    public static void main(String[] args) {
        Conta contadaHelo = new Conta();
        Cliente Helo = new Cliente();
        contadaHelo.deposita(300);
        contadaHelo.setAgencia(123);
        contadaHelo.setNumero(345678);
        contadaHelo.setTitular(Helo);
        Helo.setNome("Heloisa");
        Helo.setCpf("345.234.123-09");
        Helo.setProfissão("Developer");

        System.out.println(contadaHelo.getAgencia());
        System.out.println(contadaHelo.getNumero());
        System.out.println(contadaHelo.getTitular().getNome());
        System.out.println(contadaHelo.getTitular().getCpf());
        System.out.println(contadaHelo.getTitular().getProfissão());
        System.out.println(contadaHelo.getSaldo());

    }
}
