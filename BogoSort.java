//Nancy Li
//APCS1 pd9
//HW53 -- Confused
//2015-12-24

import java.util.ArrayList;

public class BogoSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
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

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	///***************Helper Function
	//finds the min value in given ListArray 
	//if first p values are in the correct spaces, min only checks from the last index to p
    public static boolean isSorted(ArrayList<Comparable> data) {
        boolean sorted = false; //boolean sorted initialized as false
        for (int ctr = data.size() -2; ctr >= 0; ctr --) {
            //steps through data starting from the right
            Comparable x = data.get(ctr); 
            Comparable y = data.get(ctr +1);
            if (x.compareTo(y) <= 0) {
                sorted = true; //if it is sorted up to this point, boolean is true
            }
            else {
                sorted = false;//otherwise it is false...
                return false;//and the method is exited
            }
        }
        return sorted;
    }
    
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) {
    	int passes = 0; //initializes passes to 0
    	//doubles as index at which to stop comparing
    	while (isSorted(data) == false) { 
    		shuffle(data);
    		//System.out.println(data);
    	}//closes while loop
    }//end selectionSort -- O(?)



    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.

    public static ArrayList<Comparable> 
	selectionSort( ArrayList<Comparable> input ) 
    {
    	selectionSortV(input);
    	return input; //returns sorted ArrayList
    }//end selectionSort -- O(?)
    

    //main method for testing
    public static void main( String [] args ) {


	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );

/*
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
*/
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

//	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );


    }//end main

}//end class SelectionSort
