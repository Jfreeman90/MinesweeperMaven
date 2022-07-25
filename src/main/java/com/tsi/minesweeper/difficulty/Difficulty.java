package com.tsi.minesweeper.difficulty;

public class Difficulty {
    //Attributes
    String diff;
    int size;
    int bombs;
    int flags;

    //Constructor
    public Difficulty(){
        //empty on creation
    }

    public void setDifficulty(String difficulty){
        this.diff=difficulty;
    }

    public String getDifficulty() {
        return this.diff;
    }

    public void setSize(){
        if (this.diff.equals("EASY")){
            this.size =10;
        } else if (this.diff.equals("MEDIUM")){
            this.size=16;
        } else {
            this.size=22;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void setBombs(){
        if (this.diff.equals("EASY")){
            this.bombs=10;
        } else if (this.diff.equals("MEDIUM")){
            this.bombs=40;
        } else {
            this.bombs=100;
        }
    }

    public int getBombs() {
        return this.bombs;
    }

    public void setFlags(){
        if (this.diff.equals("EASY")){
            this.flags=10;
        } else if (this.diff.equals("MEDIUM")){
            this.flags=40;
        } else {
            this.flags=100;
        }
    }

    public int getFlags() {
        return this.flags;
    }


}
