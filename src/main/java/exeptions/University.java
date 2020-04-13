package exeptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class University {

    static List<Faculty> faculty = Arrays.asList(
            new Faculty("ISF", 2, 47),
            new Faculty("PF",1,15),
            new Faculty("MF",0,52)
    );
    static List<Group> group = Arrays.asList(
            new Group("ISF",403, 25),
            new Group("ISF",404, 22),
            new Group("ISF",403, 25),
            new Group("PF",105, 15),
            new Group("MF",201,20),
            new Group("MF",202,21),
            new Group("MF",203,0)
    );
    static List<Student> student = Arrays.asList(
            new Student("Popov1", "ISF", 403, "Math", 5
                    , "Sapromat", 7, "Geod", 8),
            new Student("Popov2", "ISF", 403, "Math", 6
                    , "Sapromat", 5, "Geod", 2),
            new Student("Popov3", "ISF", 404, "Math", 3
                    , "Sapromat", 6, "Geod", 5),
            new Student("Popov4", "ISF", 404, "Math", 10
                    , "Sapromat", 3, "Geod", 1),
            new Student("Popov5", "PF", 105, "Math", 1000
                    , "History", 4, "Psuhology", 10),
            new Student("Popov6", "PF", 105, "Math", 2
                    , "History", 8, "Psuhology", 9),
            new Student("Popov7", "MF", 205, "Math", 1
                    , "Sapromat", 9, "Material", 7),
            new Student("Popov8", "MF", 205, "Math", 8
                    , "Sapromat", 10, "Material", 3),
            new Student("Popov9", "MF", 206, "Math", 9
                    , "Sapromat", 5, "Material", 4),
            new Student("Popov10", "MF", 206, "Math", 5
                    , "Sapromat", 2, "Material", 6),
            new Student("Popov11", "MF", 207, "Termeh", 5
                    , "Sapromat", 1, "Material", 7),
            new Student("Popov12", "MF", 207, "Termeh", 6
                    , "Sapromat", 3, "Material", 2),
            new Student("Popov13", "MF", 207, null, 0
                    , null, 0, null, 0)

    );

    public static void main(String[] args) {
        University task = new University();
        task.getAverageInAllSubjectsOneStudent("Popov8");
        task.getMathAverageInIsfFaculty403Group();
        task.getAverageMathSubjectsAllStudents("Math");

        try {
            task.checkingMarks();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("Exception was processed. Program continues");
        } finally {
            System.out.println("-------------");
        }

        try {
            task.checkingForSubjectsName();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Exception was processed. Program continues");
        } finally {
            System.out.println("-------------");
        }

        try {
            task.checkingStudentsInGroups();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Exception was processed. Program continues");
        } finally {
            System.out.println("-------------");
        }

        try {
            task.checkingGroupsInFaculty();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Exception was processed. Program continues");
        } finally {
            System.out.println("-------------");
        }

        try {
            task.checkingGroupsInUniversity();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Exception was processed. Program continues");
        } finally {
            System.out.println("-------------");
        }
    }


    void checkingMarks() {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getFirstSubjectMark() < 0 || student.get(i).getFirstSubjectMark() > 10) {
                throw new IndexOutOfBoundsException("Exception: the mark should be in the range of 0 to 10! "
                        + student.get(i));
            }
            if (student.get(i).getSecondSubjectMark() < 0 || student.get(i).getSecondSubjectMark() > 10) {
                throw new IndexOutOfBoundsException("Exception: the mark should be in the range of 0 to 10! "
                        + student.get(i));
            }
            if (student.get(i).getThirdSubjectMark() < 0 || student.get(i).getThirdSubjectMark() > 10) {
                throw new IndexOutOfBoundsException("Exception: the mark should be in the range of 0 to 10! "
                        + student.get(i));
            }
        }
    }

    void checkingForSubjectsName() {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getFirstSubjectName() == null && student.get(i).getSecondSubjectName() == null
                    && student.get(i).getThirdSubjectName() == null) {
                throw new NoSuchElementException("Exception: missing subject name! "
                        + student.get(i));
            }
        }
    }

    void checkingStudentsInGroups() {
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getNumberOfStudentsGroup() <= 0) {
                throw new NoSuchElementException("Exception: missing number of students in group! "
                        + group.get(i));
            }
        }
    }

    void checkingGroupsInFaculty() {
        for (int i = 0; i < faculty.size(); i++) {
            if (faculty.get(i).getNumberOfGroups() <= 0) {
                throw new NoSuchElementException("Exception: missing number of students in group! "
                        + faculty.get(i));
            }
        }
    }

    void checkingGroupsInUniversity() {
        if (faculty.isEmpty()) {
            throw new NoSuchElementException("Exception: missing faculty in university! ");
        }
    }

    public void getAverageInAllSubjectsOneStudent(String a) {
        for (Student specificStudent : student) {
            if (specificStudent.getStudentName() == a) {
                double average = 0;
                double sum = 0;
                sum = specificStudent.getFirstSubjectMark() + specificStudent.getSecondSubjectMark()
                        + specificStudent.getThirdSubjectMark();
                average = sum / 3;
                System.out.println("Average in all subjects:" + specificStudent.getStudentName() + "=" + average);
            }
        }
    }

    public List<Student> getMathInIsfFaculty403Group() {
        List<Student> firstSubject = new ArrayList<>();
        for (Student specificSubject : student) {
            if (specificSubject.getFirstSubjectName() == "Math" && specificSubject.getFacultyName() == "ISF"
                    && specificSubject.getGroupNumber() == 403) {
                firstSubject.add(specificSubject);
            }
        }
        return firstSubject;
    }

    public void getMathAverageInIsfFaculty403Group() {
        List<Student> firstSubjList = getMathInIsfFaculty403Group();
        double sum = 0;
        double average = 0;
        for (Student subject : firstSubjList) {
            sum = sum + subject.getFirstSubjectMark();
        }
        average = sum / firstSubjList.size();
        System.out.println("Faculty ISF, group 403, Math average:" + average);
    }

    public List<Student> getMathSubjectAllStudents() {
        List<Student> listMathSubject = new ArrayList<>();
        for (Student mathSubject : student) {
            if (mathSubject.getFirstSubjectName() == "Math" || mathSubject.getSecondSubjectName() == "Math"
                    || mathSubject.getThirdSubjectName() == "Math") {
                listMathSubject.add(mathSubject);
            }
        }
        return listMathSubject;
    }

    public void getAverageMathSubjectsAllStudents(String y) {
        List<Student> listMathSubject = getMathSubjectAllStudents();
        double sum = 0;
        double average = 0;
        for (Student subject : listMathSubject) {
            if (subject.getFirstSubjectName() == y) {
                sum = sum + subject.getFirstSubjectMark();
            }
            if (subject.getSecondSubjectName() == y) {
                sum = sum + subject.getSecondSubjectMark();
            }
            if (subject.getThirdSubjectName() == y) {
                sum = sum + subject.getThirdSubjectMark();
            }
        }
        average = sum / listMathSubject.size();
        System.out.println("All students in university - Math average:" + average);
    }

}
