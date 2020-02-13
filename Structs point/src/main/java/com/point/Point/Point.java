package com.point.Point;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public String PositiveOrNegative (int n){
        if (n<0){
            return "Negative";
        }
        return "Positive";
    }

    public String Quadrant (){
        String quadrant="Quadrant ";
        //x is positive
        if (PositiveOrNegative(this.x).equals("Positive")){
            //y is positive
            if (PositiveOrNegative(this.y).equals("Positive")){
                quadrant+="1";
                quadrant+="\n    |\n    | X\n----|----\n    |\n    |";
            }
            //y is negative
            else{
                quadrant+="4";
                quadrant+="\n    |\n    |\n----|----\n    | X\n    |";
            }
        }
		//x is negative
	    else{
            //y is positive
	        if (PositiveOrNegative(this.y).equals("Positive")){
                quadrant+="2";
                quadrant+="\n    |\n  X |\n----|----\n    |\n    |";
            }
            //y is negative
            else{
                quadrant+="3";
                quadrant+="\n    |\n    |\n----|----\n  X |\n    |";
                }
        }
	    return quadrant;
    }
}
