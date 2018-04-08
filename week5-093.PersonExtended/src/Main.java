public class Main {
  public static void main(String[] args) {
    // write test code here
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person dan = new Person("Dan", 22, 3, 1989);

      System.out.println(dan.getName() + " age " + dan.age() + " years");
      System.out.println(pekka.getName() + " age " + pekka.age() + " years");
  }
}