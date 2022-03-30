package lambda;

@FunctionalInterface
interface Cap { //when interface has exactly one abstract method, we can se its functional interface
    double bookCap(String from, String destination); // -> by default public abstract bookCap();
}

public class LambdaApp {

int instanceVar = 10;
static int sVar = 100;
    public static void main(String[] args) {

    /*
        double fare = cap.bookCap("Laagri", "Marjamaa");
        System.out.println("Fare will be: " + fare);*/



    }

   Cap cap = (from, destination) -> {
        int localVar = 1000;
        System.out.println("The cap is coming from " + from + " and will drive to " + destination);
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + LambdaApp.sVar);
        return 20.34;
    };
}
