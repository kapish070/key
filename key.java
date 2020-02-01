import java.util.*;
public class key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      while(a>0)
      {
    	  int d=0;
    	  int size=sc.nextInt();
    	  int b[]=new int[size];
    	  for(int i=0;i<size;i++)
    	  {
    		  b[i]=sc.nextInt();
    	  }
    	  int c=sc.nextInt();
    	  for(int i=0;i<size;i++)
    	  {
    		  if(b[i]==c)
    		  {
    			  d=i;
    			  break;
    		  }
    		  else
    		  {
    			  d=-1;
    		  }
    	  }
    	  System.out.print(d);
    	  a--;
      }
	}

}
