import java.util.*;
class Patten17
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in)
        {
            int n= sc.nextInt();
            int nsp =0,nst=n;
            for(int i=1;i<n;i++)
            {
                //space
                for(int j=1; j<=nst; j++)
                {
                    System.out.print("/t");
                }
                for(int j=1;j<=nst; j++)
                {
                    if(i>n/2+1 && i<n && j>1 && j<nst);
                    {
                        System.out.print("/t");

                    }
                }
            }
            //star
            System.out.println();

            if(i<=b/2){
                nsp++;
                nst -=2;

            }
            else {
                nsp--;
                nst+=2;
            }
        }
            
        }
    }
}