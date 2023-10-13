public class Driver
{
    public static void main (String args[]){

        int angle = 0;

        SolarSystem window = new SolarSystem(500,500);

    while(true)
        {
            window.drawSolarObject(0,0,100,"YELLOW"); //sun
            window.drawSolarObjectAbout(0,180, 10, "BLUE",200,angle);
            angle += 1;
            window.finishedDrawing();
        }
    }
}