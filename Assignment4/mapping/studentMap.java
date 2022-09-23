package corejava.collection.assignment02.Assignment4.mapping;

import corejava.collection.assignment02.Assignment4.model.Student;

public class studentMap {
    public static Student map(String data) {
        String[] splitArray = data.split(",");
        try {
            Integer studentId = Integer.parseInt(splitArray[0]);
            String subjectName = splitArray[1];
            Integer studentMarks = Integer.parseInt(splitArray[2]);

            Student student = new Student(studentId, subjectName, studentMarks);
            return student;
        } catch (NumberFormatException n) {
            throw new RuntimeException(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
