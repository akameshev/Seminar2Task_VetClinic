import java.time.LocalDate;
import java.util.List;

public class Turkey extends Animal{

    protected Turkey(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    protected void animalPlay() {
        System.out.printf("%s %s cant playing He doesn't have enough brains for that," +
                "He will walk around and scare other animals\n",type,name);
    }
}
