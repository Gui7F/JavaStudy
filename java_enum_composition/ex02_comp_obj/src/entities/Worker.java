package entities;
import enums.WorkerLevel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //A composição de objetos começa aqui
    //Um funcionario tem so um departamento por isso valor unico
    private Departament departament;
    //Porem um funcionario pode ter vario contratos por isso uma lista
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getSalary(){
        return baseSalary;
    }

    public void setSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }
    
    public WorkerLevel getLevel(){
        return  level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public Departament getDepartament(){
        return departament;
    }

    public void setDepartament(Departament departament){
        this.departament = departament;
    }

    public List<HourContract> getContracts(){
        return  contracts;
    }

    public void addContract (HourContract contract){
        contracts.add(contract);
    }

    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        Double sum = baseSalary;
        for(HourContract c : contracts){
            LocalDate contractDate = c.getDate();
            if (contractDate.getYear() == year && contractDate.getMonthValue() == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
