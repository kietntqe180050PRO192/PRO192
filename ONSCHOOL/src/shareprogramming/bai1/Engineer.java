package shareprogramming.bai1;

public class Engineer extends Officer{
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Engineer(String name, int age, String gender, String address, String major) {
        super(name, age, gender, address);
        this.major=major;
    }

    public Engineer() {
    }

    @Override
    public String toString() {
        return "Enginner: " +
                "name: " + getName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", address: " + getAddress() +
                ", major: " + getMajor();
    }
}
