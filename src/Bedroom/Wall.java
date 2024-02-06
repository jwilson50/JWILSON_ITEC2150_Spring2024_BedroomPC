package Bedroom;

public class Wall {

    //direction
    private String direction; //north,south, east, west or other directions

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String toString(){
        return "Wall class: " + direction;
    }
}
