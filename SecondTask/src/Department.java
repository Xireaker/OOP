public class Department {
    String name;
    Employee[] employees;
    int size;

    Department(String name){
        this.name = name;
        employees = new Employee[8];
        size = 8;
    }
    Department(String name, int size){
        this.name = name;
        this.size = size;
        employees = new Employee[size];
    }
    Department(String name, Employee[] employees){
        this.name = name;
        this.employees = employees;
        size = employees.length;
    }
    public void addEmployees(Employee employees){

    }
    public Employee[] getEmployees() {
        return employees;
    }

    public Employee[] getEmployees(String jobTitle){
        return employees;
    }

}