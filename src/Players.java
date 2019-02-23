public class Players implements Comparable<Players> {
    private String name;
    private String surname;
    private int result;

    public Players(String name, String surname, int result) {
        this.name = name;
        this.surname = surname;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", result=" + result + "\n";
    }

    public int compareTo(Players p) {
        if (this.result > p.result)
            return 1;
        else if (this.result < p.result)
            return -1;
        else {
            return name.compareTo (p.name);
        }
    }
}
