public class Planet {
    private int speed;
    private int diameter;
    private int distance_from_sun;
    private String colour;
    private int angle;

    public Planet(Sun orbit_sun, SolarSystem window, int speed, int diameter, String colour, int distance_from_sun,
            int angle) {
        this.diameter = diameter;
        this.speed = speed;
        this.colour = colour;
        this.distance_from_sun = distance_from_sun;
        this.angle = angle;
        window.drawSolarObjectAbout(0, 0, diameter, colour, distance_from_sun, angle);

    }

    public void updatePosition(SolarSystem window) {
        angle += speed;
        window.drawSolarObjectAbout(0, 0, diameter, colour, distance_from_sun, angle);
    }
}