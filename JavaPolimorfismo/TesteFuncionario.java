package JavaPolimorfismo;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario heloisa = new Funcionario("Heloisa Busquim", "123.456.789-00", 2600.00);
        System.out.println(heloisa.getSalario());
        System.out.println(heloisa.getBonificacao());
    }
}
