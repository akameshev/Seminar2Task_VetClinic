import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable,Swimble,Flyble{
    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName, int legsCount) {
        super(name, birthDate, vaccination, illness, ownerName);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }



    @Override
    public void lifeCircle() {
        System.out.println("Sdsadwad");
    }


    @Override
    public double fly() {
        System.out.printf("%s %s cant flying",type,name);
        return 0;
    }

    @Override
    public double run() {
        System.out.printf("%s %s running",type,name);
        return 30.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s swimming",type,name);
        return 10.0;
    }
}
