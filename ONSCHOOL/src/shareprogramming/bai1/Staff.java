package shareprogramming.bai1;

public class Staff extends Officer{
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Staff(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work=work;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff: " +
                "name: " + getName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", address: " + getAddress() +
                ", work: " + getWork();
    }
}
