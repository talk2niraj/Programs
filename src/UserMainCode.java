 
class UserMainCode
{
    public int route(int input1, int input2, int input3[][])
    {
        int i, j;
        int totalDistance[][]=new int[input1+1][input2+1];
 
        totalDistance[0][0] = input3[0][0];
 
        for (i = 1; i <= input1; i++)
            totalDistance[i][0] = totalDistance[i-1][0] + input3[i][0];
 
        for (j = 1; j <= input2; j++)
            totalDistance[0][j] = totalDistance[0][j-1] + input3[0][j];
 
        for (i = 1; i <= input1; i++)
            for (j = 1; j <= input2; j++)
                totalDistance[i][j] = smallestNumber(totalDistance[i-1][j-1], 
                               totalDistance[i-1][j],
                               totalDistance[i][j-1]) + input3[i][j];
 
        return totalDistance[input1][input2];
    }
 
    public static void main(String args[])
    {
        int input3[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println("shorted distance to reach (2,2) = " +
                                         new UserMainCode().route(2,2,input3));
    }
    
    private static int smallestNumber(int number1, int number2, int number3)
    {
        if (number1 < number2)
            return (number1 < number3)? number1 : number3;
        else
            return (number2 < number3)? number2 : number3;
    }
}