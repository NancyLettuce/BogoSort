import java.util.ArrayList;

public class MySorts {
  
  public static void main (String[] args) {
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
  	glen.add(5);
  	glen.add(12);
  	glen.add(3);  
  	
  	ArrayList coco = populate( 10, 1, 1000 );
  	
    ////////////// bubble sort////////////
    System.out.println( "BubbleSort");
    System.out.println( "ArrayList glen before sorting:\n" + glen );
  	bubbleSortV(glen);
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	bubbleSortV(coco);
  	System.out.println( "ArrayList coco after sorting:\n" + coco );
  	
  	System.out.println( "ArrayList glen1 before sorting:\n" + glen1 );
  	ArrayList glenSorted = bubbleSort( glen1 );
  	System.out.println( "sorted version of ArrayList glen1:\n" 
  			    + glenSorted );
  	System.out.println( "ArrayList glen1 after sorting:\n" + glen1 );
    	
    System.out.println( "ArrayList coco1 before sorting:\n" + coco1 );
  	ArrayList cocoSorted = bubbleSort( coco1 );
  	System.out.println( "sorted version of ArrayList coco1:\n" 
  			    + cocoSorted );
  	System.out.println( "ArrayList coco1 after sorting:\n" + coco1 );
  	System.out.println( coco1 );

  	/////////////Selection Sort////////////////
  	System.out.println( "SelectionSort");
  	System.out.println( "ArrayList glen before sorting:\n" + glen );
  	selectionSortV(glen);
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  	
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	selectionSortV(coco);
  	System.out.println( "ArrayList coco after sorting:\n" + coco );

    System.out.println( "ArrayList glen before sorting:\n" + glen );
  	ArrayList glenSorted = selectionSort( glen );
  	System.out.println( "sorted version of ArrayList glen:\n" 
  			    + glenSorted );
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  	
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	ArrayList cocoSorted = selectionSort( coco );
  	System.out.println( "sorted version of ArrayList coco:\n" 
  			    + cocoSorted );
  	System.out.println( "ArrayList coco after sorting:\n" + coco );
  	System.out.println( coco );
  	
  	///////////////////BogoSort/////////////////////////
    System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );

    System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );

  }
}
