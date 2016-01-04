/*
Nancy Li
APCS1 pd9
HW51 -- Dat Bubbly Tho
2015-12-21
*/


/*======================================
  class BubbleSort -- implements bubblesort algorithm (vanilla version)
  ======================================*/

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
    	int times = 0;
    	while (times < data.size()-2) { //goes through n-1 passes, where n is the num of elements
	    times +=1; //increments by one each time
	    for (int ctr = data.size() -2; ctr >= 0 ; ctr --) {
		Comparable x = data.get(ctr); //stores value at index ctr in data
		Comparable y = data.get(ctr+1); //stores value at index ctr+1 in data
		if (x.compareTo(y) > 0) { //if the value at ctr is greater than the one after it... 
		    data.set(ctr, y); //the positions of the two are switched
		    data.set(ctr+1, x);
		}
		//System.out.println(data);
	    }//closes for loop
	    //System.out.println(data);
    	}//closes while loop
    }//end bubbleSortV -- O(?)


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
    	int times = 0;
    	while (times < input.size()-2) { //goes through 
	    times +=1;
	    for (int ctr = input.size() -2; ctr >= 0 ; ctr --) {
		Comparable x = input.get(ctr); //stores value at index ctr in data
		Comparable y = input.get(ctr+1); //stores value at index ctr+1 in data
		if (x.compareTo(y) > 0) { 
		    //Comparable x = data.get(ctr);
		    //Comparable y = data.get(ctr +1);
		    input.set(ctr, y);
		    input.set(ctr+1, x);
		}
		//System.out.println(data);
	    }
	    //System.out.println(data);
    	}
    	return input;
    	//same as bubbleSortV except this returns input
    	
    }//end bubbleSort -- O(?)

}//end class BubbleSort
