class Main {
  public static void main(String[] args) {
    Piscina p1 = new Piscina();
    p1.setLargura(2);
    p1.setComprimento(8);
    p1.setProfundidade(2);
    p1.setTemperatura("quente");

    Piscina p2 = new Piscina();
    p2.setLargura(4);
    p2.setComprimento(16);
    p2.setProfundidade(4);
    p2.setTemperatura("Fria");
    
    System.out.println(p1.volumes(p1.getLargura(),p1.getComprimento(), p1.getProfundidade()));
    System.out.println(p2.volumes(p2.getLargura(),p2.getComprimento(), p2.getProfundidade()));
  }
}