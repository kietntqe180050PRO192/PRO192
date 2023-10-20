package Train.bai4;

public class Person {

    private String name;
    private String cccd;
    private String sdt;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, String cccd, String sdt, String job) {
        this.name = name;
        this.cccd = cccd;
        this.sdt = sdt;
        this.job = job;
    }


}
