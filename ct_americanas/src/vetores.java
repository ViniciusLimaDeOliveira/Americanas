import java.util.Random;

public class vetores {


        public static void main(String[] args) {
            //Array == coleção de informações heterogeneas ou homogeneas

            //Array sempre começa a contar da posição zero, logo, um array de
            // tamanho 2 tem a posição zero e um
            for (int indice = 0; indice < args.length; indice++) {
                String arg = args[indice];
                System.out.println(arg);
            }

            int[] idades = {33, 25, 20, 16, 26, 17, 18};
            double[] salarios = {35.5, 1212.4, 2424.8};
            String[] nomes = {"William", "Bruno", "André"};

            String[] alunos = new String[3];
            //Atribuindo valor a uma posição do array
            alunos[2] = "Renan";
            alunos[0] = "Leonardo";
            alunos[1] = "Georg";
            System.out.println(alunos);

            Random random = new Random();
            int[] numeros = {
                    random.nextInt(0, 100),
                    random.nextInt(0, 100),
                    random.nextInt(0, 100),
                    random.nextInt(0, 100),
                    random.nextInt(0, 100),
            };
            int max=-1;
            Double mediaSimples=0.0;
            int sum=0;
            System.out.print("O vertor é : ");
            for (int j:numeros){
                if(max<=j){
                    max=j;
                }
                sum+=j;
                System.out.print(" "+j);
            }

            mediaSimples = Double.valueOf(sum)/ numeros.length;
            System.out.println();
            System.out.println("O maior numero é : "+max);
            System.out.println("A media simples é : "+mediaSimples);
    }
}
