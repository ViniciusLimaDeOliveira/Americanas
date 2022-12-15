package br.com.americas.atividade;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

/*
Twitter ADA!

Vamos construir uma replica do Twitter! O seu programa deve ter ao menos três funcionalidades:

1 - Cadastro de novos usuário

2 - Login de usuários cadastrados

3 - Publicar um tweet na timeline

4 - Visualizar tweets já publicados na timeline

Obs: tweets devem conter o usuário autor do tweet e a data na qual foi publicado.

Obs2: Não é necessário conexão com nenhum tipo de banco de dados, tudo será feito em memória.
*/
public class Main {
    static Mensagem[] feed = new Mensagem[500];
    static User[] users = new User[100];
    static int quantidadeUsers,quantidadeMensagens = 0;
    public static void main(String[] args){
        telaInicial();
    }


    public static void telaInicial(){
        Scanner scanner = new Scanner(System.in);
        int op=0;
        System.out.println("======================================");
        System.out.println("======= Bem vindo ao Twitter ADA =====");
        System.out.println("======================================");
        System.out.println("=== Se tiver uma conta digite 1 ======");
        System.out.println("=== Se quiser criar uma conta digite 2");
        System.out.println("=== Para sair digite 3 ===============");
        System.out.println("======================================");
        op = scanner.nextInt();
        switch (op){
            case 1: telaLogIn();
                break;
            case 2:  telaCad();
                break;
            case 3: System.exit(0);
                break;
            default:
                System.out.println("======================================");
                System.out.println("====== Digite uma opção valida !!! ===");
                System.out.println("======================================");
                telaInicial();
                break;
        }
    }
    public static void telaLogIn(){

        Scanner scanner = new Scanner(System.in);
        String nome,senha;
        System.out.println("======================================");
        System.out.println("======= Qual seu nome de usuario =====");
        System.out.println("======================================");
        nome = scanner.nextLine();
        System.out.println("======================================");
        System.out.println("======== Qual sua senha ? ============");
        System.out.println("======================================");
        senha = scanner.nextLine();
        if(quantidadeUsers>0){
            for (int i = 0; i < quantidadeUsers; i++) {
                if (users[i].nome.equals(nome)) {
                    if (users[i].senha.equals(senha)) {
                        telaTwitter(nome);
                    } else {
                        System.out.println("======================================");
                        System.out.println("== Senha ou nome incorretos ==========");
                        System.out.println("======================================");
                        telaLogIn();
                    }
                }
            }
        }else{
            System.out.println("======================================");
            System.out.println("====== Usuario não encontrado ========");
            System.out.println("======================================");
        }

        telaInicial();
    }
    public static void telaCad(){
        Scanner scanner = new Scanner(System.in);
        int op=0;
        String nome,senha;
        System.out.println("======================================");
        System.out.println("======= Qual seu nome de usuario =====");
        System.out.println("======================================");
        nome = scanner.nextLine();
        System.out.println("======================================");
        System.out.println("======== Qual sua senha  =============");
        System.out.println("======================================");
        senha = scanner.nextLine();

        for (int i=0;i<quantidadeUsers;i++) {
            if(users[i].nome.equals(nome)){
                System.out.println("======================================");
                System.out.println("===Nome ja em usso tente outro =======");
                System.out.println("======================================");
                telaCad();
            }
        }
        User novoUser = new User(nome,senha);
        users[quantidadeUsers]=novoUser;
        quantidadeUsers=quantidadeUsers+1;
        telaInicial();
    }
    public static void  telaTwitter(String nome){
        Scanner scanner = new Scanner(System.in);
        int op=0;
        System.out.println("======================================");
        System.out.println("=== Olá "+ nome +", bem vindo =============");
        System.out.println("======================================");
        System.out.println("======== Olhar feed  == 1 ============");
        System.out.println("======================================");
        System.out.println("======== Ecrever no feed == 2 ========");
        System.out.println("======================================");
        System.out.println("======== Deslogar ========= 3 ========");
        System.out.println("======================================");
        op = scanner.nextInt();
        switch (op){
            case 1:
                listarFeed(nome);
                break;
            case 2:
                escreverFeed(nome);
                break;
            case 3:
                telaInicial();
                break;
            default: telaTwitter(nome);
        }
    }
    public static void  listarFeed(String nome){
        Scanner scanner = new Scanner(System.in);
        int op=0;
        System.out.println("======================================");
        System.out.println("=== Olá "+ nome +", aqui seu feed =========");
        System.out.println("======================================");
        if(quantidadeMensagens>0){
            for (int i=0;i<quantidadeMensagens;i++){
                System.out.println("======================================");
                System.out.println(feed[i].toString());
                System.out.println("======================================");
            }
        }else {
            System.out.println("======================================");
            System.out.println("=============== Vazio  ===============");
            System.out.println("======================================");
        }
        Boolean stoper=true;
        while (stoper){
            op=0;
            System.out.println("======================================");
            System.out.println("==== Digite 1 para voltar    =========");
            System.out.println("======================================");
            System.out.println("==== Digite 2 para comentar  =========");
            System.out.println("======================================");
            op = scanner.nextInt();
            if(op==1){
                stoper=false;
                telaTwitter(nome);
            }
            if(op==2){
                stoper=false;
                escreverFeed(nome);
            }
        }
    }
    public static void  escreverFeed(String nome){
        Scanner scanner = new Scanner(System.in);
        String comentario;
        System.out.println("======================================");
        System.out.println("======= Oque esta pensando ? =========");
        System.out.println("======================================");
        comentario = scanner.nextLine();
        LocalDateTime data = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        Mensagem nova = new Mensagem(nome,comentario,data);
        System.out.println(nova);
        feed[quantidadeMensagens]=nova;
        quantidadeMensagens=quantidadeMensagens+1;
        listarFeed(nome);
    }


}
