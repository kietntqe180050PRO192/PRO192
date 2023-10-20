package Colection.ListStudent_with_ArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class ListStudent {
    private ArrayList<Student> list;

    public ListStudent() {
        this.list = new ArrayList<>();
    }

    public ListStudent(ArrayList<Student> list) {
        this.list = list;
    }

    public void addStudent(Student student) {
        this.list.add(student);
    }

    public void printfListStudent() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    public boolean checkListEmpty() {
        return this.list.isEmpty();
    }

    public int getNumberStudent() {
        return this.list.size();
    }

    public void emptyListStudent() {
        this.list.removeAll(list);
    }

    public boolean checkExist(Student student) {
        return this.list.contains(student);
    }

    public Student removeStudent(String studentId) {
        Student studentRemove = null;
        for (Student student : list) {
            if (student.getId().equals(studentId)) {
            studentRemove = student;
            break;
           }
        }
        if (studentRemove != null) {
                list.remove(studentRemove);
        }
        return studentRemove;
    }

    public Student findStudent (String name) {
        for (Student student : list ) {
            if (student.getName().equals(name))
                return student;
            }
        return null;
    }

    public void arrangeStudent() {
        Collections.sort(this.list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getMediumScore() < student2.getMediumScore())
                    return -1;
                else if (student1.getMediumScore() > student2.getMediumScore())
                    return 1;
                else
                    return 0;
            }
        });
    }

    public void writeDataFile (File file) {
        try {
            // Tạo một đối tượng OutputStream để ghi dữ liệu vào file.
            OutputStream os = new FileOutputStream(file);
            // Tạo một đối tượng ObjectOutputStream để ghi các đối tượng vào luồng dữ liệu.
            ObjectOutputStream oss = new ObjectOutputStream(os);

            for (Student student : list) {
                // Ghi đối tượng student vào luồng.
                oss.writeObject(student);
            }
            // Đẩy tất cả dữ liệu đã ghi vào luồng xuống file.
            oss.flush();
            //  Đóng luồng sau khi đã ghi xong
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readDataFile (File file) {
        try {
            // Tạo một đối tượng InputStream để đọc dữ liệu từ file.
            InputStream is = new FileInputStream(file);
            // Tạo một đối tượng ObjectInputStream để đọc các đối tượng từ luồng dữ liệu.
            ObjectInputStream ois = new ObjectInputStream(is);
            Student student = null;
            while (true) {
                // Đọc một đối tượng từ luồng và gán cho biến objects.
                Object objects = ois.readObject();
                if (objects == null)
                    break;
                if (objects != null) {
                    //  Ép kiểu biến objects về kiểu Student và gán cho biến student.
                    student = (Student) objects;
                    this.list.add(student);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

