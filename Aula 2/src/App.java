public class App {
    public static void main(String[] arg) throws Exception {
        System.out.println("Hello World!");

        Cachorro c01 = new Cachorro();
        c01.nome = "Zé";
        c01.corPelagem = "Caramelo";
        c01.correr();
        c01.latir();

        Cachorro c02 = new Cachorro();
        c02.nome = "Budu";
        c02.corPelagem = "azul";
        c02.correr();
        c02.latir();

        Pessoa p01 = new Pessoa();
        p01.nome = "Monica";
        p01.idade = 10;
        c02.dono = p01;

        System.out.println(c02.dono.nome+ " é o dono de " +c02.nome);

        Pessoa p02 = new Pessoa();
        p02.nome = "magali";
        Gato g01 = new Gato();
        g01.nome = "mingau";
        p02.meuGato = g01;

        System.out.println(p02.meuGato.nome+ " é o gato de "+p02.nome);

        p02.alimentarGato("ração");
    }
}