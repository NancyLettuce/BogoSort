/*
Nancy Li
APCS1 pd9
HW52 -- Selection
2015-12-22
*/

/*======================================
  class SelectionSort -- implements SelectionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class SelectionSort {

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
    public static Comparable min (ArrayList<Comparable> input, int index) {
	Comparable min = input.get(input.size()-1);
	//initializes min as the last value on the right
	for (int ctr = input.size() -1; ctr >= index ; ctr --) {
	    //steps through from last index to 
	    Comparable x = input.get(ctr); //stores value at index ctr in data
	    if (x.compareTo(min) < 0) {
		//if x is less than min
		min = x; // the new min is set to x
	    }
	}
	//System.out.println(min);
	return min; //returns the mininum value
    }
    
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) {
    	int passes = 0; //initializes passes to 0
    	//doubles as index at which to stop comparing
    	while (passes < data.size() - 1) { 
	    //while passes are n-1
	    Comparable x = data.get(passes); //stores original value
	    Comparable mini = min(data, passes); //stores min value
	    if (x.compareTo(mini) != 0) { //if x is not the min...
		data.set(data.indexOf(mini), x); //swap the two
		data.set(passes, mini);	
	    }
	    //System.out.println(data);
	    passes ++; //increments passes by 1 with each loop
    		
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

}//end class SelectionSort
