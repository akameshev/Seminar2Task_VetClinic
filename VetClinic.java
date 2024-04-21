import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal) {
        patients.add(animal);
    }
    public void addPatients(Animal...animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal a:patients){
            if(a instanceof Goable){
                result.add((Goable) a);
            }
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}
