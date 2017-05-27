package DimondShape;

public class DimondShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i += 2) {
		      for (int j = 0; j < 5 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 0; j < i; j++)
		      { 
			      if(j == 1 || j == 3) {
			    	  System.out.print("b");
			      }
			      else {
			    	  if(i == 5 && j == 2)
			    		  System.out.print("c");
			    	
			    	  else
			    	  System.out.print("a");
			    	  }
		      }
		      System.out.print("\n");
		    }

		    for (int i = 3; i > 0; i -= 2) {
		      for (int j = 0; j < 5 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 0; j < i; j++)
		    	  if(j == 1)
		        System.out.print("b");
		      
		    	  else
		    		  System.out.print("a");

		      System.out.print("\n");
		    }

	}

}
