package com.tsi.minesweeper.difficulty;

public class Difficulty {
    //Attributes
    String difficulty;
    int size;
    int bombs;
    int flags;

    //Constructor
    public Difficulty(){

    }

    public void setDifficulty(String difficulty){
        this.difficulty=difficulty;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setSize(){
        if (this.difficulty.equals("EASY")){
            this.size =10;
        } else if (this.difficulty.equals("MEDIUM")){
            this.size=16;
        } else {
            this.size=22;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void setBombs(){
        if (this.difficulty.equals("EASY")){
            this.bombs=10;
        } else if (this.difficulty.equals("MEDIUM")){
            this.bombs=40;
        } else {
            this.bombs=100;
        }
    }

    public int getBombs() {
        return this.bombs;
    }

    public void setFlags(){
        if (this.difficulty.equals("EASY")){
            this.flags=10;
        } else if (this.difficulty.equals("MEDIUM")){
            this.flags=40;
        } else {
            this.flags=100;
        }
    }

    public int getFlags() {
        return this.flags;
    }


}
