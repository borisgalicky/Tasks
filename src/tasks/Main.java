package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        //TASK 1
        ArrayList<Float> numberArray = new ArrayList<>();
        System.out.println("TASK 1\nEnter five numbers:");
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            Float scanned = scan.nextFloat();
            numberArray.add(scanned);
        }
        
        float overall = 0f;
        for(int i=0;i<numberArray.size();i++){
            Float number = numberArray.get(i);
            overall+=number;
        }
        
        float average = overall/numberArray.size();
        System.out.print("\nAverage is: "+average+"\n");
        for(int i=0;i<50;i++){
            System.out.print("_");
        }
        System.out.print("\n");
        
        
        
        //TASK 2
        HashSet<Integer> hashset1 = new HashSet();
        HashSet<Integer> hashset2 = new HashSet();
        
        for(int i=0;i<10;i++){
            int randNum1 = new Random().nextInt(20 + 1);
            hashset1.add(randNum1);
            int randNum2 = new Random().nextInt(20 + 1);
            hashset2.add(randNum2);
        }
        
        System.out.println("\nTASK 2\nFirst HashSet: ");
        System.out.println(hashset1);
        
        System.out.println("\nSecond HashSet: ");
        System.out.println(hashset2);
         
        System.out.println("\nCommon of the set: ");
        
        for(Integer item : hashset1){
            if(hashset2.contains(item)){
                System.out.print(item+" ");
            }
        }
        
        System.out.println("\n\nDifferent of the set: ");
        
        for(Integer item : hashset1){
            if(!hashset2.contains(item)){
                System.out.print(item+" ");
            }
        }
        for(Integer item : hashset2){
            if(!hashset1.contains(item)){
                System.out.print(item+" ");
            }
        }
        System.out.print("\n");
        for(int i=0;i<50;i++){
            System.out.print("_");
        }
                
        
    
        //TASK 3
        HashSet<Integer> hashsetOne = new HashSet();
        HashSet<Integer> hashsetTwo = new HashSet();
        
        for(int i=0;i<10;i++){
            int randNum1 = new Random().nextInt(20 + 1);
            hashsetOne.add(randNum1);
            int randNum2 = new Random().nextInt(20 + 1);
            hashsetTwo.add(randNum2);
        }
        
        System.out.println("\n\nTASK 3\nFirst HashSet: ");
        System.out.println(hashsetOne);
        
        System.out.println("\nSecond HashSet: ");
        System.out.println(hashsetTwo);
        
        hashsetOne.addAll(hashsetTwo);
        
        System.out.println("\nMerged HashSet: ");
        System.out.println(hashsetOne);
        
        for(int i=0;i<50;i++){
            System.out.print("_");
        }
        System.out.print("\n");
        
        
        
        //TASK 4
        System.out.println("\nWelcome to the SOVY bank.\nPress number to choose action:");
        System.out.println("1 - Insertion");
        System.out.println("2 - Withdrawal");
        System.out.println("3 - Display account state");
        System.out.println("4 - Exit");
    }
}
