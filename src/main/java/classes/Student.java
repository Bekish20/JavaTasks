package classes;

import java.sql.Date;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        stu[0] = new Student(1, "Volk1", "Andrei", "Volkov1", new Date(1990,
                            9, 8), "gai 17a", 666312, "FSK", 5, 402);
        stu[1] = new Student(2, "Volk2", "Andrei", "Volkov2", new Date(1989,
                            1, 9), "gai 20", 666313, "FSK", 5, 403);
        stu[2] = new Student(3, "Volk3", "Andrei", "Volkov3", new Date(1991,
                            9, 12), "gai 21", 666314, "FSK", 4, 400);
        stu[3] = new Student(4, "Volk4", "Andrei", "Volkov4", new Date(1993,
                            8, 8), "gai 22", 666315, "ISF", 4, 401);
        stu[4] = new Student(5, "Volk5", "Andrei", "Volkov5", new Date(1988,
                            7, 3), "gai 23", 666316, "FFF", 3, 400);
        stu[5] = new Student(6, "Volk6", "Andrei", "Volkov6", new Date(1993,
                            8, 25), "gai 24", 666317, "ISF", 5, 402);
        stu[6] = new Student(7, "Volk7", "Andrei", "Volkov7", new Date(1994,
                            3, 24), "gai 25", 666318, "FFF", 5, 403);
        stu[7] = new Student(8, "Volk8", "Andrei", "Volkov8", new Date(1990,
                            4, 18), "gai 25", 666319, "ISF", 5, 406);
        stu[8] = new Student(9, "Volk9", "Andrei", "Volkov9", new Date(1991,
                            4, 16), "gai 26", 666320, "FFF", 1, 407);
        stu[9] = new Student(10, "Volk10", "Andrei", "Volkov10", new Date(1992,
                            2, 15), "gai 27", 666321, "FFF", 5, 401);

        System.out.println("All student information");
        for (int t = 0; t < 10; t++) {
            System.out.println(stu[t].toString());
        }

        System.out.println();
        System.out.print("Select faculty to view students:ISF/FSK/FFF: ");
        Scanner write = new Scanner(System.in);
        String fname = write.nextLine();
        System.out.println("Students of the " + fname + " faculty:");
        for (int i = 0; i < 10; i++) {
            stu[i].showFac(fname);
        }

        System.out.println();
        System.out.print("Select faculty to view students(ISF/FSK/FFF): ");
        String fname1 = write.nextLine();
        System.out.print("Select course to view students(1/2/3/4/5): ");
        int cnumber = write.nextInt();
        System.out.println("Students of the " + fname1 + " faculty" + " course " + cnumber + ":");
        for (int j = 0; j < 10; j++) {
            stu[j].showFacCours(fname1, cnumber);
        }

        System.out.println();
        System.out.print("Determine the year of birth to sort students(1990;1991....): ");
        int stuyear = write.nextInt();
        for (int q = 0; q < 10; q++) {
            stu[q].showYear(stuyear);
        }

        System.out.println();
        System.out.print("Select group to view students(402-407): ");
        int stgroup = write.nextInt();
        for (int r = 0; r < 10; r++) {
            stu[r].showGroup(stgroup);
        }
        System.out.println();
    }

    private int id;
    private String surname;
    private String name;
    private String middlename;
    private Date dateofBirth;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private int group;

    public Student(int id, String surname, String name, String middlename, Date dateofBirth,
                   String address, int phone, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.dateofBirth = dateofBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Date getDateodBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String toString() {
        return "Id:" + id +
                " Syrname:" + surname +
                " Name:" + name +
                " Middlename:" + middlename +
                " Date of birth:" + dateofBirth.getDate() +
                "." + dateofBirth.getMonth() +
                "." + dateofBirth.getYear() +
                " Address:" + address +
                " Phone:" + phone +
                " Facilty:" + faculty +
                " Course:" + course +
                " Group:" + group;
    }

    public void showFac(String x) {
        if (getFaculty().equals(x)) {
            System.out.println(getId() + ":" + getSurname() + " " + getName() + " " + getMiddlename());
        }
    }

    public void showFacCours(String y, int z) {
        if ((getFaculty().equals(y)) && getCourse() == z) {
            System.out.println(getId() + ":" + getSurname() + " " + getName() + " " + getMiddlename() +
                                " Course " + getCourse());
        }
    }

    public void showYear(int xy) {
        if (getDateodBirth().getYear() > xy) {
            System.out.println(getId() + ":" + getSurname() + " " + getName() + " " + getMiddlename() +
                                " date of birth " + getDateodBirth().getYear());
        }
    }

    public void showGroup(int xz) {
        if (getGroup() == xz) {
            System.out.println(getId() + ":" + getSurname() + " " + getName() + " " + getMiddlename() +
                                 " Group " + getGroup());
        }
    }
}








