class Main {
  public static void main(String[] args) {
    Phone p = new Phone();
    System.out.println(p.answerCell(false, false, false));
    System.out.println(p.answerCell(false, false, true));
    System.out.println(p.answerCell(true, false, false));
    System.out.println(p.answerCell(true, true, false));
    System.out.println(p.answerCell(false, true, false));
    System.out.println(p.answerCell(true, true, true));
  }
}
