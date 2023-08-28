import java.awt.*;

public class RobotSimulation {
    private int x; // x-coordinate of the robot's location
    private int y; // y-coordinate of the robot's location
    private String direction; // Direction the robot is facing: "N", "E", "S", "W"

    public RobotSimulation() {
        x = 0;
        y = 0;
        direction = "N"; // Initial direction is north
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }
    }

    public Point getLocation() {
        return new Point(x, y);
    }

    public String getDirection() {
        return direction;
    }
}
