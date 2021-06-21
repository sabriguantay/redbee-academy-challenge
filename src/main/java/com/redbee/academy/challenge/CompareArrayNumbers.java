package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */


  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> max = new ArrayList<Integer>();
    Integer max_a = Collections.max(a);
    Integer max_b = Collections.max(b);
    
    max.add(max_a);
    max.add(max_b);

    for (Integer i : max){
      Integer suma = 0;
      suma += i;
      System.out.println(suma);
    }
    return max;
  }
}
