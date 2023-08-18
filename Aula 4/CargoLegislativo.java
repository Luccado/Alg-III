public class CargoLegislativo extends Cargo {
    private String comissao;
    public CargoLegislativo(String nome, String descricao, String comissao) {
        super(nome, descricao);
        this.comissao = comissao;
    }
    public String getComissao() {
        return comissao;
    }
    public void setComissao(String comissao) {
        this.comissao = comissao;
    }
}