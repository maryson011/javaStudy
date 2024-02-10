public class Aluno {
    private String name;
    private String lastName;
    private int age;

    public String getName(String name){
        if(name == "Maryson"){
            this.name = name;
            System.out.println("Nome cadastrado.");
        }else{
            System.out.println("Nome invalido!");
        }

        String nameReturn = this.name + "_user";
        return nameReturn;
    }

    public int getYearBirth(int age){
        this.age = 2024 - age;
        return this.age;
    }
}
