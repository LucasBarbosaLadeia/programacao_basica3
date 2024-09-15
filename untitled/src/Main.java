public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    class aluno {

        public String nome;

        public Integer Idade

        public Integer Peso;

        public Integer IMC;

        public Integer Altura;

        public aluno ( nome; int Idade; int peso; int altura){

            this.nome = nome;

            this.Idade =Idade;

            this.peso = peso;

            this.altura = altura;

            this.IMC = IMC;

        }




        public Int IMC(Integer Peso, Integer Altura)

return Peso / (Altura ** 2);

    }

    public void InfAluno (){

        System.out.println("nome do aluno " +this.nome  )

        System.out.println("idade do aluno"+this.idade)

        System.out.println("O IMC do aluno"+this.IMC)

        if (this.idade >= 18) { System.out.println("Você Ganhou o desconto.") }

        else { System.out.println("Você Não Ganhou o Desconto."); }

    }
}