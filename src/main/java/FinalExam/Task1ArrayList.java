package FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class Task1ArrayList {
    public static void main(String[] args) {

        try {
            Task1ArrayList task = new Task1ArrayList();
            task.readData();


        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public List<Student> readData() {
        ArrayList<Student> listStudent = new ArrayList<Student>();
        Student student = new Student("184240011", "Đặng Văn thường", "dvthuong@gmail.com", 3, 4, 7, 8);
        Student student2 = new Student("18424002", "Trần Thị Hằng", "hangtt@gmail.com", 2, 4, 8, 7);
        Student student3 = new Student("18424003", "Trần Thị Hà", "hatt@gmail.com", 2, 2, 8, 6);
        Student student4 = new Student("18424004", "Trần Văn Hiếu", "hieutt@gmail1.com", 2, 1, 8, 9);
        Student student5 = new Student("18424005", "Trần Minh Anh", "anhtm@gmail2.com", 1, 4, 8, 9);
        Student student6 = new Student("18424006", "Trần Minh Hương", "huongtm@gmail.com", 2, 2, 8, 8);
        Student student7 = new Student("18424007", "Trần Minh Ngọc", "ngoctm@gmail.com", 2, 1, 8, 5);
        Student student8 = new Student("18424009", "Trần Tuấn Anh", "anhtt@gmail.com", 3, 3, 8, 7);
        Student student9 = new Student("18424009", "Trần Tuấn Hưng", "hungtt@gmail.com", 1, 3, 8, 10);
        Student student10 = new Student("184240010", "Trần thanh Tâm", "tamtt@gmail.com", 1, 1, 8, 6);
        Student student11 = new Student("184240092", "Trần Tuấn Hưng", "hungt1t@gmail.com", 1, 3, 8, 1);
        Student student12 = new Student("1842400101", "Trần thanh Tâm", "tam1tt@gmail.com", 1, 1, 8, 1);

        listStudent.add(student);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);
        listStudent.add(student7);
        listStudent.add(student8);
        listStudent.add(student9);
        listStudent.add(student10);
        listStudent.add(student11);
        listStudent.add(student12);

        System.out.println("List student after add:");
        for (Student stu : listStudent) {
            System.out.println(stu.toString());
        }

        SortingLT(listStudent);

        SortingLTMin(listStudent);

        return listStudent;
    }

    public void SortingLT(List<Student> list) {
        List<Student> st1 = list.stream().sorted(Comparator.comparing(Student::getLt).reversed()).distinct().limit(10).collect(Collectors.toList());
        int index = 0;
        for (Student sv : st1
        ) {

            System.out.println(" Sinh viên có số điểm lý thuyết cao nhất thứ:" + index++ + " \n" + sv.toString());
        }
    }

    public void SortingLTMin(List<Student> list) {
        List<Student> st2 = list.stream().sorted(Comparator.comparing(Student::getLt)).distinct().limit(10).collect(Collectors.toList());
        int index = 0;
        for (Student sv : st2
        ) {

            System.out.println(" Sinh viên có số điểm lý thuyết thấp nhất thứ: " + index++ + " \n" + sv.toString());
        }
    }

    }







