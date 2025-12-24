package org.sadan.reusinglambda;

import java.util.Arrays;
import java.util.List;

public class ReusingLambda {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
        final List<String> editors =
                Arrays.asList( "Brian" , "Jackie" , "John" , "Mike" );
        final List<String> comrades =
                Arrays.asList( "Kate" , "Ken" , "Nick" , "Paula" , "Zach" );


        //filter out names that start with a certain letter - N for all the lists
        // A: Normal solution will have the code duplicate
        // we need DRY solution
        

    }
}
