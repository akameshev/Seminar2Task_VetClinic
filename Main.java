import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat boris = new Cat("Boris",
                LocalDate.of(
                        2005,
                        12,
                        21),
                new ArrayList<>(),
                "Distemper",
                "Vasiliy Berezov",
                4);
        Dog sosiska = new Dog("Sosiska",
                LocalDate.of(
                        2001,
                        3,
                        14),
                new ArrayList<String>(List.of("SAS", "SDDS")),
                "ORVI",
                "Agatha Smirnova");
        Turkey josef = new Turkey("Josef",
                LocalDate.of(
                        2023,
                        4,
                        1),
                new ArrayList<String>(List.of("H5N1", "PHAIZER", "SPUTNIC")),
                "Bird Flu",
                "Ursul Umbaku");
        Monkey michael = new Monkey("Michael",
                LocalDate.of(
                        2010,
                        5,
                        12),
                new ArrayList<String>(List.of("PHIZER", "SPUTNIC", "KAZVAK")),
                "Diarrhea",
                "Research Institute",
                40);
        Turkey yusuf = new Turkey("Yusuf",
                LocalDate.of(
                        2010,
                        3,
                        15),
                new ArrayList<String>(List.of("SDsadas","sdasdsa")),
                "Flu",
                "Samantha Smith");
        Fish samuel = new Fish("Samuel",
                LocalDate.of(
                        2022,
                        1,
                        18),
                new ArrayList<String>(),
                "Fish flu",
                "Cathrine Forman");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(boris);
        animalList.add(sosiska);
        animalList.add(josef);
        animalList.add(michael);
        animalList.add(yusuf);
        //System.out.println(animalList.toString());
        System.out.println("Картотека животных");
        System.out.println("          Имя           Дата рождения        паспорт вакцинации        Болезнь          Хозяин");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));
        }
        System.out.println(josef.fly());
        VetClinic clinic = new VetClinic();
        clinic.addPatients(boris,sosiska,josef,michael,yusuf);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());




    }
}
