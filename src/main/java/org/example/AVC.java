package org.example;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AVC {
    interface SomeInterface {
        String generate();
        List newList = new ArrayList();


        default void print(String value) {
            System.out.println(Optional.ofNullable(value).orElseGet(new Supplier<String>() {
                @Override
                public String get() {
                    return SomeInterface.this.generate();
                }
            }));
        }
    }
    public static int changeValue(int x) {
        x = x + 1;
        return x;
    }

    public static int diagonalSum(int[][] mat) {

        int sum =0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
            if(i != mat.length -1 -i){
                sum += mat[i][mat.length -1 -i];
            }
        }
        return sum;

    }

    static int binarySearchJohn(int [] arr, int k){
        int lo = 0, hi = arr.length -1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (k == arr[mid]) {
                return mid;
            }
            if (k < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

        }




    public static void main(String[] args) {
//        ((SomeInterface) () -> {
//            return "Hello!";
//        }).print(null);
//
//        Person person1 = new Person();
//
//        person1.setFirstName("Jane");
//        person1.setLastName("ABC");
//        person1.setAge(35);
//        Person person2 = new Person(person1);
//        System.out.println(person2);// creates a new Person object with the same values as person1
//
//
//        int y = 5;
//        changeValue(y);
//        System.out.println(y); // Output: 5
//        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
//
//        System.out.println(binarySearchJohn(new int[]{1,2,3,4,5},5));
//
//        int x = 8;
//        System.out.println( y&x);
//        moveZeroes(new int[]{0,2,3,0,12,0});
//
//        List<String> names = new ArrayList<>(Arrays.asList("ann","jane","valery"));
//        System.out.println(removeAndSort((ArrayList<String>) names));
//
//        int[] arr = {5,4,3,2,1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        Student a = new Student();
//        a.setName("John");
//        a.setAge(25);
//        Student b = a;
//        b.setName("John");
//        b.setAge(25);
//        System.out.println(a.equals(b));
//        System.out.println(a.hashCode());
//        List list = new ArrayList();


        String str = "C, C++, Java, C#, Kotlin";
        char ch = ',';

        int index = -1;
        while ((index = str.indexOf(ch, index + 1)) != -1) {
            System.out.println(index);


    }}


    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }
    public static List<String> removeAndSort(ArrayList<String> names){
        List<String> result = new ArrayList<>();
        for (String name: names){
            String newName = name.substring(1);
            result.add(newName);
        }
        Collections.sort(result);
        return result;
    }

    public static <T> Map<T, Long> occurencesMap (ArrayList<T> list){
        return list.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
    }

   public static String reverseString(String s){
        char[] sArray = s.toCharArray();
        for (int left = 0, right = sArray.length-1; left<right; left ++, right --){
            char tmp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = tmp;
        }
        return new String(sArray);
   }

    public static Boolean isPalindrome(String s){
        char[] sArray = s.toCharArray();
        for (int i = 0; i<sArray.length/2; i++){
            if (sArray[i] !=sArray[sArray.length-1-i] )
                return false;
        }
        return true;
    }

    public static void bubbleSort(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            for (int j = 0; j<arr.length - i-1; j++){
                if (arr[j]> arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static int[] reverseArray(int[] inputArray){
        for(int left =0, right = inputArray.length-1; left<right; left ++, right --){
            int tmp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = tmp;
        }
        return inputArray;
    }
}
