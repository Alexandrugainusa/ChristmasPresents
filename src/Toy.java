public class Toy {

    private String toy;
    private char genderType;
    private int minimAge;
    private int maximAge;

    public Toy(String toy, String genderType, String minimAge, String maximAge) {
        this.toy = toy;
        this.genderType = genderType.charAt(0);
        this.minimAge = Integer.parseInt(minimAge);
        this.maximAge = Integer.parseInt(maximAge);
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public char getGenderType() {
        return genderType;
    }

    public void setGenderType(char genderType) {
        this.genderType = genderType;
    }

    public int getMinimAge() {
        return minimAge;
    }

    public void setMinimAge(int minimAge) {
        this.minimAge = minimAge;
    }

    public int getMaximAge() {
        return maximAge;
    }

    public void setMaximAge(int maximAge) {
        this.maximAge = maximAge;
    }

    @Override
    public String toString() {
        return toy + " "+ genderType + " "+ minimAge + " " + maximAge;
    }
}
