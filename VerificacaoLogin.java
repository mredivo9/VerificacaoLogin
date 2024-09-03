import java.util.Scanner;

public class VerificacaoLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "usuario";
        String senhaCorreta = "0000";

        System.out.println("Digite seu usuario");
        String usuario = sc.nextLine();

        System.out.println("Digite sua senha");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login efetuado com sucesso!");
        }
        else{
            System.out.println("Nome de usuario ou senha incorretos");
        }
        sc.close();
    }


}
