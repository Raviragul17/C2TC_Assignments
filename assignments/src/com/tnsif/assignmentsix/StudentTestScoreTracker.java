package com.tnsif.assignmentsix;
import java.util.*;

public class StudentTestScoreTracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        
        // Create an array to store test scores
        int[] scores = new int[n];
        
        // Read n elements into the array
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // Create an ArrayList and add array elements to it
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }
        
        // Display the ArrayList elements
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        sc.close();
    }
}