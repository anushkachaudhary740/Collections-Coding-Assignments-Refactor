package corejava.collection.assignment02.Assignment5.mapping;
import corejava.collection.assignment02.Assignment5.model.Student;
public class Datamap {
    public static Student map(String data) {
        String []splitArray = data.split(",");
        try {
            Integer studentId = Integer.parseInt(splitArray[0]);
            String studentName = splitArray[1];
            String department = splitArray[2];
            Integer Salary = Integer.parseInt(splitArray[3]);

            Student sal = new Student(studentId,studentName,department,Salary);
            return sal;
        }catch (NumberFormatException nm)
        {
            throw new RuntimeException(nm);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
