package Train.shareprogramming_bai1;

import java.util.ArrayList;
import java.util.List;

public class ManagerAll {
    List<Officer> list = new ArrayList<>();
    //Thêm mới cán bộ
    public void addOfficer (Officer officer) {
        this.list.add(officer);
    }
    //Hiển thị thông tin về danh sách các cán bộ
    public void displayOfficer () {
        for (Officer officer : list) {
            System.out.println(officer.toString());
        }
    }
    //tìm kiếm theo họ tên
    public Officer findOfficer (String name) {
        for (Officer officer : list) {
           if (officer.getName().equals(name))
               return officer;
        }
        return null;
    }
}
