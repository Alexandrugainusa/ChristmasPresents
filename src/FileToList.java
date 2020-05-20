import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToList {

    public static List<Kid> readFileToKidList (File file) {
        List<Kid> chosenListName = new ArrayList<>();

        try{
            FileReader myFileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(myFileReader);
            bufferedReader.readLine();
            String fileLine;

            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] cildrenArray = fileLine.split(";");
                for (int i = 0; i < cildrenArray.length; i++) {
                    Kid temp = new Kid(cildrenArray[0], cildrenArray[1],
                    cildrenArray[2], cildrenArray[3], cildrenArray[4]);
                    chosenListName.add(temp);
                }
            }
            return chosenListName;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static List readFileToToyList (File file) {
        List<Toy> listToys = new ArrayList<>();

        try{
            FileReader myFileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(myFileReader);
            bufferedReader.readLine();
            String fileLine;

            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] toyArray = fileLine.split(";");
                for (int i = 0; i < toyArray.length; i++) {
                    Toy temp = new Toy(toyArray[0], toyArray[1], toyArray[2],
                            toyArray[3]);
                    listToys.add(temp);
                }
            }
            return listToys;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
