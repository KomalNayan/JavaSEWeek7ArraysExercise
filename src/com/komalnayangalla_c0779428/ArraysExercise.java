package com.komalnayangalla_c0779428;

import java.util.*;

public class ArraysExercise {

    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Array Elements separated by space:\n");
        for(int i =0;i<10;i++)
        {
            int ele = sc.nextInt();
            array.add(ele);
        }
        System.out.println("Array : "+array);
        Collections.reverse(array);
        System.out.println("Reversed Array : "+array);
        Collections.sort(array); // Ascending order
        System.out.println("Ascending Order :"+array);
        Collections.sort(array,Collections.reverseOrder());
        System.out.println("Descending Order : "+array);
        ArrayList<Integer> evenElements = new ArrayList<Integer>();
        ArrayList<Integer> oddElements = new ArrayList<Integer>();
        Collections.sort(array); //Back in Ascending order
        int sum=0;
        for(Integer i : array)
        {
            sum += i;
            if(i%2==0)
                evenElements.add(i);
            else
                oddElements.add(i);
        }

        System.out.println("Even Numbers in entered Array : "+evenElements);
        System.out.println("Odd Numbers in entered Array : "+oddElements);
        System.out.println("Sum of All Elements : "+sum);

    }
}
