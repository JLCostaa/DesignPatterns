package main;

public class UserExistsMiddleware extends Middleware {

    private Servidor servidor;

    public UserExistsMiddleware(Servidor servidor) {
        this.servidor = servidor;
    }

    public boolean check(String email, String password) {
        if (!servidor.hasEmail(email)) {
            System.out.println("Seu email não foi registrado!");
            return false;
        }
        if (!servidor.isValidPassword(email, password)) {
            System.out.println("Sua senha encontrasse incorreta!");
            return false;
        }
        return checkNext(email, password);
    }
}
