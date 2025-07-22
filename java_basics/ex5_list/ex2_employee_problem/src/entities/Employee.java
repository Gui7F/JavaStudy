package  entities;

public class Employee {
	private final Integer id;
    private String name;
    private Double salary;

    public Employee(){
        this.id = null;
        this.name = null;
        this.salary = null;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public void increaseSalary(int percent){
        if(percent > 0){
            getSalary();
            this.salary += this.salary * percent / 100.0;
        }else {
            System.out.println("Percent must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return
                id + ", " +
                name + ", " +
                String.format("%.2f\n", salary);
    }
}
