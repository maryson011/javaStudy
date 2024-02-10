public class Aluno {
    private String name;
    private String lastName;
    private int age;

    public String getName(String name, String lastName){
        if(name == "Maryson"){
            this.name = name;
            System.out.println("Nome cadastrado.");
        }else{
            System.out.println("Nome invalido!");
        }

        String nameReturn = this.name + getLastName(lastName);

        return nameReturn;
    }

    public String getLastName(String text){
        String letras = text.substring(0, 3);
        
        return this.lastName = letras;
    }

    public int getYearBirth(int age){
        this.age = 2024 - age;
        return this.age;
    }
}
