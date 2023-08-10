public class Piscina{
  private String temperatura;
  private double largura, comprimento, profundidade;
  public double volumes(double largura, double comprimento, double profundidade){
    double volume = largura * comprimento * profundidade;
    return volume;
  }

  
  public double getLargura() {
    return largura;
  }
  public void setLargura(double largura) {
    this.largura = largura;
  }
  public double getComprimento() {
    return comprimento;
  }
  public void setComprimento(double comprimento) {
    this.comprimento = comprimento;
  }
  public double getProfundidade() {
    return profundidade;
  }
  public void setProfundidade(double profundidade) {
    this.profundidade = profundidade;
  }
  public String getTemperatura() {
    return temperatura;
  }
  public void setTemperatura(String temperatura) {
    this.temperatura = temperatura;
  }



  
}