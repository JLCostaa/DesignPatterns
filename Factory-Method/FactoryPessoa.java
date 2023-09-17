package principa;

class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("F")) {
            return new Mulher(nome);
        } else {
            return new Homem(nome);
        }
    }

}
