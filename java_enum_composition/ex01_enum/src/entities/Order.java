package entities;
import java.util.Date;

public class Order {
      private Integer id;
      private Date moment;
      private OrderStatus status;
      private String name;
      private Double price;

      public Order(){}

      public Order( Integer id, Date moment , OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
      }


    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
