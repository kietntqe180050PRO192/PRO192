package ListStudent_with_ArrayList;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int birthYear;
    private float mediumScore;

    @Override
    public String toString() {
        return "Student: " +
                " id = " + id +
                ", name = " + name +
                ", birthYear = " + birthYear +
                ", mediumScore = " + mediumScore;
    }

    public Student(String id, String name, int birthYear, float mediumScore) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.mediumScore = mediumScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    public Student(String name) {
        this.name = name;
    }

    public Student (String id, boolean isId) {
        this.id = id;
    }
}
