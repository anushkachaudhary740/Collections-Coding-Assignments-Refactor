package corejava.collection.assignment02.Assignment4.model;

public class Student {
    private Integer studentId;
    private String subjectName;
    private Integer studentMarks;

    public Student(Integer studentId, String subjectName , Integer studentMarks) {
        this.studentId = studentId;
        this.subjectName = subjectName;
        this.studentMarks = studentMarks;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Integer studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Subject: {1}\t Marks: {2}\n", studentId, subjectName,
                studentMarks);
    }
}


