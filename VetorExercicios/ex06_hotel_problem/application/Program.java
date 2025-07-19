package VetorExercicios.ex06_hotel_problem.application;

import VetorExercicios.ex06_hotel_problem.entities.Clients;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rooms will be rented: ");

        int numberOfRooms = sc.nextInt();

        Clients[] rentedRooms = new Clients[10];        

        for (int i = 0; i < numberOfRooms; i++){
            System.out.print("Enter your name:");
            String name = sc.next();
            System.out.print ("Enter your email:");
            String email = sc.next();
            System.out.print("Enter your room number:");
            int roomNumber = sc.nextInt();

            rentedRooms[roomNumber] = new Clients (name, email, roomNumber);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rentedRooms.length; i++){
            if (rentedRooms[i] != null) {
                System.out.println(rentedRooms[i].getRoomNumber() + ": " + rentedRooms[i].getName() + ", " + rentedRooms[i].getEmail());
            }
        }

        sc.close();
    }
}
