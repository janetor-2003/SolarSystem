public class Moon extends Planet {

    private double angle_planet;
    private int distance_from_planet;

    public Moon(Sun orbit_sun, SolarSystem window, Planet parent, double speed, int diameter, String colour,
            double angle_planet, int distance_from_planet) {
        super(orbit_sun, window, parent.getSpeed(), diameter, colour,
                parent.getDistanceFromSun() + distance_from_planet, parent.getAngle());
        this.angle_planet = angle_planet;
        this.distance_from_planet = distance_from_planet;

        // window.drawSolarObject(distance_from_planet, angle_planet, diameter, colour);

    }

    public void updatePlanetPosition(SolarSystem window) {
        angle_planet += 5;
        window.drawSolarObjectAbout(10, angle_planet, 5, "GRAY", 150, 0);
    }

}
