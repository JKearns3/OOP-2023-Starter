package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Follow> follows = new ArrayList<Follow>();


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

	String[] words;

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // array of lines from the txt file
		String allWords = " "; //a long string of all the words from the txt file
		for(String line: lines) //add all the lines to words
		{
			allWords += " " + line;
	
		}

		allWords = allWords.toLowerCase();
		allWords = allWords.replaceAll("[^\\w\\s]", "");
		
		words = split(allWords, ' '); //split long string of words into an array of words	

		// add all words to a Word class -> need word and follows

		// get the following count for all words
		// go through each word and note the word after it
			// check through all the words after for that combination
			// do findWord in case the following count was done already??

		
		for(int i = 0; i < words.length - 1; i++)
		{
			int count = 0;
			String s = words[i];
			String next = words[i+1];

			for(int j = i+1; j < words.length-1; j++)
			{
				if(words[j] == s && words[j+1] == next)
				{
					count ++;
				}
			}

			Follow f = new Follow(next, count);
			follows.add(f);
			System.out.println(f);

		}
		
	
		
	}

	public boolean findWord(String str)
	{
		for(String w : words)
		{
			if( w == str) //if the word is found return true
			{
				return true;
			}
		}
		return false; //word not found return false
	}

	public void printModel()
	{
		System.out.println();
	}

}
