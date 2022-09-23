package corejava.collection.assignment02.Assignment5.model;

public class Student {
    private Integer studentId;
    private String studentName;
    private String department;
    private Integer Salary;

    public Student(Integer studentId, String studentName ,String department, Integer Salary) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.Salary=Salary;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Name: {1}\t department: {2}\t Salary: {3}\n", studentId,studentName,
                department,Salary);
    }
}
