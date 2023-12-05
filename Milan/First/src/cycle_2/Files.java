/*Cycle 2
 *Experiment number : 2
 *Experiment Name :File Handling
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 14-11-2023*/
package cycle_2;

import java.io.*;

public class Files {

	public static void main(String[] args)throws IOException {
		String pathin = new String();
		pathin = "/home/oem/Milan/Filein.txt";
		String pathout = new String();
		pathout = "/home/oem/Milan/Fileout.txt";
		try {
			FileOutputStream fout = new FileOutputStream(pathout);
			FileInputStream fin = new FileInputStream(pathin);
			
			System.out.println("\nWriting to File....\n");
			char c;
			int chr=fin.read();
			while(chr!=-1){
				c=(char)chr;
				fout.write(c);
				chr=fin.read();
			}
			System.out.println("Write complete....\n");
			
		fin.close();
		fout.close();
		}
		catch (IOException e){
			System.out.println("Some error Occurred: ");
			System.out.println(e);

		}
		finally {
			System.out.println("Exiting Program...");
		}
	}
}
