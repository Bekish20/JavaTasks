package exeptions;

public class Student {
    private String studentName;
    private String facultyName;
    private int groupNumber;
    private String firstSubjectName;
    private double firstSubjectMark;
    private String secondSubjectName;
    private double secondSubjectMark;
    private String thirdSubjectName;
    private double thirdSubjectMark;


    public Student(String studentName, String facultyName, int groupNumber,String firstSubjectName, double firstSubjectMark
            ,String secondSubjectName, double secondSubjectMark,String thirdSubjectName, double thirdSubjectMark){
        this.studentName=studentName;
        this.facultyName=facultyName;
        this.groupNumber=groupNumber;
        this.firstSubjectName=firstSubjectName;
        this.firstSubjectMark=firstSubjectMark;
        this.secondSubjectName=secondSubjectName;
        this.secondSubjectMark=secondSubjectMark;
        this.thirdSubjectName=thirdSubjectName;
        this.thirdSubjectMark=thirdSubjectMark;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFacultyName(){
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getGroupNumber(){
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getFirstSubjectName(){
        return firstSubjectName;
    }
    public void setFirstSubjectName(String firstSubjectName){
        this.firstSubjectName=firstSubjectName;
    }

    public double getFirstSubjectMark() {
        return firstSubjectMark;
    }
    public void setFirstSubjectMark(double firstSubjectMark) {
        this.firstSubjectMark = firstSubjectMark;
    }

    public String getSecondSubjectName(){
        return secondSubjectName;
    }
    public  void setSecondSubjectName(String secondSubjectName){
        this.secondSubjectName=secondSubjectName;
    }

    public double getSecondSubjectMark() {
        return secondSubjectMark;
    }
    public void setSecondSubjectMark(double secondSubjectMark) {
        this.secondSubjectMark = secondSubjectMark;
    }

    public String getThirdSubjectName(){
        return thirdSubjectName;
    }
    public void setThirdSubjectName(String secondSubjectName){
        this.thirdSubjectName=thirdSubjectName;
    }

    public double getThirdSubjectMark() {
        return thirdSubjectMark;
    }
    public void setThirdSubjectSubjectMark(double thirdSubjectMark) {
        this.thirdSubjectMark = thirdSubjectMark;
    }



      public String toString(){
        return "Student name:"+studentName+" Faculty name:"+facultyName+" Group number:"+groupNumber
                +"First subject name:"+firstSubjectName+"First subject mark:"+firstSubjectMark+"Second subject name:"
                +secondSubjectName+"Second subject mark:"+secondSubjectMark+"Third subject name:"+thirdSubjectName
                +"Third subject mark:"+thirdSubjectMark+".";
    }
}
