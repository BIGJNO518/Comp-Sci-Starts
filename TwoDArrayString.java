/** Jason P Nowak
 * CSC 252
 * 10/21/2016
 * This program takes in user input as Strings and store the input in a 2D
 * Array. We then will take the results from the array and print the to an output file
 * called "AlbumNames.txt"
 */
import java.util.*;
import java.io.*;
public class TwoDArrayString 
{

	public static String albumName = null;
	public static String artistName = null;
	//When I put PW object here I get an error regarding "explicit constructor needed"
	//I wasn't getting into all of that right now //But this would be awesome to flesh out
	//Maybe have user input file name
	public static void main(String[] args) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("AlbumNames.txt");
		Scanner kbd = new Scanner(System.in);
		
		String[][] greatAlbums = new String[5][2];
		
		for (int row = 0; row < 5; row ++)//it took me awhile to get the logic for this
											//but I get it now
		{
			for (int column = 0; column < 1; column ++)
			{
				
				System.out.println ("What is the Album Name? ");
				albumName = kbd.nextLine();
				greatAlbums[row][0] = albumName;
				outputFile.print(greatAlbums[row][0] + "   ");// set up spacing so artist
														     //and album name are on the same line 
			}
			for (int column = 1; column < 2; column ++)
			{
				System.out.println ("What is the Artist Name? ");
				albumName = kbd.nextLine();
				greatAlbums[row][1] = albumName;
				outputFile.println(greatAlbums[row][1] + "\n");//creates a space between
															//album and artist entries
			}
		}
	
	
	outputFile.close();
	
	}
	
	
	
}
	

		


