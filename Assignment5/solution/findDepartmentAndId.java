package corejava.collection.assignment02.Assignment5.solution;

import corejava.collection.assignment02.Assignment5.model.Student;

import java.util.*;
public class findDepartmentAndId {
    private List<Student> studentList;

    public findDepartmentAndId(List<Student> studentArrayList ) {

        this.studentList=studentArrayList;
    }


    public Set findDepartmentName() {
        Set<String> depName = new HashSet<>();
        Iterator<Student> it1 = studentList.iterator();
        while (it1.hasNext()) {
            Student hs = it1.next();
            depName.add(hs.getDepartment());
        }
        return depName;
    }

    public void calculateAnswer(Set depName){

        for (Object dep : depName) {
            Iterator<Student> it = studentList.iterator();
            List<Integer> salary = new ArrayList<>();

            while (it.hasNext()) {
                Student values = it.next();
                String getDepartment = values.getDepartment();

                if (dep.equals(getDepartment)) {
                    Integer getSalary = values.getSalary();
                    salary.add(getSalary);
                }
            }
            Integer maxSalary = Collections.max(salary);

            Iterator<Student> it2 = studentList.iterator();
            while (it2.hasNext()) {
                Student values = it2.next();
                Integer getSal = values.getSalary();
                if (maxSalary == getSal) {
                    System.out.println(values.getDepartment() + ":" + values.getStudentId());
                }
            }
        }

    }

}

