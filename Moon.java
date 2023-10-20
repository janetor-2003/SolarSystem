public class Moon extends Planet {

    private double angle_planet;
    private int distance_from_planet;
    private int x;
    private double y = 180;

    public Moon(Sun orbit_sun, SolarSystem window, Planet parent, double speed, int diameter, String colour,
            double angle_planet, int distance_from_planet) {
        super(orbit_sun, window, parent.getSpeed(), diameter, colour,
                parent.getDistanceFromSun() + distance_from_planet, parent.getAngle());
        this.angle_planet = angle_planet;
        this.distance_from_planet = distance_from_planet;
        this.x = parent.getDistanceFromSun();
        //this.y = parent.getAngle();

        //window.drawSolarObjectAbout(x+distance_from_planet,100,50,colour,100,100);

    }

    public void updatePlanetPosition(SolarSystem window) {
        angle_planet += 3;
        y += 0.5;
        window.drawSolarObjectAbout(x+distance_from_planet,y,5,"GRAY",25,angle_planet);
    }

}
