public class OfficeEmployee extends Employee{
    int dayWorkingOE;
    final double salaryDay = 100.00;
    public OfficeEmployee(String name, int age, int dayWorking){
        super(name, age);
        this.dayWorkingOE = dayWorking;
    }
    @Override
    public double calSalary(){
        return dayWorkingOE * salaryDay;
    }
}