package qa.automation;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        int [] number = new int[20];
        for (int i =0; i<20; i++) {
            number [i] = i*5;
            System.out.println("For element " + i+ " from array number is: " + number [i]);
        }

        System.out.println("------------------------------------------------");

        int [] num = {5,7,3,2,8};
        int sum = 0;
        int sum1 = 0;
        for(int numbervv : num) {
            System.out.println(numbervv);
        }
        for(int i=0;i < num.length; i++) {
            sum = sum + num[i];
            sum1 = sum / num.length;
        }
        System.out.println("The average of all numbers in an array : " + sum1);

        System.out.println("------------------------------------------------");

        int number1 []={7,2,3,4,6};
        int sum2 = 0;
        int sum3 = 0;
        for(int numberv : number1) {
            System.out.println(numberv);
        }
        System.out.println("The total sum of odd numbers from the array is:");
        for(int i=0;i<number1.length;i++){
            if(number1[i]%2!=0){
                sum2 = sum2 + number1[i];
            }

        }
        System.out.println(sum2);

        System.out.println("The total sum of even numbers from the array is:");
        for(int i=0;i<number1.length;i++){
            if(number1[i]%2==0){
                sum3 = sum3 + number1[i];
            }
        }
        System.out.println(sum3);

        System.out.println("------------------------------------------------");
        //writes the text in the console
        System.out.println("Enter N:");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        PrintReverseOrder(N);

        System.out.println("\n------------------------------------------------");

        //writes the text in the console
        System.out.println("Enter N:");

        int length = scanner.nextInt();

            for (int i = 1; i < length; i++)
            {
                if (i % (3 * 7) != 0) System.out.println(i);
            }

        System.out.println("------------------------------------------------");

        int x[]=new int[15];
        x[0]=0;
        x[1]=1;
        for(int i=2;i<x.length;i++)
        {
            x[i]=x[i-1]+x[i-2];
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);

        }
        System.out.println("------------------------------------------------");
    }
    static void PrintReverseOrder(int N)
    {

        for (int i = N; i > 0; i--)
            System.out.print( +i + " ");
    }
}
