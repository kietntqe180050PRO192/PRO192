package Train.bai4;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> personList = new ArrayList<>();
    private String numberHouse;
    private int numberMember;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public Family(List<Person> personList, String numberHouse, int numberMember) {
        this.personList = personList;
        this.numberHouse = numberHouse;
        this.numberMember = numberMember;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void removePerson(String cccd) {
        for (Person person : personList) {
            if (person.getCccd().equals(cccd)) {
                personList.remove(person);
                System.out.println("Remove successly!");
            } else
                System.out.println("No person with this cccd number was found!");
        }
    }

    public Person searchPerson(String cccd) {
        for (Person person : personList) {
            if (person.getCccd().equals(cccd)) {
                return person;
            }
        }
        return null;
    }

    public Family() {
    }

    public void displayPerson () {
        for (Person person : personList) {
            System.out.println(person.toString() + "Number House " +numberHouse);
        }
    }
}

