package All_Interview_code;

public class SortArray {

	public static void main(String[] args) {
     int x[]= {3,3,45,6,7};
   int y=  x.length;
   int temp=0;
     for(int i=0;i<y;i++)
     {
    	 for(int j=i+1;j<y;j++)
    	 {
    		 if(x[i]>x[j])
    		 {
    			  temp=x[i];
    			 x[i]=x[j];
    			 x[j]=temp;
    		 }
    		
    	 }
    	 System.out.println(x[i]);
     }
	}

}
