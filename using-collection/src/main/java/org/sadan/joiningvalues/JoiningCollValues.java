package org.sadan.joiningvalues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningCollValues {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Brian", "Nates", "Neals", "Raju", "Sara", "Scott");

        //Old Join
      /*  StringBuilder sb = new StringBuilder();
        for(String str : friends){
            sb.append(str +",");
        }
        System.out.println(sb.toString());*/

       /* String collect = friends.stream()
                .map(name -> name)
                .collect(Collectors.joining(", "));
        System.out.println(collect);*/

        //String join function

        String joined = String.join(", ", friends);
        System.out.println(joined);


    }
}
