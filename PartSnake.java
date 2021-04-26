package com.example.snakegame;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class PartSnake {

    private int x, y;
    private Bitmap bm;
    private Rect rBody, rTop, rBottom, rLeft, rRight;


    public PartSnake(Bitmap bm, int x, int y) {
        this.x = x;
        this.y = y;
        this.bm = bm;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }

    public Rect getrBody() {
        return new Rect(this.x, this.y, this.x+GameView.sizeOfMap, this.y+GameView.sizeOfMap);
    }

    public void setrBody(Rect rBody) {
        this.rBody = rBody;
    }

    public Rect getrTop() {
        return new Rect(this.x, this.y-10*Constants.SCREEN_HEIGHT/1920, this.x+GameView.sizeOfMap, this.y);

    }

    public void setrTop(Rect rTop) {
        this.rTop = rTop;
    }

    public Rect getrBottom() {
        return new Rect(this.x, this.y+GameView.sizeOfMap, this.x+GameView.sizeOfMap, this.y+GameView.sizeOfMap+10*Constants.SCREEN_HEIGHT/1920);

    }

    public void setrBottom(Rect rBottom) {
        this.rBottom = rBottom;
    }

    public Rect getrLeft() {
        return new Rect(this.x-10*Constants.SCREEN_WIDTH/1080, this.y, this.x, this.y+GameView.sizeOfMap);
    }

    public void setrLeft(Rect rLeft) {
        this.rLeft = rLeft;
    }

    public Rect getrRight() {
        return new Rect(this.x+GameView.sizeOfMap, this.y, this.x+GameView.sizeOfMap+10*Constants.SCREEN_WIDTH/1080, this.y+GameView.sizeOfMap);

    }

    public void setrRight(Rect rRight) {
        this.rRight = rRight;
    }
}
