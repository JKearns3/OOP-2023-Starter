package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // array of lines from the txt file
		String words = " "; //a long string of all the words from the txt file
		for(String line: lines) //add all the lines to words
		{
			words += " " + line;
		}

		words = words.toLowerCase(); 
		words = words.replaceAll("[^\\w\\s]", "");
		
		String[] allWords = split(words, ' ');		
		
	}
}
