class Main {
  public static void main(String[] args) {
    Piscina p1 = new Piscina();
    p1.largura = 2;
    p1.comprimento = 8;
    p1.profundidade = 2;
    p1.temperatura = "quente";
    
    System.out.println(p1.volumes(p1.largura,p1.comprimento, p1.profundidade));
  }
}