import java.util.*;

public class ToyInnator implements ToyInnatorInterface {

    @Override
    public Map<Kid,Toy> givePresents (List<Kid> kids, List<Toy> toys) {
        Map<Kid,Toy> presentsMap = new HashMap<>();
        for (Kid kid : kids) {
            if (!kid.isWasGood()) {
                presentsMap.put(kid, null);
                break;
            } else {
                List<Toy> validToys = new ArrayList<>();
                for (Toy toy : toys) {
                    if (toy.getGenderType() == kid.getGender()) {
                        if (kid.getAge() < toy.getMaximAge() && kid.getAge() > toy.getMinimAge()) {
                            validToys.add(toy);
                        }
                    }
                }
                Random random = new Random();
                int randIndex = random.nextInt(validToys.size());
                presentsMap.put(kid, validToys.get(randIndex));
            }
        }
        return presentsMap;
    }
}
