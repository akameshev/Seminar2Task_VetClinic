import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    protected void fly() {
        System.out.printf("%s %s cant fly \n",type,name);
    }



}
