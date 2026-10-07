public class TechnicalEmployee extends Employee{
    int hourWorkingTE;
    double salaryHourTE;
    public TechnicalEmployee(String name, int age, int hourWorking, double salaryHour){
        super(name, age);
        this.hourWorkingTE = hourWorking;
        this.salaryHourTE = salaryHour;
    }
    @Override
    public double calSalary(){
        return hourWorkingTE * salaryHourTE;
    }
}