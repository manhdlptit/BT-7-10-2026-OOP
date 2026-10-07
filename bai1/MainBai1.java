public class MainBai1 {
    public static void main(String[] args){
        Employee[] employees = new Employee[] {
            new OfficeEmployee("M1", 19, 20),
            new TechnicalEmployee("M2", 20, 2000, 1000)
        };

        for (Employee employee : employees){
            System.out.println(employee.calSalary());
        }
    }
}