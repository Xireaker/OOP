public class Department {
    String name;
    Employee[] employees;
    int size;

    Department(String name){
        this.name = name;
        size = 8;
        employees = new Employee[size];
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
        boolean entered = false;
        for(int index = 0; index < this.employees.length; index++){
            if (this.employees[index] == null) {
                this.employees[index] = employees;
                entered = true;
                break;
            }
        }
        if(entered == false){
            Employee[] buffer = new Employee[this.size];
            System.arraycopy(this.employees,0,buffer,0,this.employees.length);
            this.size = this.size * 2;
            this.employees = new Employee[this.size];
            System.arraycopy(buffer,0,this.employees,0,buffer.length);
            this.employees[buffer.length+1] = employees;
        }
    }
    public Employee[] getEmployees() {
        return employees;
    }

    public Employee[] getEmployees(String jobTitle){
        return employees;
    }

}
