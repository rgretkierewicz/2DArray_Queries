public class queryBoard {
    /* INSTRUCTIONS

    SetRow i x: change all values in the cells on row “i” to value “x”.
    SetCol j x: change all values in the cells on column “j” to value “x”.
    QueryRow i: output the sum of values on row “i”.
    QueryCol j: output the sum of values on column “j”.

    The board’s dimensions are 256 * 256. “i” and “j” are integers from 0 – 255.
            “x” is an integer from 0 – 31.
     */

    String[][] my2DArray = {
            {"a","b","c"},
            {"a1","b1","c1"},
            {"a2","b2","c2"}
    };

    char myCharArray[][]; //How to declare (Option 1)
    char[][] myCharArray2; //How to declare (Option 2)

    int[][] myIntArray = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
    };

    //i = Row number to change all values of (Stays the same! Example - Row 5)
    //x = value to be used (Setting all columns to value 63)
    //c = current column we are setting (From column 0 to 255, all are in Row 5)
    public void SetRow(int i, int x) {
        for (int c = 0; c < 256; c++) {
            myIntArray[i][c] = x;
        }
    }

    //SetCol: Change all values in the cells on column “j” to value “x”.
    public void SetCol(int j, int x) {
        for (int r = 0; r < 256; r++) {
            myIntArray[r][j] = x;
        }

    }

    //QueryRow: Output the sum of values on row “i”.
    public int QueryRow(int i) {
        int rowSum = 0;

        for (int c = 0; c< 256; c++) {
            rowSum += myIntArray[i][c];
        }
        return rowSum;
    }


    //QueryCol: Output the sum of values on column “j”.
    public int QueryCol(int j) {
        int colSum = 0;

        for (int r = 0; r < 256; r++) {
            colSum += myIntArray[r][j];
        }
        return colSum;
    }






}
