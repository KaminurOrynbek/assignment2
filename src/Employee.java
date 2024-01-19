public class Employee extends Person {
    private String position;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(){
        super();
    }

    public Employee(String name, String surname, String Position, float salary) {
        super.setName(name);
        super.setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
