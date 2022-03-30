package lambda;

interface Calculator{
    void add(int numb1, int num2);
}

class Calc{
    public static void addSomething(int numb1, int num2){
        System.out.println(numb1 + " + " + num2 + " = " + (numb1+num2));
    }
    public void letsAdd(int numb1, int num2){
        System.out.println(numb1 + " + " + num2 + " = " + (numb1+num2));
    }
}
//Functional interface

interface Messenger{
        Message getMessage(String msg);
}

class Message{
    Message(String msg){
        System.out.println(">> Message is: " + msg);
    }
}

public class MethodReferencesApp {
    public static void main(String[] args) {

       // Calc.addSomething(5,6);

        //1.Reference to a static method
  /*      Calculator cRef = Calc::addSomething; //Method Reference
        cRef.add(13,66);*/

        //2.Reference to a non static method or Instance method
        //Object Construction Statement for Calc
        /*Calc calc = new Calc();
        Calculator cRef = calc::letsAdd;   //Method reference
        cRef.add(94,123);*/

        //3.Reference to a constructor
        Messenger mReg = Message::new;  //Method reference
        mReg.getMessage("Search the candle rather than curse the dark!");
    }
}
