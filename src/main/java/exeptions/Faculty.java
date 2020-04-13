package exeptions;

public class Faculty {
    private String facultyName;
    private int numberOfGroups;
    private int numberOfStudentsFaculty;


    public Faculty(String facultyName, int numberOfGroups, int numberOfStudentsFaculty){
        this.facultyName=facultyName;
        this.numberOfGroups=numberOfGroups;
        this.numberOfStudentsFaculty=numberOfStudentsFaculty;
    }
    public String getFacultyName(){
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public int getNumberOfStudents() {
        return numberOfStudentsFaculty;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudentsFaculty = numberOfStudentsFaculty;
    }
    public String toString(){
        return "Faculty name:"+facultyName+" Number of groups:"+numberOfGroups
                +" Number of students:"+numberOfStudentsFaculty+".";
    }
}
