public class Driver {
    public static void main(String args[]) {

        SolarSystem window = new SolarSystem(1000, 1000);
        Sun sun = new Sun(150, window, "YELLOW");
        Planet mercury = new Planet(sun, window, 3.3, 3, "GRAY", 100, 60);
        Planet venus = new Planet(sun, window, 1.1, 9, "DARK GRAY", 125, 45);
        Planet earth = new Planet(sun, window, 1, 10, "BLUE", 150, 180);
        Planet mars = new Planet(sun, window, 2, 5, "RED", 200, 270);
        Planet jupiter = new Planet(sun, window, 0.17, 56, "MAGENTA", 250, 180);
        Moon earthMoon = new Moon(sun, window, earth, 1, 5, "GRAY", 0, 20);

        while (true) {
            earth.updatePosition(window);
            sun.updatePosition(window);
            earthMoon.updatePosition(window);
            earthMoon.updatePlanetPosition(window);
            // mercury.updatePosition(window);
            // mars.updatePosition(window);
            // venus.updatePosition(window);
            // jupiter.updatePosition(window);
            window.finishedDrawing();
        }
    }
}