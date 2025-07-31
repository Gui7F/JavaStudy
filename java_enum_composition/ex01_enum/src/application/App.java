package application;

import java.util.Date;

import entities.Order;
import entities.OrderStatus;

public class App {
    public static void main(String[] args) {
         // Aqui vamos aprender a usar enum, enums sao usados para agrupar
         //valores que são constantes do seu sistema, por exemplo, um status de pedido
         //em caso onde o valores são constantes é um boa usar enums ao inves de objeto

         //Vantagens: São autocompletado por compiladores, são mais legiveis que objetos
        
         Order order  = new Order(122, new Date(), OrderStatus.PENDING_PAYMENT);

         System.out.println(order);

         // Podemos converter o valor de uma string escrita igual ao nome do enum para enum
         // com metodo valueOf do proprio Enum do Java

         OrderStatus status1 = OrderStatus.PROCESSING;
         OrderStatus status2 = OrderStatus.valueOf("PROCESSING");

         System.out.println("Valor status1: " + status1 + "  Valor status2: " + status2);

    }
}
