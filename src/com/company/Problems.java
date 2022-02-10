package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        //  System.out.println(" Key Found at Index " + findSort(arr, 0, arr.length, 10));

        print(7);
    }

    public static int findSort(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        System.out.println("Mid is " + mid);
        if (arr[mid] == key)
            return mid;
        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid]) {
                return findSort(arr, low, mid, key);
            }
            return findSort(arr, mid + 1, high, key);
        }
        if (key >= arr[mid] && key <= arr[high]) {
            return findSort(arr, mid + 1, high, key);
        }
        return findSort(arr, low, mid - 1, key);
    }

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print("" + n);
    }

    public static void even(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void powerOfTwo(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void palindrome(int[] numbers) {
        // iterate through the numbers
        for (int j : numbers) {
            int number = j;
            int reversedNumber = 0;
            int temp = 0;
            // reverse the number
            while (number > 0) {
                temp = number % 10;
                number = number / 10;
                reversedNumber = reversedNumber * 10 + temp;
            }
            if (j == reversedNumber)
                System.out.println(j + " is a palindrome number");
            else
                System.out.println(j + " is not a palindrome number");
        }
    }

    public static void evenOdd(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number + " is even number.");
            else
                System.out.println(number + " is odd number.");
        }
    }

    public static void largestSmallest(int[] numbers) {
        // assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];
        for (int number : numbers) {
            if (number > largetst)
                largetst = number;
            else if (number < smallest)
                smallest = number;
        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }

    private static void secondLarget(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        // check the condition
        for (int j : arr) {
            // this condition check for largest number
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
        System.out.println(" largest number is:" + largest);
        System.out.println("second largest number is:" + secondLargest);
    }


    private void secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = arr[0];
        // check the condition
        for (int j : arr) {
            // this condition check for largest number
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest) {
                secondSmallest = j;
            }
        }
        System.out.println(" smallest number is:" + smallest);
        System.out.println("second smallest number is:" + secondSmallest);
    }

    private static void prime(int limit) {
        System.out.println("Prime numbers between 1 and " + limit);
        // loop through the numbers one by one
        for (int i = 1; i < limit; i++) {
            boolean isPrime = true;
            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if (isPrime)
                System.out.print(i + " ");
        }
    }

    private static void fibonacci() {
        int a = 0;
        int b = 1;
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }
    }

    private static void reverse() {
        String original = "He is the one";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        System.out.println("Reverse of entered string is: " + reverse);
        // eno eht si eH
    }

    private static void wordReverse() {
        String str[] = "He is the one".split(" ");
        String finalStr = " ";
        for (int i = str.length - 1; i >= 0; i--) {
            finalStr += str[i] + " ";

        }
        System.out.println(finalStr);
        //one the is He
    }

    public static void reverse2() {
        String str = "He is the one";
        String[] arr = str.split(" ");
        String output = "";
        for (String s : arr) {
            char[] innArr = s.toCharArray();
            for (int j = innArr.length - 1; j > -1; j--) {
                output += innArr[j];
            }
            output += " ";
        }
        System.out.println("Reverse: " + output);
        //eH si eht eno
    }

    private static void unique() {
        String string = "aabbca";
        Map<Character, Integer> map = new HashMap<>();
        char[] crs = string.toCharArray();
        for (char cr : crs) {
            Integer count = map.get(cr);
            int newCount = (count == null ? 1 : count + 1);
            map.put(cr, newCount);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " occurences.");
        }
    }

    private static void unique2() {
        String string = "Naveen";
        string = string.toLowerCase();
        int[] counters = new int[26];
        for (char c : string.toCharArray()) {
            counters[c - 97]++;
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > 0) {
                System.out.println((char) (i + 97) + " has " + counters[i] + " occurrences.");
            }
        }
    }

    private static void missing() {
        // missing - or + in a series or difference series
        System.out.println();
        int[] arr = {-4, 0, 2, 4};
        int tempDiff = 0;
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            tempDiff = Math.abs(arr[i] - arr[i + 1]);
            diff = Math.abs(arr[i + 1] - arr[i + 2]);
            if (tempDiff == diff) {
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i] + diff;
            if (arr[i + 1] != temp) {
                System.err.println(arr[i] + diff);
            }
        }
    }

    // ---- Reverse the string char by char ----//
    private static void reverseChar(String[] s) {
        char[] chars = null;
        for (String value : s) {
            chars = value.toCharArray();
            for (int j = 0; j < chars.length / 2; j++) {
                char temp = chars[j];
                chars[j] = chars[chars.length - j - 1];
                chars[chars.length - j - 1] = temp;
            }
        }
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    // ---- Reverse String array ----//
    private void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (int j : a) {
            System.out.print(j);
        }
    }

    // ---- Sort integer array ----//
    private void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i);
        }
    }

    // ---- Reverse Sting----//
    private void reverseString(String str) {
        String aa = "";
        for (
                int i = str.length() - 1;
                i >= 0; i--) {
            aa = aa + str.charAt(i);
        }
        System.out.print(aa);
    }

    private void wordReverse(String str) {
        // ---- Word Reverse ----//
        String[] ss = str.split(" ");
        String ab = "";
        for (int i = ss.length - 1; i >= 0; i--) {
            ab += ss[i] + " ";
        }
        System.out.print(ab);
    }

    // ---- Print pyramid ----//
    private void printPyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printStarPyramid() {
        // ---- print star pyramid ----//
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Largest sum contiguous array
    //int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
    // System.out.println("Maximum contiguous sum is "+
    public static int maxSubArraySum(int[] a) {
        int size = a.length;
        int max_sum_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0; //4
        for (int j : a) {
            max_ending_here = max_ending_here + j;
            if (max_ending_here > max_sum_so_far) {
                max_sum_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_sum_so_far;
    }

    static int maxN = 20;
    static int maxSum = 50;
    static int minSum = 50;
    static int base = 50;
    static int[][] dp = new int[maxN][maxSum + minSum];
    static boolean[][] v = new boolean[maxN][maxSum + minSum];

    private static int findCnt(ArrayList<Integer> list, int i, int target, int n) {
        if (i == n) {
            if (target == 0)
                return 1;
            else
                return 0;
        }
        // If the state has been solved before
        // return the value of the state
        if (v[i][target + base])
            return dp[i][target + base];

        // Setting the state as solved
        v[i][target + base] = true;

        // Recurrence relation
        dp[i][target + base] =
                findCnt(list, i + 1, target, n) +
                        findCnt(list, i + 1, target - list.get(i), n);
        return dp[i][target + base];
    }

    private static int getValue(int target, Map<Integer, Integer> map) {
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key + value == target) {
                count++;
            }
        }
        return count;
    }

    static int subsetSum(ArrayList<Integer> arr, int n, int sum, int s, int count) {
        if (n == 0) {
            if (sum == s) {
                count++;
            }
            return count;
        }
        count = subsetSum(arr, n - 1, sum, s, count);
        count = subsetSum(arr, n - 1, sum, s + arr.get(n - 1), count);
        return count;
    }

    private static int minDist(int[] arr) {
        //Arrays.sort(arr);
        int minDistance = Integer.MAX_VALUE;
        int size = arr.length;
        int i, j, temp;
        for (i = 0; i < size; i++) {
            System.out.println("Test " + arr[i]);
            for (j = i + 1; j < size; j++) {
                temp = Math.abs(arr[j] - arr[i]);
                System.out.println("Abs value: " + temp);
                System.out.println("Print i " + arr[i] + " print j: " + arr[j]);
                if (temp < minDistance) {
                    minDistance = temp;
                }
            }
        }
        return minDistance;
    }

    public static int subSetSum(int[] arr, int n, int sum) {

        int[][] t = new int[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                t[i][j] = -1;
            }
        }

        if (sum == 0) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        if (t[n - 1][sum] != -1) {
            return t[n - 1][sum];
        }
        if (arr[n - 1] > sum) {
            return t[n - 1][sum] = subSetSum(arr, n - 1, sum);
        } else {
            if (subSetSum(arr, n - 1, sum) != 0 || subSetSum(arr, n - 1, sum - arr[n - 1]) != 0) {
                return t[n - 1][sum] = 1;
            } else {
                return t[n - 1][sum] = 0;
            }
        }
    }

    public static void printSubSets(int N, int curr, String res) {
        if (curr == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (i <= curr) {
                printSubSets(N, curr-i, res + i);
            }
        }
    }
}

