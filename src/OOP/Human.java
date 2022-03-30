package OOP;

public class Human {

    String name;
    int age;
    String occupation;
    String sex;

    void enterInfo(String name, int age, String sex, String occupation){
        this.age = age;
        this.name = name;
        this.sex =sex;
        this.occupation = occupation;
    }
    void getInfo(){
        if (this.sex == "male"){
            System.out.println("This is " + this.name + ", he is " + this.age + " years old. And he works as a "+ this.occupation + ".");
        }else{
            System.out.println("This is " + this.name + ", she is " + this.age + " years old. And she works as a "+ this.occupation + ".");
        }
    }
}
