public class Driver {
    public static void main(String args[]) {

        SolarSystem window = new SolarSystem(1000, 1000);
        Sun sun = new Sun(150, window, "YELLOW");
        Planet mercury = new Planet(sun, window, 1.1, 3, "GRAY", 200, 60);
        Planet venus = new Planet(sun, window, 0.6, 9, "DARK GRAY", 250, 45);
        Planet earth = new Planet(sun, window, 0.5, 10, "BLUE", 300, 180);
        Planet mars = new Planet(sun, window, 0.5, 5, "RED", 400, 270);
        Planet jupiter = new Planet(sun, window, 0.17, 56, "MAGENTA", 500, 180);
        Moon earthMoon = new Moon(sun, window, earth, 1, 5, "GRAY", 0, 5);

        while (true) {
            earth.updatePosition(window);
            sun.updatePosition(window);
            //earthMoon.updatePosition(window);
            earthMoon.updatePlanetPosition(window);
             mercury.updatePosition(window);
             mars.updatePosition(window);
             venus.updatePosition(window);
             jupiter.updatePosition(window);
            window.finishedDrawing();
        }
    }
}