import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        File myFile = new File("E:\\1.JAVA\\IdeaProjects\\Cadouri de Craciun\\cildrens.csv");
        List<Kid> chosenListName = FileToList.readFileToKidList(myFile);

        File myFile2 = new File("E:\\1.JAVA\\IdeaProjects\\Cadouri de Craciun\\toys.csv");
        List<Toy> listToys = FileToList.readFileToToyList(myFile2);

        ToyInnator toyInnator = new ToyInnator();
        Map<Kid,Toy> kidsPresentMap = toyInnator.givePresents(chosenListName, listToys);
        for (Map.Entry<Kid, Toy> entry : kidsPresentMap.entrySet()) {
            if (entry.getValue() == null) {
                System.out.println(entry.getKey() + " this kid was naughty! ");
            } else {
                System.out.println(entry.getKey() + " has received " + entry.getValue());
            }
        }
    }
}
