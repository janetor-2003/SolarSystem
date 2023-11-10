public class Planet {
    double speed;
    int diameter;
    private final int distance_from_sun;
    String colour;
    private double angle;

    /**
     * Creates a planet and draws it orbiting a sun
     * @param orbit_sun sun that the planet will be orbiting
     * @param window solar system window
     * @param speed movement speed
     * @param diameter diameter of planet
     * @param colour colour
     * @param distance_from_sun distance from sun
     * @param angle rotation angle
     */
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

    /**
     * updates position of the plant as it moves
     * @param window SolarSystem
     */
    public void updatePosition(SolarSystem window) {
        angle += speed;
        window.drawSolarObjectAbout(0, 0, diameter, colour, distance_from_sun, angle);
    }

    /**
     * getter for speed variable
     * @return speed
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * getter for distance_from_sun variable
     * @return distance_from_sun
     */
    public int getDistanceFromSun() {
        return this.distance_from_sun;
    }

    /**
     * getter for angle variable
     * @return angle
     */
    public double getAngle() {
        return this.angle;
    }
}