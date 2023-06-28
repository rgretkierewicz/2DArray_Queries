import java.util.Scanner;

public class queryBoardSmallNums {
    /* INSTRUCTIONS

    SetRow i x: change all values in the cells on row “i” to value “x”.
    SetCol j x: change all values in the cells on column “j” to value “x”.
    QueryRow i: output the sum of values on row “i”.
    QueryCol j: output the sum of values on column “j”.

    The board’s dimensions are 5 * 3.
    “i” = integers from 0 – 4.
    “j” = integers from 0 – 2
    “x” is an integer from 0 – 31.
     */


    //5 rows, 3 columns
    int[][] myIntArray = {
            {0,0,0}, //row 0
            {1,1,1}, //row 1
            {2,2,2}, //row 2
            {3,3,3},
            {4,4,4}
    };

    //i = Row number to change all values of (Stays the same! Example - Row 5)
    //x = value to be used (Setting all columns to value 63)
    //c = current column we are setting (From column 0 to 255, all are in Row 5)
    public void SetRow(int i, int x) {
        for (int c = 0; c < 3; c++) {
            myIntArray[i][c] = x;
        }
    }

    //SetCol: Change all values in the cells on column “j” to value “x”.
    public void SetCol(int j, int x) {
        for (int r = 0; r < 5; r++) {
            myIntArray[r][j] = x;
        }

    }

    //QueryRow: Output the sum of values on row “i”.
    public int QueryRow(int i) {
        int rowSum = 0;

        for (int c = 0; c < 3; c++) {
            rowSum += myIntArray[i][c];
        }
        return rowSum;
    }

    //QueryCol: Output the sum of values on column “j”.
    public int QueryCol(int j) {
        int colSum = 0;

        for (int r = 0; r < 5; r++) {
            colSum += myIntArray[r][j];
        }
        return colSum;
    }



    public static void main(String[] args) {
        queryBoardSmallNums qbObj = new queryBoardSmallNums();

        /*
        Test Input
        SetCol 32 20
        SetRow 15 7
        SetRow 16 31
        QueryCol 32
        SetCol 2 14
        QueryRow 10
         */

        System.out.println("Please enter one of the following commands: SetCol, SetRow, QueryCol, QueryRow.");

        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        int j;
        int x;
        int i;

        switch (command) {
            case "SetCol":
                // SetCol j x: change all values in the cells on column “j” to value “x”.
                j = scanner.nextInt();
                x = scanner.nextInt();

                qbObj.SetCol(j, x);

                System.out.println("The column " + j + " has been updated. Column values are now set to " + x);

                break;

            case "SetRow":
                //SetRow i x: change all values in the cells on row “i” to value “x”.
                i = scanner.nextInt();
                x = scanner.nextInt();

                qbObj.SetRow(i, x);

                System.out.println("The row " + i+ " has been updated. Row values are now set to " + x);

                break;

            case "QueryCol":
                //QueryCol j: output the sum of values on column “j”.
                j = scanner.nextInt();

                System.out.println("The sum of the values on column " + j + " = " + qbObj.QueryCol(j));
                break;

            case "QueryRow":
                ///QueryRow i: output the sum of values on row “i”.
                i = scanner.nextInt();

                System.out.println("The sum of the values on row " + i + " = " + qbObj.QueryRow(i));

                break;

            default:
                System.out.println("Invalid command. Please enter one of the following: SetCol, SetRow, QueryCol, QueryRow.");

        }

    }


}
