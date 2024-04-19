import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName, int legsCount) {
        super(name, birthDate, vaccination, illness, ownerName);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    protected void fly() {
        System.out.printf("%s %s cant fly \n",type,name);
    }

}
