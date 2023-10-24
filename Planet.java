public class Planet {
    double speed;
    int diameter;
    private int distance_from_sun;
    String colour;
    private double angle;

    public Planet(Sun orbit_sun, SolarSystem window, double speed, int diameter,
            String colour,
            int distance_from_sun,
            double angle) {
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

    public double getSpeed() {
        return this.speed;
    }

    public int getDistanceFromSun() {
        return this.distance_from_sun;
    }

    public double getAngle() {
        return this.angle;
    }
}