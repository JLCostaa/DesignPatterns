package principa;

public class Principa {

    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryPessoa();
        String nome = "Marina";
        String sexo = "F";
        factory.getPessoa(nome, sexo);
    }

}
