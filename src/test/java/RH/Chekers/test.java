package RH.Chekers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {



    @Test
    public void testDermo(){
        //Arrange
        Board doska = new Board(true);
        Board b1 = new Board(false);
       // assertEquals(b1.getPiece(2,5).getColour(), 'b');
        assertEquals(doska.getPiece(1, 0).getColour(), 'w');
    }


}
