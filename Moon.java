public class Moon extends Planet {

    private double angle_planet;
    private final int distance_from_planet;
    private final int x;
    private double y;
    private final double planetSpeed;

    public Moon(Sun orbit_sun, SolarSystem window, Planet parent, double speed, int diameter, String colour,
            double angle_planet, int distance_from_planet) {
        super(orbit_sun, window, parent.getSpeed(), diameter, colour,
                parent.getDistanceFromSun() + distance_from_planet, parent.getAngle());
        this.angle_planet = angle_planet;
        this.distance_from_planet = distance_from_planet;
        this.x = parent.getDistanceFromSun();
        this.y = parent.getAngle();
        this.diameter = diameter;
        this.speed = speed;
        this.planetSpeed = parent.getSpeed();

    }

    public void updatePlanetPosition(SolarSystem window) {
        angle_planet += speed;
        y += planetSpeed;
        window.drawSolarObjectAbout(x + diameter, y, diameter, colour, distance_from_planet, angle_planet);
    }

}
