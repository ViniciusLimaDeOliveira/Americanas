package br.com.americanas.livraria;

import br.com.americanas.livraria.financeiro.Caixa;
import br.com.americanas.livraria.produtos.*;

import java.util.ArrayList;
import java.util.Scanner;

/*
Enunciado
No exemplo a seguir você deve implementar o sistema de uma livraria.
Primeira etapa Regras de Implementação O sistema deve ser capaz de cadastrar os seguintes produtos: livros, jogos, filmes, álbuns de música e brinquedos.

Livros: Devem ter nome, id, preço, gêneros, escritor, editora .

Jogos: Devem ter nome, id, preço, distribuidora, gêneros e estúdio

Filmes: Devem ter nome, id, preço, estúdio, diretores, gêneros e produtores

Álbuns de música: Devem ter nome, id, preço, músicos/bandas, gêneros e selos

Brinquedos: Devem ter nome, id, preço e tipo.

Além disso nosso sistema deve possuir um caixa. Este caixa deve ter a informação de dinheiro que está presente nele.

Algumas funcionalidades do sistema: Você deve ser capaz de adicionar, ver, alterar e remover qualquer produto do sistema.
Você deve ser capaz de ver quantos itens de um tipo específico existem no estoque. Você deve ser capaz de ver a listagem completa
 dos itens em estoque. Você deve ser capaz de ver a listagem dos itens em estoque por categoria. Você deve ser capaz de realizar a
 operação de compra, ao realizar esta operação os produtos comprados são removidos do estoque e o dinheiro pago deve ser adicionado ao caixa.
*/
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Caixa cx = new Caixa(0.0);
    static int contador=0;
    static ArrayList<Produto> bancoDeDados = new ArrayList<>();

    public static void main(String[] args){
        Livro a = new Livro(contador,"Teste", 12.0,1,"Teste genero","Teste escritor","Teste editora");
        contador=contador+1;
        bancoDeDados.add(a);
        telaIncial();
    }
    public static void telaIncial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("======= Bem vindo ao Caixa ADA   =====================");
        System.out.println("======================================================");
        System.out.println("======= Informe o valor de abertura de caixa =========");
        Double valorAbertura = scanner.nextDouble();
        cx.setDinheiro(valorAbertura);
        telaMenu();
        System.out.println("======================================================");
    }

    private static void telaMenu() {
        System.out.println("======================================================");
        System.out.println("========== Sistema de caixa ==========================");
        System.out.println("======================================================");
        System.out.println("========== Valor do caixa: "+ cx.balancoDinheiro());
        System.out.println("======================================================");
        System.out.println("=== Cadastrar produtos = 1 ===========================");
        System.out.println("=== Remover produtos   = 2 ===========================");
        System.out.println("=== Alterar produtos   = 3 ===========================");
        System.out.println("=== Listar produtos    = 4 ===========================");
        System.out.println("=== Vender produtos    = 5 ===========================");
        System.out.println("=== Sair               = 6 ===========================");
        System.out.println("======================================================");
        System.out.println("======================================================");
        int opc=scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: cadastrarProd();
                break;
            case 2: rmvProd();
                break;
            case 3: altProd();
                break;
            case 4: listProd();
                break;
            case 5: venderProd();
                break;
            case 6: System.exit(0);
                break;
        }
    }

    private static void venderProd() {
        System.out.println("======================================================");
        System.out.println("========= Nome do produto ============================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        ArrayList<Produto> retorno = getProdutosComNome(nome);
        for (Produto a:
             retorno) {
            System.out.println(a.toString());
            System.out.println("======================================================");
        }
        if(!(retorno.isEmpty())){
            System.out.println("======================================================");
            System.out.println("===== Informe o id para produto a ser vendido ========");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("======================================================");
            Produto rmv = null;
            for (Produto a: bancoDeDados) {
                if(a.getId()==id){
                    if(a.getQuantidade()>0){
                        rmv=a;
                    }
                }
            }
            if(rmv!=null){
                cx.addDinheiro(rmv.getPreco());
                int novaQuanti = rmv.getQuantidade()-1;
                bancoDeDados.get(bancoDeDados.indexOf(rmv)).setQuantidade(novaQuanti);
                System.out.println("======================================================");
                System.out.println("==== Deseja continuar comprando ? sim = 0 = não = 1 ==");
                System.out.println("======================================================");
                int opc=scanner.nextInt();
                scanner.nextLine();
                switch (opc){
                    case 0: venderProd();
                        break;
                    case 1: telaMenu();
                        break;
                    default: telaMenu();
                }
            }else{
                System.out.println("======================================================");
                System.out.println("========= Produto sem estoque ou não existente =======");
                System.out.println("======================================================");
            }

        }else {
            System.out.println("======================================================");
            System.out.println("==== Não encontramos oque voce pediu =================");
            System.out.println("======================================================");
        }
        telaMenu();
    }

    private static ArrayList<Produto> getProdutosComNome(String nome) {
        ArrayList<Produto> lista = new ArrayList<>();
        for (Produto a:bancoDeDados) {
            if(a.getNome().contains(nome)){
                lista.add(a);
            }
        }
        return lista;
    }

    private static void listProd() {
        if(bancoDeDados.isEmpty()){
            System.out.println("======================================================");
            System.out.println("==== Não tem produtos cadastrados ====================");
            System.out.println("======================================================");
            telaMenu();
        }else{
            System.out.println("======================================================");
            System.out.println("=== Listar produto====================================");
            System.out.println("======================================================");
            System.out.println("=== Livros             = 1 ===========================");
            System.out.println("=== Jogos              = 2 ===========================");
            System.out.println("=== Filmes             = 3 ===========================");
            System.out.println("=== Brinquedos         = 4 ===========================");
            System.out.println("=== Albuns de Musica   = 5 ===========================");
            System.out.println("=== Todos              = 6 ===========================");
            System.out.println("======================================================");
            System.out.println("======================================================");
            int opc=scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1: listarLivros();
                    break;
                case 2: listarJogos();
                    break;
                case 3: listarFilmes();
                    break;
                case 4: listarBrinq();
                    break;
                case 5: listarAlbun();
                    break;
                case 6: listarAll();
                    break;
            }
        }
    }

    private static void listarAll() {
        System.out.println("======================================================");
        System.out.println("========= Todos os produtos  =========================");
        System.out.println("======================================================");
        for (Produto abm: bancoDeDados) {
            System.out.println("======================================================");
                System.out.println(abm.toString());
            System.out.println("======================================================");
        }
        System.out.println("============================= Quantidade total : "+bancoDeDados.size());
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior == 1 ===========");
        System.out.println("======== Para voltar ao menu principal = 2 ===========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            default:
                telaMenu();
        }
    }


    private static void altProd() {
        System.out.println("======================================================");
        System.out.println("=== Alterar produtos ================================");
        System.out.println("======================================================");
        System.out.println("===== Informe o id para alterar produto ==============");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        int index=-1;
        for (int i=0;i<bancoDeDados.size();i++) {
            if(bancoDeDados.get(i).getId()==id){

                    index=i;

            }
        }

        switch (bancoDeDados.get(index).getObjtype()){
            case -1:
                System.out.println("======================================================");
                System.out.println("==== Não tem ID ======================================");
                System.out.println("======================================================");
                    telaMenu();
                break;
            case 1: alterarLivros(index);
                break;
            case 2: alterarJogos(index);
                break;
            case 3: alterarFilmes(index);
                break;
            case 4: alterarBrinq(index);
                break;
            case 5: alterarAlbun(index);
                break;
        }
    }

    private static void alterarAlbun(int index) {
        String nome;
        Double preco;
        int op;
        System.out.println("======================================================");
        System.out.println("===== Alterar Albun de Musicas =======================");
        System.out.println("======================================================");


        System.out.println("=====  Nome do Albun de Musicas ======================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getNome());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            nome = scanner.nextLine();
            bancoDeDados.get(index).setNome(nome);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Preço do Albun de Musicas =====================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getPreco());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            preco = scanner.nextDouble();
            bancoDeDados.get(index).setPreco(preco);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getQuantidade());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            int quantidade = scanner.nextInt();
            bancoDeDados.get(index).setQuantidade(quantidade);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Musicos =======================================");
        String musicos;
        System.out.println("=====  Atual: "+((AlbunDeMusica) bancoDeDados.get(index)).getMusicosBanda());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            musicos = scanner.nextLine();
            ((AlbunDeMusica) bancoDeDados.get(index)).setMusicosBanda(musicos);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Generos =======================================");
        String generos;

        System.out.println("=====  Atual: "+((AlbunDeMusica) bancoDeDados.get(index)).getGeneros());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            generos = scanner.nextLine();
            ((AlbunDeMusica) bancoDeDados.get(index)).setGeneros(generos);
            op=0;
        }

        System.out.println("======================================================");
        System.out.println("=====  Selos =========================================");
        String selos;

        System.out.println("=====  Atual: "+((AlbunDeMusica) bancoDeDados.get(index)).getSelos());
        System.out.println("=====  Alterar = 1 = | = Manter = 2 ==================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            selos = scanner.nextLine();
            ((AlbunDeMusica) bancoDeDados.get(index)).setSelos(selos);
            op=0;
        }
        listarAlbun();
    }

    private static void alterarBrinq(int index) {
        String nome;
        Double preco;
        int op;
        String tipo;
        System.out.println("======================================================");
        System.out.println("===== Alterar Brinquedo ==============================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Brinquedo =============================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getNome());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            nome = scanner.nextLine();
            bancoDeDados.get(index).setNome(nome);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Preço do Brinquedo ============================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getPreco());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            preco = scanner.nextDouble();
            bancoDeDados.get(index).setPreco(preco);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getQuantidade());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            int quantidade = scanner.nextInt();
            bancoDeDados.get(index).setQuantidade(quantidade);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Tipo do Brinquedo =============================");
        System.out.println("=====  Atual: "+ ((Brinquedo) bancoDeDados.get(index)).getTipo());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            tipo = scanner.nextLine();
            ((Brinquedo) bancoDeDados.get(index)).setTipo(tipo);
            op=0;
        }
        listarBrinq();
    }

    private static void alterarFilmes(int index) {
        String nome;
        Double preco;
        int op;
        String estudio;
        String diretores;
        String generos;
        String produtores;
        System.out.println("======================================================");
        System.out.println("===== Alterar filme ==================================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do filme =================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getNome());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            nome = scanner.nextLine();
            bancoDeDados.get(index).setNome(nome);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Preço do filme ================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getPreco());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            preco = scanner.nextDouble();
            bancoDeDados.get(index).setPreco(preco);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getQuantidade());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            int quantidade = scanner.nextInt();
            bancoDeDados.get(index).setQuantidade(quantidade);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Estudio do filme ==============================");

        System.out.println("=====  Atual: "+ ((Filme) bancoDeDados.get(index)).getEstudio());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            estudio = scanner.nextLine();
            ((Filme) bancoDeDados.get(index)).setEstudio(estudio);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Diretores do filme ============================");

        System.out.println("=====  Atual: "+ ((Filme) bancoDeDados.get(index)).getDiretores());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            diretores = scanner.nextLine();
            ((Filme) bancoDeDados.get(index)).setDiretores(diretores);
            op=0;
        }

        System.out.println("======================================================");
        System.out.println("=====  Generos do filme ==============================");


        System.out.println("=====  Atual: "+ ((Filme) bancoDeDados.get(index)).getGeneros());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            generos = scanner.nextLine();
            ((Filme) bancoDeDados.get(index)).setGeneros(generos);
            op=0;
        }

        System.out.println("======================================================");
        System.out.println("=====  Produtores do filme ===========================");

        System.out.println("=====  Atual: "+ ((Filme) bancoDeDados.get(index)).getProdutores());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            produtores = scanner.nextLine();
            ((Filme) bancoDeDados.get(index)).setProdutores(produtores);
            op=0;
        }
        System.out.println("======================================================");

        listarFilmes();
    }

    private static void alterarJogos(int index) {
        String nome;
        Double preco;
        int op;
        String distribuidora;
        String estudio;
        String generos;
        System.out.println("======================================================");
        System.out.println("===== Alterar Jogo ===================================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Jogo ==================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getNome());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            nome = scanner.nextLine();
            bancoDeDados.get(index).setNome(nome);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Preço do Jogo =================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getPreco());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            preco = scanner.nextDouble();
            bancoDeDados.get(index).setPreco(preco);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getQuantidade());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            int quantidade = scanner.nextInt();
            bancoDeDados.get(index).setQuantidade(quantidade);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Distribuidora do Jogo =========================");
        System.out.println("=====  Atual: "+ ((Jogo) bancoDeDados.get(index)).getDistribuidora());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            distribuidora = scanner.nextLine();
            ((Jogo) bancoDeDados.get(index)).setDistribuidora(distribuidora);
            op=0;
        }

        System.out.println("======================================================");
        System.out.println("=====  Generos do Jogo ===============================");
        System.out.println("=====  Atual: "+ ((Jogo) bancoDeDados.get(index)).getGeneros());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            generos = scanner.nextLine();
            ((Jogo) bancoDeDados.get(index)).setGeneros(generos);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Estudio do Jogo ===============================");
        System.out.println("=====  Atual: "+ ((Jogo) bancoDeDados.get(index)).getEstudio());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            estudio = scanner.nextLine();
            ((Jogo) bancoDeDados.get(index)).setEstudio(estudio);
            op=0;
        }
        listarJogos();
    }

    private static void alterarLivros(int index) {
        String nome;
        Double preco;
        int op;
        String genero;
        String escritor;
        String editora;
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo Livro ===========================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Livro =================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getNome());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            nome = scanner.nextLine();
            bancoDeDados.get(index).setNome(nome);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Preço do Livro ================================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getPreco());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            preco = scanner.nextDouble();
            bancoDeDados.get(index).setPreco(preco);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        System.out.println("=====  Atual: "+bancoDeDados.get(index).getQuantidade());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            int quantidade = scanner.nextInt();
            bancoDeDados.get(index).setQuantidade(quantidade);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Genero do Livro ===============================");
        System.out.println("=====  Atual: "+ ((Livro) bancoDeDados.get(index)).getGenero());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            genero = scanner.nextLine();
            ((Livro) bancoDeDados.get(index)).setGenero(genero);
            op=0;
        }
        System.out.println("=======================================================");
        System.out.println("=====  Escritor do Livro ==============================");
        System.out.println("=====  Atual: "+ ((Livro) bancoDeDados.get(index)).getEscritor());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            escritor = scanner.nextLine();
            ((Livro) bancoDeDados.get(index)).setEscritor(escritor);
            op=0;
        }
        System.out.println("======================================================");
        System.out.println("=====  Editora do Livro ==============================");
        System.out.println("=====  Atual: "+ ((Livro) bancoDeDados.get(index)).getEditora());
        System.out.println("=====  Alterar= 1 = | = Manter = 2 ===================");
        op = scanner.nextInt();
        scanner.nextLine();
        if(op==1){
            editora = scanner.nextLine();
            ((Livro) bancoDeDados.get(index)).setEditora(editora);
            op=0;
        }
        listarLivros();
    }

    private static void rmvProd() {
        System.out.println("======================================================");
        System.out.println("========= Nome do produto ============================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        ArrayList<Produto> retorno = getProdutosComNome(nome);
        for (Produto a:
                retorno) {
            System.out.println(a.toString());
            System.out.println("======================================================");
        }
        if(!(retorno.isEmpty())){
            System.out.println("======================================================");
            System.out.println("===== Informe o id para produto a ser removido ========");
            int id = scanner.nextInt();
            System.out.println("======================================================");
            Produto rmv = null;
            for (Produto a: bancoDeDados) {
                if(a.getId()==id){
                    rmv=a;
                }
            }
            bancoDeDados.remove(rmv);
        }else {
            System.out.println("======================================================");
            System.out.println("==== Não tem produtos ================================");
            System.out.println("======================================================");
        }
        telaMenu();
    }

    private static void cadastrarProd() {
        System.out.println("======================================================");
        System.out.println("=== Cadastrar produtos ================================");
        System.out.println("======================================================");
        System.out.println("=== Livros             = 1 ===========================");
        System.out.println("=== Jogos              = 2 ===========================");
        System.out.println("=== Filmes             = 3 ===========================");
        System.out.println("=== Brinquedos         = 4 ===========================");
        System.out.println("=== Albuns de Musica   = 5 ===========================");
        System.out.println("======================================================");
        System.out.println("=== Voltar Menu ======== 6 ===========================");
        System.out.println("======================================================");
        int opc=scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: cadastrarLivros();
                break;
            case 2: cadastrarJogos();
                break;
            case 3: cadastrarFilmes();
                break;
            case 4: cadastrarBrinq();
                break;
            case 5: cadastrarAlbun();
                break;
            case 6: telaMenu();
                break;
        }
    }

    private static void cadastrarAlbun() {
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo Albun de Musicas ================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Albun de Musicas ======================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Musicos =======================================");
        String musicos = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Generos =======================================");
        String generos = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Selos =========================================");
        String selos = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Preço do Albun de Musicas =====================");
        Double preco = scanner.nextDouble();
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        Produto novoAlbunMusica= new AlbunDeMusica(contador,nome,preco,quantidade,musicos,generos,selos);
        contador = contador+1;
        bancoDeDados.add(novoAlbunMusica);
        listarAlbun();
    }

    private static void cadastrarBrinq() {
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo Brinquedo =======================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Brinquedo =============================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Tipo do Brinquedo =============================");
        String tipo = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Preço do Brinquedo ============================");
        Double preco = scanner.nextDouble();
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        Produto novoBrinquedo = new Brinquedo(contador,nome,preco,quantidade,tipo);
        contador = contador+1;
        bancoDeDados.add(novoBrinquedo);
        listarBrinq();
    }

    private static void cadastrarJogos() {
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo Jogo ============================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Jogo ==================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Distribuidora do Jogo =========================");
        String distribuidora = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Generos do Jogo ===============================");
        String generos = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Estudio do Jogo ===============================");
        String estudio = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Preço do Jogo =================================");
        Double preco = scanner.nextDouble();
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        Produto novoJogo = new Jogo(contador,nome,preco,quantidade,distribuidora,generos,estudio);
        contador=contador+1;
        bancoDeDados.add(novoJogo);
        listarJogos();
    }

    private static void cadastrarLivros() {
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo Livro ===========================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do Livro =================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Genero do Livro ===============================");
        String genero = scanner.nextLine();
        System.out.println("=======================================================");
        System.out.println("=====  Escritor do Livro ==============================");
        String escritor = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Editora do Livro ==============================");
        String editora = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Preço do Livro ================================");
        Double preco = scanner.nextDouble();
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        Produto novoLivro = new Livro(contador,nome,preco,quantidade,genero,escritor,editora);
        contador=contador+1;
        bancoDeDados.add(novoLivro);
        listarLivros();
    }

    public static void cadastrarFilmes(){
        System.out.println("======================================================");
        System.out.println("===== Cadastrar novo filme ===========================");
        System.out.println("======================================================");
        System.out.println("=====  Nome do filme =================================");
        String nome = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Estudio do filme ==============================");
        String estudio = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Diretores do filme ============================");
        String diretores = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Generos do filme ==============================");
        String generos = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Produtores do filme ===========================");
        String produtores = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("=====  Preço do filme ================================");
        Double preco = scanner.nextDouble();
        System.out.println("======================================================");
        System.out.println("=====  Quantidade de items ===========================");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("======================================================");
        Produto novoFilme = new Filme(contador,nome,preco,quantidade,estudio,diretores,generos,produtores);
        contador=contador+1;
        bancoDeDados.add(novoFilme);
        listarFilmes();
    }


    private static void listarAlbun() {
        int cont=0;
        System.out.println("======================================================");
        System.out.println("========= Albuns De Musica  ==========================");
        System.out.println("======================================================");
        for (Produto abm: bancoDeDados) {
            if(abm.getObjtype()==5){
                System.out.println(abm.toString());
                cont=cont+1;
            }
        }
        System.out.println("============================= Quantidade : "+cont);
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior == 1 ===========");
        System.out.println("======== Para voltar ao menu principal = 2 ===========");
        System.out.println("======== Para cadastrar um novo Albun  = 3 ===========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            case 3: cadastrarAlbun();
                break;
            default:
                telaMenu();
        }
    }

    private static void listarBrinq() {
        int cont=0;
        System.out.println("======================================================");
        System.out.println("========= Brinquedos  ================================");
        System.out.println("======================================================");
        for (Produto brinquedos: bancoDeDados) {
            if(brinquedos.getObjtype()==4){
                System.out.println(brinquedos.toString());
                cont=cont+1;
            }
        }
        System.out.println("============================= Quantidade : "+cont);
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior    == 1 ========");
        System.out.println("======== Para voltar ao menu principal    = 2 ========");
        System.out.println("======== Para cadastrar um novo Brinquedo = 3 ========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            case 3: cadastrarBrinq();
                break;
            default:
                telaMenu();
        }
    }

    private static void listarFilmes() {
        int cont=0;
        System.out.println("======================================================");
        System.out.println("========= Filmes  ====================================");
        System.out.println("======================================================");
        for (Produto filmes: bancoDeDados) {
            if(filmes.getObjtype()==3){
                System.out.println(filmes.toString());
                cont=cont+1;
            }
        }
        System.out.println("============================= Quantidade : "+cont);
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior == 1 ===========");
        System.out.println("======== Para voltar ao menu principal = 2 ===========");
        System.out.println("======== Para cadastrar um novo Filme  = 3 ===========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            case 3: cadastrarFilmes();
                break;
            default:
                telaMenu();
        }
    }

    private static void listarJogos() {
        int cont=0;
        System.out.println("======================================================");
        System.out.println("========= Jogos  =====================================");
        System.out.println("======================================================");
        for (Produto jogos: bancoDeDados) {
            if(jogos.getObjtype()==2){
                System.out.println(jogos.toString());
                cont=cont+1;
            }
        }
        System.out.println("============================= Quantidade : "+cont);
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior == 1 ===========");
        System.out.println("======== Para voltar ao menu principal = 2 ===========");
        System.out.println("======== Para cadastrar um novo Jogo   = 3 ===========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            case 3: cadastrarJogos();
                break;
            default:
                telaMenu();
        }
    }

    private static void listarLivros() {
        int cont=0;
        System.out.println("======================================================");
        System.out.println("========= Livros =====================================");
        System.out.println("======================================================");
        for (Produto livro: bancoDeDados) {
            if(livro.getObjtype()==1){
                System.out.println(livro.toString());
                cont=cont+1;
            }
        }
        System.out.println("============================= Quantidade : "+cont);
        System.out.println("======================================================");
        System.out.println("======== Para voltar ao menu anterior == 1 ===========");
        System.out.println("======== Para voltar ao menu principal = 2 ===========");
        System.out.println("======== Para cadastrar um novo livro  = 3 ===========");
        System.out.println("======================================================");
        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1: listProd();
                break;
            case 2: telaMenu();
                break;
            case 3: cadastrarLivros();
            default:
                telaMenu();
        }
    }
}
