public class School {
    private Teacher[] teachers;
    private Student[] students;
    private int teachersCount = 0;
    private int studentsCount = 0;

    private double totalMoneyEarned = 0;
    public School() {
        this.teachers = new Teacher[10];
        this.students = new Student[10];
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers[teachersCount++] = teacher;
        teacher.setSchool(this);
    }

    public void addStudent(Student student) {
        students[studentsCount++] = student;
    }

    public double getTotalMoneyEarned() {
        double totalMoneyEarned = 0;
        for (int i = 0; i < studentsCount; i++) {
            totalMoneyEarned += students[i].getFeesPaid();
        }
        return totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        double totalMoneySpent = 0;
        for (int i = 0; i < teachersCount; i++) {
            totalMoneySpent += teachers[i].getSalaryEarned();
        }
        return totalMoneySpent;
    }

}
