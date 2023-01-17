package br.com.americanas.livraria.produtos;

public class Livro extends Produto{
        int objtype = 1;
        String genero;
        String escritor;
        String editora;

        public Livro(int id, String nome, Double preco, int quantidade, String genero, String escritor, String editora) {
                super(id,nome, preco, quantidade);
                this.genero = genero;
                this.escritor = escritor;
                this.editora = editora;
        }

        public int getObjtype() {
                return objtype;
        }

        public String getGenero() {
                return genero;
        }

        public String getEscritor() {
                return escritor;
        }

        public String getEditora() {
                return editora;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public void setEscritor(String escritor) {
                this.escritor = escritor;
        }

        public void setEditora(String editora) {
                this.editora = editora;
        }

        @Override
        public String toString() {
                return "Livros :" +
                        "| id=" + id +
                        "| nome='" + nome + '\'' +
                        "| Genero='" + genero + '\'' +
                        "| Escritor='" + escritor + '\'' +
                        "| Editora='" + editora + '\'' +
                        "| Preco=" + preco +
                        "| Quantidade=" + quantidade +
                        '|';
        }
}
