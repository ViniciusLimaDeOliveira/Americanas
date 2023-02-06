package br.com.americanas.polotech.q1;

import br.com.americanas.polotech.q1.handler.HandlerFile;
import br.com.americanas.polotech.q1.objetcs.MFile;

import java.util.Scanner;

import static br.com.americanas.polotech.q1.enums.MFileAnnotationTypeEnum.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static HandlerFile handlerFile = new HandlerFile();
    public static void main(String[] args) {
        menuPrincipal();
        //handlerFile.removeAFolderWithName("teste");
        //handlerFile.createFolderWithName("reminders","C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1");
        //handlerFile.createFolderWithName("UmTesteSimples","C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1",REMINDER);
        //handlerFile.listAllFoldersType(REMINDER);
        //MFile teste = new MFile("Teste","Teste",REMINDER,"C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1");
        //handlerFile.saveFileWithDirectory(teste);
        //handlerFile.removeFileWithName("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1","Teste",REMINDER);
        //handlerFile.recoveryFileWhitName("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1\\reminders","Teste");
        //handlerFile.listAllFolders("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1\\reminders");
        //handlerFile.saveImageFile("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1","https://imagens.mdig.com.br/semana/sem523/sem523_025.jpg","dogos");
        //handlerFile.removeImageWhitName("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1","dogos");
       //handlerFile.retrieveImageWithName("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1","dogos");
       // handlerFile.listAllImages("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\Questão Americanas\\q1");

    }

    private static void menuPrincipal() {
        System.out.println("======================================================================");
        System.out.println("============ Opções ==================================================");
        System.out.println("======================================================================");
        System.out.println("===== Menu pastas =============== 1 ==================================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Menu Tipos de TXT  ======== 2 ==================================");
        System.out.println("======================================================================");
        System.out.println("===== Menu Imagem =============== 3 ==================================");
        System.out.println("======================================================================");
        System.out.println("===== Sair do progama =========== 4 ==================================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                menuPasta();
            }
            case 2->{
                menuTiposDeArquivo();
            }
            case 3->{
                menuImagem();
            }
            case 4->{
                System.exit(0);
            }
            default -> {
                menuPrincipal();
            }
        }
    }

    private static void menuTiposDeArquivo() {
        System.out.println("======================================================================");
        System.out.println("============ Opções ==================================================");
        System.out.println("======================================================================");
        System.out.println("===== Criar um arquivo ========================= 1 ===================");
        System.out.println("======================================================================");
        System.out.println("===== Remover um arquivo ======================= 2 ===================");
        System.out.println("======================================================================");
        System.out.println("===== Retrieve um arquivo ====================== 3 ===================");
        System.out.println("======================================================================");
        System.out.println("===== Listar todos os arquivos ================= 4 ===================");
        System.out.println("======================================================================");
        System.out.println("===== Voltar para menu principal =============== 5 ===================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                criarUmArquivo();
                menuPrincipal();
            }
            case 2->{
                removerUmArquivo();
                menuPrincipal();
            }
            case 3->{
                retrieveUmArquivo();
                menuPrincipal();
            }
            case 4->{
                listarArquivos();
                menuPrincipal();
            }
            case 5->{
                menuPrincipal();
            }
        }
    }

    private static void listarArquivos() {
        System.out.println("======================================================================");
        System.out.println("===== Forneça o caminho ==============================================");
        System.out.println("======================================================================");
        String path = scanner.nextLine();
        handlerFile.listAllFiles(path);
    }

    private static void retrieveUmArquivo() {
        System.out.println("======================================================================");
        System.out.println("===== Forneça o nome do arquivo ======================================");
        System.out.println("======================================================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Forneça o caminho ==============================================");
        System.out.println("======================================================================");
        String path = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Retrieve um arquivo do tipo ====================================");
        System.out.println("======================================================================");
        System.out.println("===== Reminder ========================== 1 ==========================");
        System.out.println("===== Important ========================= 2 ==========================");
        System.out.println("===== Simple ============================ 3 ==========================");
        System.out.println("===== Cancelar ========================== 4 ==========================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                path=path+"\\reminers";
                handlerFile.recoveryFileWhitName(path,nome);
                menuPrincipal();
            }
            case 2->{
                path=path+"\\importants";
                handlerFile.recoveryFileWhitName(path,nome);
                menuPrincipal();
            }
            case 3->{
                handlerFile.recoveryFileWhitName(path,nome);
                menuPrincipal();
            }
            case 4->{
                menuPrincipal();
            }
        }
    }

    private static void removerUmArquivo() {
        System.out.println("======================================================================");
        System.out.println("===== Forneça o nome do arquivo ======================================");
        System.out.println("======================================================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Forneça o caminho ==============================================");
        System.out.println("======================================================================");
        String path = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Remover um arquivo do tipo =====================================");
        System.out.println("======================================================================");
        System.out.println("===== Reminder ========================== 1 ==========================");
        System.out.println("===== Important ========================= 2 ==========================");
        System.out.println("===== Simple ============================ 3 ==========================");
        System.out.println("===== Cancelar ========================== 4 ==========================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                handlerFile.removeFileWithName(path,nome,REMINDER);
                menuPrincipal();
            }
            case 2->{
                handlerFile.removeFileWithName(path,nome,IMPORTANT);
                menuPrincipal();
            }
            case 3->{
                handlerFile.removeFileWithName(path,nome,SIMPLE);
                menuPrincipal();
            }
            case 4->{
                menuPrincipal();
            }
        }
    }

    private static void criarUmArquivo() {
        System.out.println("======================================================================");
        System.out.println("===== Forneça o nome do arquivo ======================================");
        System.out.println("======================================================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Forneça o conteudo do arquivo de texto =========================");
        System.out.println("======================================================================");
        String content = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Forneça o caminho onde o arquivo sera salvado ==================");
        System.out.println("======================================================================");
        String path = scanner.nextLine();
        System.out.println("======================================================================");
        System.out.println("===== Criar um aquivo do tipo ========================================");
        System.out.println("======================================================================");
        System.out.println("===== Reminder ========================== 1 ==========================");
        System.out.println("===== Important ========================= 2 ==========================");
        System.out.println("===== Simple ============================ 3 ==========================");
        System.out.println("===== Cancelar ========================== 4 ==========================");
        System.out.println("======================================================================");
        MFile mFile;
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                 mFile = new MFile(content,nome,REMINDER,path);
                 handlerFile.saveFileWithDirectory(mFile);
                 menuPrincipal();
            }
            case 2->{
                mFile = new MFile(content,nome,IMPORTANT,path);
                handlerFile.saveFileWithDirectory(mFile);
                menuPrincipal();
            }
            case 3->{
                mFile = new MFile(content,nome,SIMPLE,path);
                handlerFile.saveFileWithDirectory(mFile);
                menuPrincipal();
            }
            case 4->{
                menuPrincipal();
            }
        }
    }

    private static void menuImagem() {
        System.out.println("======================================================================");
        System.out.println("======================== Menu Imagem =================================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Salvar Imagem =================== 1 ============================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Retrieve Imagem ================= 2 ============================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Excluir Imagem ================== 3 ============================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Listar Imagens de um diretorio == 4 ============================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Voltar para menu principal ====== 5 ============================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1->{
                System.out.println("======================================================================");
                System.out.println("===== Forneça o nome da Imagem =======================================");
                System.out.println("======================================================================");
                String nome = scanner.nextLine();
                System.out.println("======================================================================");
                System.out.println("===== Forneça o link URL para a imagem ===============================");
                System.out.println("======================================================================");
                String content = scanner.nextLine();
                System.out.println("======================================================================");
                System.out.println("===== Forneça o caminho onde a imagem sera salva =====================");
                System.out.println("======================================================================");
                String path = scanner.nextLine();
                MFile mFile=new MFile(content,nome,IMAGE,path);
                handlerFile.saveImageFile(mFile);
                menuPrincipal();
            }
            case 2->{
                System.out.println("======================================================================");
                System.out.println("===== Forneça o nome da Imagem =======================================");
                System.out.println("======================================================================");
                String nome = scanner.nextLine();
                System.out.println("======================================================================");
                System.out.println("===== Forneça o caminho onde a imagem esta salva =====================");
                System.out.println("======================================================================");
                String path = scanner.nextLine();
                handlerFile.retrieveImageWithName(path,nome);
                menuPrincipal();
            }
            case 3->{
                System.out.println("======================================================================");
                System.out.println("===== Forneça o nome da Imagem =======================================");
                System.out.println("======================================================================");
                String nome = scanner.nextLine();
                System.out.println("======================================================================");
                System.out.println("===== Forneça o caminho onde a imagem esta salva =====================");
                System.out.println("======================================================================");
                String path = scanner.nextLine();
                handlerFile.removeImageWhitName(path,nome);
                menuPrincipal();
            }
            case 4->{
                System.out.println("Forneça o caminho do diretorio  a ter suas imagens listadas:");
                String path = scanner.nextLine();
                handlerFile.listAllFiles(path);
                menuPrincipal();
            }
            case 5->{
                menuPrincipal();
            }
            default -> {
                menuImagem();
            }
        }
    }

    private static void menuPasta() {
        System.out.println("======================================================================");
        System.out.println("======================== Menu pastas =================================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Criar pasta Reminder ==================== 1 ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Criar pasta Important =================== 2 ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Criar pasta Imagem ====================== 3 ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Criar pasta com nome especifico ========= 4 ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Excluir pasta e conteudo dela   ========= 5 ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===== Listar todas as pastas de um diretorio == 6 ====================");
        System.out.println("======================================================================");
        System.out.println("===== Voltar para menu principal ============== 7 ====================");
        System.out.println("======================================================================");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch (op){
            case 1:{
                System.out.println("Forneça o caminho do diretorio onde a pasta sera criada:");
                String path = scanner.nextLine();
                handlerFile.createFolderWithType(path,REMINDER);
                menuPasta();
                break;
            }
            case 2:{
                System.out.println("Forneça o caminho do diretorio onde a pasta sera criada:");
                String path = scanner.nextLine();
                handlerFile.createFolderWithType(path,IMPORTANT);
                menuPasta();
                break;
            }
            case 3:{
                System.out.println("Forneça o caminho do diretorio onde a pasta sera criada:");
                String path = scanner.nextLine();
                handlerFile.createFolderWithType(path,IMAGE);
                menuPasta();
                break;
            }
            case 4:{
                System.out.println("Forneça o caminho do diretorio onde a pasta sera criada:");
                String path = scanner.nextLine();
                System.out.println("Forneça o nome da pasta:");
                String nomePasta = scanner.nextLine();
                handlerFile.createFolderWithName(nomePasta,path);
                menuPasta();
                break;
            }
            case 5:{
                System.out.println("Forneça o nome da pasta:");
                String nomePasta = scanner.nextLine();
                System.out.println("Forneça o caminho do diretorio ser excluida:(Sem conter ela)");
                String path = scanner.nextLine();
                handlerFile.removeAFolderWithName(path,nomePasta);
                menuPasta();
               break;
            }
            case 6:{
                System.out.println("Forneça o caminho do diretorio  a ter suas pastas listadas");
                String path = scanner.nextLine();
                handlerFile.listAllFolders(path);
                menuPasta();
                break;
            }
            case 7:{
                menuPrincipal();
                break;
            }
        }
    }
}
