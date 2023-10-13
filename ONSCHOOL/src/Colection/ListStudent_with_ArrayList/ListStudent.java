package Colection.ListStudent_with_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
}

