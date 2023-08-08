import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.PointerInfo;
import java.awt.MouseInfo;
import java.awt.Color;

public class AutoType{



public void type(String a,boolean b) throws Exception{
Robot r = new Robot();
if(!b){
type(a);
}else {
int lett = 48;
for(int i=0;i<a.length();i++){
lett = a.toUpperCase().charAt(i);
System.out.println(a.substring(i,i+1)+" "+lett);
if(lett==a.charAt(i)){
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(lett);
r.keyRelease(lett);
r.keyRelease(KeyEvent.VK_SHIFT);
} else{
r.keyPress(lett);
r.keyRelease(lett);
}
}}}

public void type(String a) throws Exception{
Robot r = new Robot();
int lett = 48;
for(int i=0;i<a.length();i++){
lett = a.toUpperCase().charAt(i);
if(lett==a.charAt(i)){
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(lett);
r.keyRelease(lett);
r.keyRelease(KeyEvent.VK_SHIFT);
} else{
r.keyPress(lett);
r.keyRelease(lett);
}
}
}

public void typeRaw(String a) throws Exception{
Robot r = new Robot();
for(int i=0;i<a.length();i++){
r.keyPress(a.charAt(i));
r.keyRelease(a.charAt(i));
}
}

public void enter() throws Exception{
Robot r = new Robot();
r.keyPress(10);
r.keyRelease(10);
}

public void escape() throws Exception{
Robot r = new Robot();
r.keyPress(27);
r.keyRelease(27);
}

public void F8() throws Exception{
Robot r = new Robot();
r.keyPress(119);
r.keyRelease(119);
}

public void click() throws Exception{
Robot r = new Robot();
r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
}

public void doe(String abc,int t) throws Exception{
	Robot r = new Robot();
	for(int i=0;i<abc.length();i++){
		r.keyPress(abc.toUpperCase().charAt(i));
		Thread.sleep(t);
		r.keyRelease(abc.toUpperCase().charAt(i));
	}
}

public void doe(String abc) throws Exception{
	doe(abc,1000);
}

public void does(String abc,int t) throws Exception{
	Robot r = new Robot();
	for(int i=0;i<abc.length();i++){
		r.keyPress(abc.toUpperCase().charAt(i));
	}
	Thread.sleep(t);
	for(int i = 0;i<abc.length();i++){
		r.keyRelease(abc.toUpperCase().charAt(i));
	}
}

public void does(String abc) throws Exception{
	does(abc,1000);
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

public void panic(String ab,int q,int x,int y, Color col) throws Exception{
for(int i=0;i<q/11;i++){
if(checkColor(x,y,col))
return;
doe(ab,9);
}}

public static void main(String[] args) throws Exception{
Robot r = new Robot();
r.keyPress(80);
Thread.sleep(200);
r.keyPress(80);
Thread.sleep(10000);	
AutoType a = new AutoType();
Thread.sleep(3000);
while(true) {
Thread.sleep(10000);
a.doe("ws");
}

}

}