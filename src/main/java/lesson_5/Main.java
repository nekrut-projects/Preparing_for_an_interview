package lesson_5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        for (int i = 0, j = 1; i < 100; i++, j++) {
            studentDao.add(new Student("Bob_" + (i+1), j));
            if (j == 5){
                j = 0;
            }
        }

        Student testStudent = new Student("NickKKKKK", 4);
        studentDao.add(testStudent);
        testStudent.setName("Nick");
        studentDao.update(testStudent);
        System.out.println(studentDao.getName(101L));
        studentDao.delete(100L);
        studentDao.delete("Nick");

        List<Student> students = studentDao.getAll();
        for (Student s: students) {
            System.out.format("id: %d  name: %s  mark: %d\n", s.getId(), s.getName(), s.getMark());
        }

        studentDao.closeSessionFactory();
    }
}
