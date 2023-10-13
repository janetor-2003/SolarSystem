public class Sun 
{
    private int diameter;
    private String colour;
    
    public Sun(int diameter, SolarSystem window, String colour)
    {
        window.drawSolarObject(0, 0, diameter, colour);
    }
}