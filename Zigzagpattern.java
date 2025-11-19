public class Zigzagpat {
    public static void Zigzag(int n,String s)
    {
        char[][] arr=new char[n][s.length()];
        int r=0,c=0;
        boolean down=true;
        for(int i=0;i<s.length();i++)
        {
            arr[r][c]=s.charAt(i);
            if(down)
            {
                r++;
                if(r==n-1)
                {
                    r=n-1;            //downmovement
                    down=false;
                    c++;
                }
                
                }
                else
                {
                    r--;
                    c++;
                    if(r==-1)
                    {                //upmovement

                        down=true;
                        r=1;

                    }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(arr[i][j]==0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String input="thisisazigzag";
        int k=4;
        Zigzag(k, input);
    }
}
