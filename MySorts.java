import java.util.ArrayList;

public class MySorts {
     //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
  
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
  	BubbleSort.bubbleSortV(glen);
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	BubbleSort.bubbleSortV(coco);
  	System.out.println( "ArrayList coco after sorting:\n" + coco );
  	
  	System.out.println( "ArrayList glen1 before sorting:\n" + glen );
  	ArrayList glenSorted = BubbleSort.bubbleSort( glen );
  	System.out.println( "sorted version of ArrayList glen1:\n" 
  			    + glenSorted );
  	System.out.println( "ArrayList glen1 after sorting:\n" + glen );
    	
	System.out.println( "ArrayList coco1 before sorting:\n" + coco );
  	ArrayList cocoSorted = BubbleSort.bubbleSort( coco );
  	System.out.println( "sorted version of ArrayList coco1:\n" 
  			    + cocoSorted );
  	System.out.println( "ArrayList coco1 after sorting:\n" + coco );
  	System.out.println( coco );
        System.out.println();

		    
  	/////////////Selection Sort////////////////
  	System.out.println( "SelectionSort");
  	System.out.println( "ArrayList glen before sorting:\n" + glen );
  	SelectionSort.selectionSortV(glen);
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  	
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	SelectionSort.selectionSortV(coco);
  	System.out.println( "ArrayList coco after sorting:\n" + coco );

	System.out.println( "ArrayList glen before sorting:\n" + glen );
        glenSorted = SelectionSort.selectionSort( glen );
  	System.out.println( "sorted version of ArrayList glen:\n" 
  			    + glenSorted );
  	System.out.println( "ArrayList glen after sorting:\n" + glen );
  	
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
        cocoSorted = SelectionSort.selectionSort( coco );
  	System.out.println( "sorted version of ArrayList coco:\n" 
  			    + cocoSorted );
  	System.out.println( "ArrayList coco after sorting:\n" + coco );
  	System.out.println( coco );
	System.out.println();
	
  	///////////////////BogoSort/////////////////////////
	System.out.println( "ArrayList glen before sorting:\n" + glen );
        BogoSort.selectionSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	System.out.println( "ArrayList coco before sorting:\n" + coco );
	BogoSort.selectionSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );

	System.out.println( "ArrayList glen before sorting:\n" + glen );
        glenSorted = BogoSort.selectionSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	  
	System.out.println( "ArrayList coco before sorting:\n" + coco );
        cocoSorted = BogoSort.selectionSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );
	System.out.println();
    }
}
