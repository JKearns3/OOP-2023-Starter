package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word, ArrayList<Follow> follows)
    {
        this.word = word;
        this.follows = follows;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }


    @Override
    public String toString()
    {
        String answer;
        answer = word + ": ";
        for(Follow f : follows)
        {
            answer += f.toString() + " ";
        } 
        return answer;
    }

    public boolean findFollow(String str)
    {
        for(Follow f : follows)
        {
            if(f.word == str)
            {
                return true;
            }
        }
        return false;
    }

}
