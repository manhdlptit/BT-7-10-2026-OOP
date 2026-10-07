public abstract class Employee {
    String nameE;
    int ageE;
    public Employee(String name, int age){
        this.nameE = name;
        this.ageE = age;
    }
    public abstract double calSalary();
}