import java .util.Scanner;
public class MatrixDemo
{
    public static void main(String args[])
    {
        int row,col,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows");
        row=s.nextInt();
        System.out.println("enter the number of cols");
        col=s.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("enter the elements of matrix");
        for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    mat[i][j]=s.nextInt();
                }
            }    
            System.out.println("matrix");
            System.out.println("_____");
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println();
        
    }
}
}