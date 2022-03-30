import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        Set<String> footballClubs = new HashSet<String>();

        footballClubs.add("Chelsea");
        footballClubs.add("PSG");
        footballClubs.add("Juventus");
        footballClubs.add("Real Madrid");
        footballClubs.add("Dortmund");

        System.out.println(footballClubs);

        Set<String> englishClubs = new HashSet<String>();

        englishClubs.add("Chelsea");
        englishClubs.add("Manchester United");
        englishClubs.add("Leicester City");

       footballClubs.retainAll(englishClubs);
        System.out.println(footballClubs);
    }
}
