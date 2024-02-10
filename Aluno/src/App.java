public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();
        String name = a1.getName("Maryson", "Silva");
        int age = a1.getYearBirth(30);

        System.out.println(name);
        System.out.println(age);
    }
}
