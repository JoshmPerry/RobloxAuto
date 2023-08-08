import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

public class Colorers{

List<Color> manum;
int dave;
int zx1;
int zx2;
int zy1;
int zy2;

public Colorers(int x1,int x2,int y1,int y2,ArrayList<Color> ab, int a){
zx1=x1;
zx2=x2;
zy1=y1;
zy2=y2;
manum = ab;
dave = a;
}
public Colorers(ArrayList<Color> ab){
this(50,50,100,100,ab,20);
}
public Colorers(ArrayList<Color> ab, int a){
this(50,50,100,100,ab,a);
}
public Colorers(){
this(50,50,100,100,new ArrayList<Color>(),20);
}




public boolean checkColor(int x,int y, Color a) throws Exception{
Robot r = new Robot();
return r.getPixelColor(x,y).equals(a);
}
public boolean check() throws Exception{
return compareTo(zx1,zx2,zy1,zy2);
}
public boolean check(int a) throws Exception{
return compareTo(zx1,zx2,zy1,zy2,a);
}
public boolean checkColor(int x,int y, Color a, int d) throws Exception{
Robot r = new Robot();
if((r.getPixelColor(x,y).getRed()>=a.getRed()-d&&r.getPixelColor(x,y).getRed()<=a.getRed()+d)&&(r.getPixelColor(x,y).getGreen()>=a.getGreen()-d&&r.getPixelColor(x,y).getGreen()<=a.getGreen()+d)&&(r.getPixelColor(x,y).getBlue()>=a.getBlue()-d&&r.getPixelColor(x,y).getBlue()<=a.getBlue()+d))
return true;
return false;
}
public Color getColor(int x,int y) throws Exception{
Robot r = new Robot();
return r.getPixelColor(x,y);
}

public boolean compareTo(int x1, int x2, int y1, int y2,int z) throws Exception{
int q=-1;
for(int i=y1;i<=y2;i+=dave){
for(int d=x1;d<=x2;d+=dave){
q++;
if(!checkColor(d,i,manum.get(q),z))
return false;
}}
return true;
}
public boolean compareTo(int x1,int x2,int y1,int y2) throws Exception{
return compareTo(x1,x2,y1,y2,0);
}
public void add(Color a){
manum.add(a);
}




public String toString(){
String a="";
for(int i=0;i<manum.size();i++){
a+=manum.get(i).toString();
}
return a;
}


public void update(int x1, int x2, int y1, int y2) throws Exception{
int q=-1;
for(int i=y1;i<=y2;i+=dave){
for(int d=x1;d<=x2;d+=dave){
q++;
manum.set(q,getColor(d,i));
}}}

public void update() throws Exception{
int q=-1;
for(int i=zy1;i<=zy2;i+=dave){
for(int d=zx1;d<=zx2;d+=dave){
q++;
manum.set(q,getColor(d,i));
}}}



public static void main(String[] args){

Colorers col = new Colorers(new ArrayList<>(List.of(new Color(255,255,255),new Color(255,255,255))));
System.out.println(col);
	
	
	
}}