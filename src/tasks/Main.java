package tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
        System.out.println("SCHOOLTASK 1 (24.09.2018): Enter five numbers:");
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
        System.out.println("Count is: "+count);
        
        System.out.println("SCHOOLTASK 2 (24.09.2018): Enter three products:");
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
        HashMap <String, Integer> cities = new HashMap<String, Integer>();
        cities.put("Martin",54000);
        cities.put("Trenčín",55000);
        cities.put("Poprad",51000);
        System.out.println(cities.get("Martin"));
        
        TreeMap <String , Integer> bigCities = new TreeMap <String, Integer>();
        bigCities.put("Praha",1600000);
        bigCities.put("Bratislava",445000);
        bigCities.put("Košice",239000);
        
        System.out.println("SCHOOLTASK 1 (25.09.2018): Enter five books:");
        ArrayList <Books> booksArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            
            System.out.println("\nEnter name of book "+(i+1)+": ");
            String name = sc.nextLine();
            
            System.out.println("\nEnter author of book "+(i+1)+": ");
            String author = sc.nextLine();
        
            System.out.println("\nEnter prize of book "+(i+1)+": ");
            Float prize = sc.nextFloat();
        
            System.out.println("\nHas book "+(i+1)+" discount? (true or false)");
            boolean discount = sc.nextBoolean();
            sc.nextLine();
        
            switch(i){
                case 0: Books b0 = new Books(name,author,prize,discount); booksArray.add(b0); break;
                case 1: Books b1 = new Books(name,author,prize,discount); booksArray.add(b1); break;
                case 2: Books b2 = new Books(name,author,prize,discount); booksArray.add(b2); break;
                case 3: Books b3 = new Books(name,author,prize,discount); booksArray.add(b3); break;
                case 4: Books b4 = new Books(name,author,prize,discount); booksArray.add(b4); break;
            }
        }
        for(int i=0;i<5;i++){
            String title = booksArray.get(i).getTitle();
            String author = booksArray.get(i).getAuthor();
            Float prize = booksArray.get(i).getPrize();
            boolean discount = booksArray.get(i).isDiscount();
            System.out.println(title+", "+author+", "+prize+"€, "+discount);
        }
        
        System.out.println("SCHOOLTASK 2 (25.09.2018): Enter one number:");
        ArrayList <Integer> tipArray = new ArrayList<>();
        for(int i=0;i<10;i++){
            int randNum = new Random().nextInt(100 + 1);
            tipArray.add(randNum);
        }
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<0){
            num = num * (-1);
        }
        
        System.out.println("Drawn numbers: "+tipArray);
        
        if(tipArray.contains(num)){
            System.out.println("Match! You guessed number "+num+"!");
        } else {
            System.out.println("Sorry! You didn't guessed number!");
        }
        
        List<Integer> list = new ArrayList();
        for (int i=0;i<10;i++) {
            list.add(new Random().nextInt (50 + 1));
        }
        System.out.println(list);

        List<Integer> result = list.stream()
                .sorted()
                .filter(n -> n % 3 == 0)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        int i = list.stream().filter(n -> n % 2 == 0).count();
        Optional<Integer> j = list.stream().findFirst();

        IntSummaryStatistics stat =list.stream()
                .mapToInt((x)->x)
                .summaryStatistics();
        
        
        System.out.println("Max: "+stat.getMax()+"  Min: "+stat.getMin());
        System.out.println("Average: "+stat.getAverage());
               
        //Simply prints numbers form 0 to 4
        IntStream.range(0, 5).forEach(System.out::print);
        
        System.out.println("\nResult: "+result);
        System.out.println("Count of even (divadable by two): " + i);
        System.out.println("First number: " + j);
        
        mainOperations add = (x,y) -> (int) (x+y);
        mainOperations subtract = (x,y) -> (int) (x-y);
        mainOperations multiple = (x,y) -> (int) (x*y);
        mainOperations divide = (x,y) -> (int) (x/y);
        otherOperations secondPow = (x) -> (int) (Math.pow(x,2));
        otherOperations thirdPow  = (x) -> (int) (Math.pow(x,3));
        otherOperations absoluteValue = (x) -> {
            if(x<0){
                return (int) (x*(-1));
            }
            else{
                return (int) (x);
            }
        };
        
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiple\n4 - Divide\n"
                + "5 - Second Power\n6 - Third Power\n7 - Absolute Value");
        System.out.println("Enter operation: ");
        Scanner s = new Scanner(System.in);
        int operations = s.nextInt();
        
        switch(operations){
            case 1: 
                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter first number:");
                int num1_1 = s1.nextInt();
                System.out.println("Enter second number:");
                int num2_1 = s1.nextInt();
                System.out.println("Result: "+add.calculate(num1_1,num2_1));
                break;
                
            case 2: 
                Scanner s2 = new Scanner(System.in);
                System.out.println("Enter first number:");
                int num1_2 = s2.nextInt();
                System.out.println("Enter second number:");
                int num2_2 = s2.nextInt();
                System.out.println("Result: "+subtract.calculate(num1_2,num2_2));
                break;
                
            case 3: 
                Scanner s3 = new Scanner(System.in);
                System.out.println("Enter first number:");
                int num1_3 = s3.nextInt();
                System.out.println("Enter second number:");
                int num2_3 = s3.nextInt();
                System.out.println("Result: "+multiple.calculate(num1_3,num2_3));
                break;
              
            case 4: 
                Scanner s4 = new Scanner(System.in);
                System.out.println("Enter first number:");
                int num1_4 = s4.nextInt();
                System.out.println("Enter second number:");
                int num2_4 = s4.nextInt();
                System.out.println("Result: "+divide.calculate(num1_4,num2_4));
                break;
                
            case 5: 
                Scanner s5 = new Scanner(System.in);
                System.out.println("Enter number:");
                int num5 = s5.nextInt();
                System.out.println("Result: "+secondPow.calculate(num5));
                break;
                
            case 6: 
                Scanner s6 = new Scanner(System.in);
                System.out.println("Enter number:");
                int num6 = s6.nextInt();
                System.out.println("Result: "+thirdPow.calculate(num6));
                break;
                
            case 7:
                Scanner s7 = new Scanner(System.in);
                System.out.println("Enter number:");
                int num7 = s7.nextInt();
                System.out.println("Result: "+absoluteValue.calculate(num7));
                break;
                
            default: System.out.println("No such operation!"); 
            break;
        }
        Scanner s = new Scanner (System.in);
        double num = s.nextDouble();
        volumeInterface volumeCircle = (x) -> (double) ((Math.PI)*(Math.pow(x, 2)));
        System.out.println(volumeCircle.calculate(num));
        
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();
        isEvenInterafce isEven = (x) -> {
            if(x%2 == 0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(isEven.findOut(num));
        
        List<Integer> numbers = Arrays.asList(10,2,8,12,15);
        List<Integer> n = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.toList());
                System.out.println(n);
                
        List<String> letters = new ArrayList<>();
        System.out.println("Enter five letters:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String letter = sc.nextLine();
            letters.add(letter);
        }
        //letters = Arrays.asList("a","b","c","d","e");
        List<String> list = letters.stream()
                .map(t->t.toUpperCase())
                .collect(Collectors.toList());
                System.out.println(list);*/
        
        List<String> letters1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        List<String> letters2 = new ArrayList<String>(Arrays.asList("d", "e", "f"));
        System.out.println("First: "+letters1);
        System.out.println("Second: "+letters2);
        letters1.addAll(letters2);
        System.out.println("Joined: "+letters1);
        
    }
}
interface isEvenInterafce{
    boolean findOut (int x);
}

interface volumeInterface{
    double calculate (double x);
}

interface otherOperations{
    int calculate (int x);
}

interface mainOperations{
    int calculate (int x, int y);
}