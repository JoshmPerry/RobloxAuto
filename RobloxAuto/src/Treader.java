


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
//abstract
public class Treader{
	
	File file;
	
	public Treader(String a){
		file= new File(a);
	}
	
	public String read() throws Exception{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String a="";
		String verify="";
		while((verify = br.readLine())!=null){
			if(verify != null){
				a+=verify+"\n";
			}
		}
		if(a.length()>=1)
		a = a.substring(0,a.length()-1);
		br.close();
		return a;
	}
	
	public String readLine(int i) throws Exception{
		String a = read();
		for(int d=1;d<i;d++){
			a = a.substring(a.indexOf("\n")+1);
		}
		a = a.substring(0,a.indexOf("\n"));
		return a;
	}
	public String readLineAfter(int i,String s) throws Exception{
		String a = readLine(i);
		return a.substring(a.indexOf(s)+1);
	}
	public String readLineAfter(int i) throws Exception{
		return readLineAfter(i,":");
	}
	public void write(String s) throws Exception{
		file.setWritable(true,true);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);
		bw.close();
		fw.close();
	}
	public void writeAdd(String s) throws Exception{
		String a = read();
		write(a+s);
	}
	public void addLine() throws Exception{
		file.setWritable(true,true);
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("");
		pw.println("");
		pw.flush();
		pw.close();
		bw.close();
		fw.close();
	}
	public void replaceLine(int i,String b) throws Exception{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String a="";
		String verify="";
		int t=1;
		while((verify = br.readLine())!=null){
			if(t==i){
				a+=b+"\n";
				t++;
			}else if(verify != null){
				a+=verify+"\n";
				t++;
			}
		}
		if(a.length()>=2)
			a = a.substring(0,a.length()-1);
		write(a);
		br.close();
	}
	
	public int numLines() throws Exception
	{
		int count = 0;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((br.readLine()!=null))
		{
			count++;
		}
		br.close();
		return count;
	}
	
	public static void main(String[] args) throws Exception{
		Treader filer = new Treader("C:/Eclipser/Email/data.txt");
		System.out.println(filer.readLine(1));
	}
	
	
	
	
	
}