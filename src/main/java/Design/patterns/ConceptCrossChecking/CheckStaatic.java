package Design.patterns.ConceptCrossChecking;

public class CheckStaatic {
    @Override
    public String toString() {
        return "CheckStaatic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", univName='" + univName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    String name;
    int age;
    static String univName;
}
