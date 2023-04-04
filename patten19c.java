import java.util.*;

public class patten19c {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1; r<=n; r++)
        {
            for(int c = 1; c<=1; c++)
            {
              if(r==1)
              {
                    if(c==n||(c>=1&& c<=n/2+1))
                      {
                         System.out.print("*\t");
                    }
                    else {
                         System.out.print("\t");
                         }

                    else if(r>1 && r<=n/2 +1 )
                    {
                    if(c==n/2 || r<n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else 
                    {
                        System.out.print("\t");
                    }
                }
                else if(r==n/2+1)
                {
                    System.out.print("*\t");
                }
                else if(r==n/2 +1 && r<n)
                {
                    if(c==n/2+1 || c==1)
                    {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                   
                }
                else if (r==n)
                {
                    if(c==1|| (c>=n/2+1 &&c<=n))
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
            r++;
        }
    }
