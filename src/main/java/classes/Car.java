package classes;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int regNumber;


    public static void main(String[] args){
        Car[] carm=new Car[10];
        carm[0]=new Car(1,"audi","q3",2005,"black",6000,6547);
        carm[1]=new Car(2,"skoda","fabia",2000,"red",4500,6587);
        carm[2]=new Car(3,"vokswagen","golf2",1989,"black",750,4837);
        carm[3]=new Car(4,"audi","q3",2006,"black",6500,6637);
        carm[4]=new Car(5,"shkoda","fabia",2003,"gray",5000,5897);
        carm[5]=new Car(6,"audi","q3",2007,"black",7000,6497);
        carm[6]=new Car(7,"vokswagen","golf2",1990,"black",950,6526);
        carm[7]=new Car(8,"shkoda","fabia",2006,"black",5200,6558);
        carm[8]=new Car(9,"audi","q3",2002,"red",4500,6037);
        carm[9]=new Car(10,"vokswagen","golf2",1993,"white",2500,6347);
        Calendar date1=new GregorianCalendar();
        Scanner write=new Scanner(System.in);
        System.out.println("Information about all cars:");
        for (int i=0;i<carm.length;i++){
            System.out.println(carm[i].toString());
        }

        System.out.println();
        System.out.println("Cars of the corresponding brand: ");
        System.out.println("Enter brand of car(vokswagen,audi,shkoda): ");
        String carMark=write.nextLine();
        for (int r=0;r<carm.length;r++){
            carm[r].showMark(carMark);
        }
        System.out.println();
        System.out.println("Information about cars exploited over ??? years: ");
        System.out.println("Enter machine model(q3/fabia/golf2....): ");
        String carModel=write.nextLine();
        System.out.println("Enter the term of operation(1/2/12....): ");
            int exploitation=write.nextInt();
        int nowYear=date1.get(Calendar.YEAR);
        System.out.println(nowYear);
        for(int j=0;j<carm.length;j++){
            carm[j].showModelYear(carModel,exploitation,nowYear);
        }
        System.out.println();
        System.out.println("Information about cars exploited over ??? years and cost: ");
        System.out.println("Enter the year of issue(1990....): ");
        int release=write.nextInt();
        System.out.println("Enter the cost(6500....): ");
        int cost=write.nextInt();
        for( int q=0;q<carm.length;q++){
            carm[q].showYearPrice(release,cost);
        }
    }

    public Car(int id,String mark,String model,int year,String color,int price,int regNumber){
        this.id=id;
        this.mark=mark;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.regNumber=regNumber;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark=mark;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getRegNumber(){
        return regNumber;
    }
    public void setRegNumber(int regNumber){
        this.regNumber=regNumber;
    }
    public String toString(){
        return "Id:"+id+" Mark:"+mark+" Model:"+model+" Year:"+year+" Color:"+color+" Price:"+price+" Registration number:"+regNumber;
    }

        public void showMark(String x){
        if (getMark().equals(x)){
            System.out.println("Id: "+getId()+"  Mark: "+getMark()+"  Model: "+getModel()+"  Year: "+getYear()+"  Color: "+
                    getColor()+"  Price: "+getPrice()+"  Registration number: "+getRegNumber());
        }
       }
       public void showModelYear(String y,int z,int xy){
                if(getModel().equals(y) && (xy-getYear())>z){
                    System.out.println("Id: "+getId()+"  Mark: "+getMark()+"  Model: "+getModel()+"  Year: "+getYear()+"  Color: "+
                        getColor()+"  Price: "+getPrice()+"  Registration number: "+getRegNumber());

                }
       }
       public void showYearPrice(int xz, int yx){
        if (getYear()==xz && getPrice()>yx){
            System.out.println("Id: "+getId()+"  Mark: "+getMark()+"  Model: "+getModel()+"  Year: "+getYear()+"  Color: "+
                getColor()+"  Price: "+getPrice()+"  Registration number: "+getRegNumber());}
       }


}
