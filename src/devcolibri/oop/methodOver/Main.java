package devcolibri.oop.methodOver;

public class Main {

    public static void main(String[] args) {

        MetExam m = new MetExam();

        System.out.println(m.get() + "\n" +
                m.get("World!") + "\n" +
                m.get("Hello" , "World!") + "\n" +
                m.get(1));

    }

}
