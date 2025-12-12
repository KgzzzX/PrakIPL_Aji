package Latihan;

public class Main {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.setName("Aji");

            Assignment a1 = new Assignment();
            a1.setMark(90);

            CourseRecord cr = new CourseRecord();
            cr.setStudent(s);
            cr.addAssignment(a1);

            Course c = new Course();
            c.setTitle("Pemrograman Berorientasi Objek");
            c.addCourseRecord(cr);

            System.out.println("Student: " + cr.getStudent().getName());
            System.out.println("Mark: " + a1.getMark());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
