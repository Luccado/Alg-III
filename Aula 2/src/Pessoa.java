public class Pessoa {
    String nome;
    int idade;

    Gato meuGato;

    public void alimentarGato(String alimento){
        System.out.println(this.nome+" está dando " +alimento+ " para o gato"+this.meuGato.nome);
    }
    
}
