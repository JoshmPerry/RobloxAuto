import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Color;

public class GlidingMoose {

        public void mouseGlide(int x1, int y1, int x2, int y2, int t, int n) throws Exception{
                Robot r = new Robot();
                double dx = (x2 - x1) / ((double) n);
                double dy = (y2 - y1) / ((double) n);
                double dt = t / ((double) n);
                for (int step = 1; step <= n; step++) {
                    Thread.sleep((int) dt);
                    r.mouseMove((int) (x1 + dx * step), (int) (y1 + dy * step));
		}}
		
		public void mouseGlide(int x1, int y1, int x2, int y2, int t) throws Exception{
			mouseGlide(x1,y1,x2,y2,t,1000);
		}
		
		public void mouseGlide(int x, int y,int t) throws Exception{
			Point a = MouseInfo.getPointerInfo().getLocation();
			mouseGlide((int)a.getX(),(int)a.getY(),x,y,t);
		}
		
		public boolean checkColor(int x,int y, Color a) throws Exception{
Robot r = new Robot();
return r.getPixelColor(x,y).equals(a);
}

public boolean checkColor(int x,int y, Color a, int d) throws Exception{
Robot r = new Robot();
if((r.getPixelColor(x,y).getRed()>a.getRed()-d&&r.getPixelColor(x,y).getRed()<a.getRed()+d)&&(r.getPixelColor(x,y).getGreen()>a.getGreen()-d&&r.getPixelColor(x,y).getGreen()<a.getGreen()+d)&&(r.getPixelColor(x,y).getBlue()>a.getBlue()-d&&r.getPixelColor(x,y).getBlue()<a.getBlue()+d))
return true;
return false;
}
		
        public static void main (String[] args) throws Exception { // program initialization
            GlidingMoose x = new GlidingMoose(); // we declare what are we are going to use
   
            x.mouseGlide(1000,250,2000); // the smaller the time value, the faster the mouse glides.

        }
	
    }