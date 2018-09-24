package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        /*//TASK 1
        ArrayList<Float> numberArray = new ArrayList<>();
        System.out.println("TASK 1\nEnter five numbers:\n");
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
        
        
        
        
        ArrayList<Float> numberArray = new ArrayList<>();
        System.out.println("SCHOOLTASK 1: Enter five numbers:");
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            Float scanned = scan.nextFloat();
            numberArray.add(scanned);
        }
        float count = 0f;
        for(int i=0;i<numberArray.size();i++){
            Float number = numberArray.get(i);
            count+=number;
        }
        System.out.println("Count is: "+count);*/
        
        System.out.println("SCHOOLTASK 2: Enter three products:");
        ArrayList <Stuff> stuffArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            
            System.out.println("\nEnter name of product "+(i+1)+": ");
            String name = sc.next();
        
            System.out.println("\nEnter prize of product "+(i+1)+": ");
            Float prize = sc.nextFloat();
        
            System.out.println("\nEnter origin country of product "+(i+1)+": ");
            String country = sc.next();
        
            System.out.println("\nHas product "+(i+1)+" discount? (true or false)");
            boolean discount = sc.nextBoolean();
            switch(i){
                case 0: Stuff s0 = new Stuff(name,prize,country,discount); stuffArray.add(s0); break;
                case 1: Stuff s1 = new Stuff(name,prize,country,discount); stuffArray.add(s1); break;
                case 2: Stuff s2 = new Stuff(name,prize,country,discount); stuffArray.add(s2); break;
            }
        }
        for(int i=0;i<3;i++){
            String name = stuffArray.get(i).getName();
            Float prize = stuffArray.get(i).getPrize();
            String country = stuffArray.get(i).getCountry();
            boolean discount = stuffArray.get(i).isDiscount();
            System.out.println(name+", "+prize+"€, "+country+", "+discount);
        }
    }
}
