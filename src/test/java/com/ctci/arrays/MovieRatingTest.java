package com.ctci.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

public class MovieRatingTest {
  @Test
  public void testMovieRatings() {
    Set<MovieRating> set =
        new TreeSet<>(Comparator.comparing(movieRating -> movieRating.rating));
    set.add(new MovieRating(5L, 13.34f, "abc"));
    set.add(new MovieRating(6L, 11.34f, "abc"));
    set.add(new MovieRating(1L, 10.34f, "abc"));
    set.add(new MovieRating(2L, 20.34f, "abc"));
    set.add(new MovieRating(4L, 20.38f, "abc"));

    // set.stream().forEach( movieRating -> );
    set.forEach(movieRating -> System.out.println(movieRating.movieId));

    Map<Integer, Integer> mp = new HashMap<>();
    List<Integer> l = new LinkedList<>();
    mp.forEach((k, v) -> {
      if (v > 3) {
        l.add(v);
      }
    });
  }

  public int singleNumber(int[] nums) {
    int result = 0;
    int k = 3;
    int x = 0;
    int n = nums.length;
    for (int i = 0; i < 32; i++) {
      x = 1 << i;  // set i-th bit
      int sum = 0;
      //      for(int i=0;i<n;i++)
      //      if(sum % k == 1) result |= x; //set i-th bit
    }
    return result;
  }
}
