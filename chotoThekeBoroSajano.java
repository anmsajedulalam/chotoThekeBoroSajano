import java.util.*;
public class chotoThekeBoroSajano
{
  public static void main(String[]args)
  {
    int max=0;
    Scanner k=new Scanner(System.in);
    int a[]=new int[10];
    for(int t=0;t<a.length;t++)
    {
     a[t]=k.nextInt();
     for(int c=0;c<a.length-1;c++)
     { 
      if(a[c]>a[c+1])
      {
        max=a[c];
        a[c]=a[c+1];
        a[c+1]=max;
      }
     }
    }
    
    
    
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
  }

