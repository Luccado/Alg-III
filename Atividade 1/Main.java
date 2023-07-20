class Main {
  public static void main(String[] args) {
    Piscina p1 = new Piscina();
    p1.largura = 2;
    p1.comprimento = 8;
    p1.profundidade = 2;
    p1.temperatura = "quente";

    Piscina p2 = new Piscina();
    p2.largura = 4;
    p2.comprimento = 16;
    p2.profundidade = 4;
    p2.temperatura = "fria";
    
    System.out.println(p1.volumes(p1.largura,p1.comprimento, p1.profundidade));
    System.out.println(p2.volumes(p2.largura,p2.comprimento, p2.profundidade));
  }
}