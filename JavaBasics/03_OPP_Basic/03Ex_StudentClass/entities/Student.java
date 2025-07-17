package  entities;

public class  Student{
    public String name ;
    public double period1 ;
    public double period2 ;
    public double period3 ;

    public  double calculateGrade(){
        double total = period1 + period2 + period3;
        return total;
    }

    public double caculatePercetage(){
        double  maxGrade = 100.00;
        double total = calculateGrade();
        double result = (total / maxGrade) * 100.00;
        return result;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
            "Period 1: " + period1 + "\n" +
            "Period 2: " + period2 + "\n" +
            "Period 3: " + period3 + "\n" +
            "Total Grade: " + calculateGrade() + "\n" +
            "Percentage: " + caculatePercetage() + "%";
    }
}