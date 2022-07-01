package JavaObjetoOrientado;

import java.sql.SQLOutput;

public class CriaConta {

    public static void main(String[] args) {
        Conta contadaHelo = new Conta(123, 345678);
        Cliente Helo = new Cliente();
        contadaHelo.deposita(300);
        contadaHelo.setTitular(Helo);
        Helo.setNome("Heloisa");
        Helo.setCpf("345.234.123-09");
        Helo.setProfissão("Developer");
        Conta contadoFelipe = new Conta(987, 987654);

        System.out.println(contadaHelo.getAgencia());
        System.out.println(contadaHelo.getNumero());
        System.out.println(contadaHelo.getTitular().getNome());
        System.out.println(contadaHelo.getTitular().getCpf());
        System.out.println(contadaHelo.getTitular().getProfissão());
        System.out.println(contadaHelo.getSaldo());
        System.out.println(Conta.getTotal());

    }
}
