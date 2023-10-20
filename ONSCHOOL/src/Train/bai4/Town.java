package Train.bai4;

import java.util.ArrayList;
import java.util.List;

public class Town {
    public Town() {
    }

    private List<Family> familiesList = new ArrayList<>();

    public List<Family> getFamiliesList() {
        return familiesList;
    }

    public void setFamiliesList(List<Family> familiesList) {
        this.familiesList = familiesList;
    }

    public void addFamily (Family family) {
        this.familiesList.add(family);
    }

    public void removeFamily(String numberHouse) {
        for (Family family : familiesList) {
            if (family.getNumberHouse().equals(numberHouse)) {
                familiesList.remove(family);
                System.out.println("Remove successly!");
            } else
                System.out.println("No person with this number house was found!");
        }
    }

    public Family searchFamily(String numberHouse) {
        for (Family family : familiesList) {
            if (family.getNumberHouse().equals(numberHouse)) {
                return family;
            }
        }
        return null;
    }

    public void displayFamily () {
        for (Family family : familiesList) {
            System.out.println(family.toString());
        }
    }



}



