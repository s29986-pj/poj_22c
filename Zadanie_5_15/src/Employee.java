public class Employee extends SchoolResource {
    private double salary;
    public String department;

    public Employee(String resourceName, String description, double salary, String department) {
        super(resourceName, description);
        this.salary = salary;
        this.department = department;
    }

    public void work() {
        System.out.println(resourceName + " is working in the " + department + " department.");
    }

    @Override
    public String getResourceDetails() {
        return super.getResourceDetails() + ", Salary: " + salary + ", Department: " + department;
    }

    @Override
    protected void allocateResource() {
        System.out.println("Allocating employee to a new project.");
    }
}
