public class Employee {
    String firstName;
    String secondName;
    String jobTitle;
    int salary;

    Employee(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        jobTitle = "";
        salary = 0;
    }

    Employee(String firstName, String secondName, String jobTitle, int salary){
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
