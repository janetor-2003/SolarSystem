public class Sun {
    private int diameter;
    private String colour;

    public Sun(int diameter, SolarSystem window, String colour) {
        this.diameter = diameter;
        this.colour = colour;
        window.drawSolarObject(0, 0, diameter, colour);
    }

    public void updatePosition(SolarSystem window) {
        window.drawSolarObject(0, 0, diameter, colour);
    }

}