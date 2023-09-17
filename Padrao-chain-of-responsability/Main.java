package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Servidor servidor;

    private static void init() {
        servidor = new Servidor();
        servidor.register("fulano@gmail.com", "fulano_pass");
        servidor.register("usuario@gmail.com", "usuario_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(servidor),
                new RoleCheckMiddleware()
        );

        servidor.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {

        boolean success;
        do {
            System.out.print("Entre co o seu email: ");
            String email = reader.readLine();
            System.out.print("Entre com sua senha: ");
            String password = reader.readLine();
            success = servidor.logIn(email, password);
        } while (!success);
    }
}
