package RH.Chekers;

public class Board {

    private boolean playerSwitchSides;

    private Piece[][] board;
    public static String[][] defaultBoard = new String[][] {
            {"", "2d", "", "2d", "", "2d", "", "2d"},
            {"2d", "", "2d", "", "2d", "", "2d", ""},
            {"", "2d", "", "2d", "", "2d", "", "2d"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"1d", "", "1d", "", "1d", "", "1d", ""},
            {"", "1d", "", "1d", "", "1d", "", "1d"},
            {"1d", "", "1d", "", "1d", "", "1d", ""}
    };

    public Board(boolean b) {
        playerSwitchSides = b;
        convert2DArrayToBoard(defaultBoard, 8, 8 );
    }

    public Board(String[][] b, boolean pSS){

        playerSwitchSides = pSS;
        convert2DArrayToBoard(b, b[0].length, b.length);
    }

    private void convert2DArrayToBoard(String[][] b, int sizeX, int sizeY){
        board = new Piece[sizeX][sizeY];
        int pSS = playerSwitchSides? 1 : 0;

        for (int x = 0; x < sizeX; x++){
            for (int y = 0; y < sizeY; y++){
                if(!b[x][y].equals("")){
                    int player = pSS + Character.getNumericValue(b[x][y].charAt(0)) % 2;
                    char playerChar = player==0? 'b': 'w';
                    board[x][y] = new Piece(playerChar, b[x][y].charAt(1));
                }
            }
        }
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    public static void main(String[] args) {
        Board b = new Board(true);
    }
}
