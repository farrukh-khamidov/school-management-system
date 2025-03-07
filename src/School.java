public class School {
    private Teacher[] teachers;
    private Student[] students;

    public School() {
        this.teachers = new Teacher[100];
        this.students = new Student[100];
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {

    }
}
