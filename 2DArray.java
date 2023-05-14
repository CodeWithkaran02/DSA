import java.util.*;
class TwoDArray{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int nw = nextInt();
        int nc = nextInt();
        int mat [][] = new int [nw][nc];
        for(int r=0; r<mat.length; r++){
            for(int c = 0; c<mat[0].length; c++){
                mat[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[0].length; c++){
                System.out.print(mat[3][4]+" ");
            }
        }System.out.println();
    }
}