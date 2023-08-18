public class CargoExecutivo extends Cargo {
    private String departamento;
    public CargoExecutivo(String nome, String descricao, String departamento) {
        super(nome, descricao);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
