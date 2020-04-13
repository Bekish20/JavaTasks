package exeptions;

public class Group {
      private String facultyName;
      private int groupNumber;
      private int numberOfStudentsGroup;

      public Group (String facultyName, int groupNumber, int numberOfStudentsGroup){
          this.facultyName=facultyName;
          this.groupNumber=groupNumber;
          this.numberOfStudentsGroup=numberOfStudentsGroup;
      }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getNumberOfStudentsGroup() {
        return numberOfStudentsGroup;
    }

    public void setNumberOfStudentsGroup(int numberOfStudentsGroup) {
        this.numberOfStudentsGroup = numberOfStudentsGroup;
    }

    public String toString(){
        return "Faculty name:"+facultyName+" Group number:"+groupNumber+" Number of students in a group:"+numberOfStudentsGroup+".";
    }
}
