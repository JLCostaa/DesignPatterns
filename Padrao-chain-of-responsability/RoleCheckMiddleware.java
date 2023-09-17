package main;

public class RoleCheckMiddleware extends Middleware {

    public boolean check(String email, String password) {
        if (email.equals("fulano@gmail.com")) {
            System.out.println("olá, fulano!");
            return true;
        }
        System.out.println("olá, usuario!");
        return checkNext(email, password);
    }
}
