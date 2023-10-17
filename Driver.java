public class Driver {
    public static void main(String args[]) {

        SolarSystem window = new SolarSystem(800, 800);
        Sun sun = new Sun(100, window, "YELLOW");
        Planet earth = new Planet(sun, window, 1, 10, "BLUE", 150, 180);
        Planet mercury = new Planet(sun, window, 3, 6, "GRAY", 100, 60);
        Planet mars = new Planet(sun, window, 2, 8, "RED", 200, 270);

        while (true) {
            earth.updatePosition(window);
            sun.updatePosition(window);
            mercury.updatePosition(window);
            mars.updatePosition(window);
            window.finishedDrawing();
        }
    }
}