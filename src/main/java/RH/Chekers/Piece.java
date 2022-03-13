package RH.Chekers;

public class Piece {

    private char colour;
    private char type = 'd';

    Piece(char c){
        colour = c;
    }
    Piece(char c, char t){
        colour = c;
        type = t;
    }
    public char getType(){
        return type;
    }

    public char getColour() {
        return colour;
    }

    public void setColour(char colour) {
        this.colour = colour;
    }

    public void setType(char type) {
        this.type = type;
    }
}
