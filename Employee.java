public class Employee {
    // Attributes of the employee class
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize the employee object
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary  = salary;
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method fot the name attribute
    public void setName(String name){
        this.name = name;
    }

    // Getter method for the jobTitle attribute
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter method for the jobTitle attribute
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    // Getter method for salary attribute
    public double getSalary() {
        return salary;
    }

    //Setter method for the  salary attribute
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate the annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary formula: Monthly salary multiplied by 12
    }

    // Method to give a raise by certain percentage
    public void giveRaise(double percentage) {
        salary += salary * (percentage / 100); // Increase salary by a percentage
    }

    public static void main(String[]args){
        // Create an instance of the employee class
        Employee employee = new Employee("Alexandra Preciado", "Software Engineer", 5000.0);

        // Print the initial details of the employee
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        // Give employee a 10% raise
        employee.giveRaise(10);

        // Print the updated details of the employee
        System.out.println("\nAfter 10% Raise: ");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
    }
}