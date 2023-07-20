class Piscina{
  public double largura, comprimento, profundidade;
  public String temperatura;

  public double volumes(double largura, double comprimento, double profundidade){
    double volume = largura * comprimento * profundidade;
    return volume;
  }
  
}