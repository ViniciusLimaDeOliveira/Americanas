package br.com.americanas.livraria.produtos;

public class Livros  extends Produto{
        int objtype = 1;
        String genero;
        String escritor;
        String editora;

        public Livros(int id,String nome, Double preco,String genero,String escritor,String editora) {
                super(id,nome, preco);
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
                return "Livros{" +
                        "objtype='" + objtype + '\'' +
                        ", genero='" + genero + '\'' +
                        ", escritor='" + escritor + '\'' +
                        ", editora='" + editora + '\'' +
                        ", id=" + id +
                        ", nome='" + nome + '\'' +
                        ", preco=" + preco +
                        '}';
        }
}
