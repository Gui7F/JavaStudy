package entities;

public class Clients {
    private String name;
    private String email;
    private int roomNumber;

    public Clients() {
    }

    public Clients(String name, String email, int roomNumber){
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoomNumber (){
        return roomNumber;
    }


}
