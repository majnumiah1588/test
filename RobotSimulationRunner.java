
public class RobotSimulationRunner {
    public static void main(String[] args) {
        RobotSimulation robot = new RobotSimulation();
        System.out.println("Initial Location: " + robot.getLocation() + ", Direction: " + robot.getDirection());

        robot.turnRight();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();

        System.out.println("Final Location: " + robot.getLocation() + ", Direction: " + robot.getDirection());
    }
}