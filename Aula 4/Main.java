public class Main {
    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Presidente", "Chefe do executivo");
        CargoExecutivo cargoExecutivo = new CargoExecutivo("Ministro", "Responsável por um ministério", "Ministério da Saúde");
        CargoLegislativo cargoLegislativo = new CargoLegislativo("Deputado", "Membro do parlamento", "Comissão de Educação");

        System.out.println("Cargo: " + cargo1.getNome() + ", Descrição: " + cargo1.getDescricao());
        System.out.println("Cargo Executivo: " + cargoExecutivo.getNome() + ", Descrição: " + cargoExecutivo.getDescricao() + ", Departamento: " + cargoExecutivo.getDepartamento());
        System.out.println("Cargo Legislativo: " + cargoLegislativo.getNome() + ", Descrição: " + cargoLegislativo.getDescricao() + ", Comissão: " + cargoLegislativo.getComissao());
    }
}