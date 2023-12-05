/*Cycle 2
 *Experiment number : 3
 *Experiment Name :File Handling using File reader and writer
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 21-11-2023*/
package cycle_2;

import java.io.*;


public class FReadWrite {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/oem/Milan/Filein.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			int cchar=0,cword=0,cline=0;
			while((s=br.readLine())!=null) {
				String[] wrd=s.split(" ");
				cword+=wrd.length;
				cline++;
				for(String sc:wrd) {
					cchar+=sc.length();
				}	
			}
			System.out.println("w:"+cword+"  c:"+cchar+"  l:"+cline);
			fr.close();
			FileWriter fw = new FileWriter("/home/oem/Milan/Filestats.txt");
			String stat = "Number of characters: "+cchar+"\nNumber of words: "+cword+"\nNumber of lines: "+cline;
			System.out.println("\nWriting stats to File....\n");
			fw.write(stat);
			System.out.println("Write complete....\n");
			fw.close();
		}
		catch (Exception e){
			System.out.println("Some error Occurred: ");
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Exiting Program...");
		}
	}
}


