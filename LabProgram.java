package LabProject;
import java.util.Arrays;
import java.util.Scanner;
public class LabProgram {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in); 
      int nums[];
      int count;
      int i = 0;
    
      // Step 0: Input array values
      count = scnr.nextInt();
      nums = new int[count];
      for (i = 0; i < count; ++i) {
         nums[i] = scnr.nextInt();
      }
      
      // Step 1: Find and output minimum and maximum values
      /* Type your code here */ 
      int Max = nums[0];
      int Min = nums[0];
      for (i = 0;i<count;i++) {
         Max = (Max < nums[i]) ? nums[i]:Max;
         Min = (Min > nums[i]) ? nums[i]:Min;
      }
      System.out.printf("Minimum: %d\nMaximum: %d\n",Min,Max);
      
      // Step 2: Calculate and output mean
      /* Type your code here */
      float mean = 0;
      for (i = 0;i<count;i++) {
         mean += nums[i];
      }
      mean /= count;
      System.out.printf("Mean: %.1f\n", mean);
   
      // Step 3: Check if palindrome
      /* Type your code here */
      int numsF[] = new int[count];
      for (i = 0; i<count ;i++) {
         numsF[i] = nums[count - i -1];
      }
      if (Arrays.equals(nums , numsF)){
            System.out.println("Palindrome: true");
         } else {
            System.out.println("Palindrome: false");
         }
      
      
      // Sort array elements in ascending order
      Arrays.sort(nums);
      
      // Step 4: Find and output median
      /* Type your code here */
      double medianTMP;
      if (count%2 == 0){
         medianTMP = ((nums[(count/2)-1] + nums[(count/2)]) / 2.0 );
         System.out.println("Median: " + medianTMP);
      } else {
         medianTMP = nums[(count/2)-1];
         System.out.println("Median: " + medianTMP);
      }
   
      // Step 5: Find and output mode
      /* Type your code here */
      int maxValue = 0;
      int maxCount = 0;
      int j;

      for (i = 0; i < count; ++i) {
         int occurance = 0;
         for (j = 0; j < count; ++j) {
            if (nums[j] == nums[i])
            ++occurance;
         } if (count > maxCount) {
            maxCount = occurance;
            maxValue = nums[i];
         }
      }
      System.out.println("Mode: " + maxValue);
      scnr.close();
   }
}