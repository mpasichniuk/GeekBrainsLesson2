package ru.geekbrains;

public class Lesson2 {
    public static void main(String[] args) {
        checkSum(12, 5);
        negativeOrPositive(0);
        isNegative(2);
        printString( "abcd",5 );
        Year(1523);
    }
    public static boolean checkSum(int a, int b){
        int sum = a + b;
        if(sum>10&&sum<=20){
            return true;
        } else {
            return false;
        }
    }
    public static void negativeOrPositive(int num){
        if(num >=0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }

    }
    public static boolean isNegative(int number){
        if(number<0){
            return true;
        }else{
            return false;
        }
    }
    public static void printString(String alphabet, int times){
        for(int i =0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.println(alphabet);
            }
        }
        System.out.println();

    }

    public static boolean Year(int x) {
        if((!(x % 4 == 0) || ((x % 100 == 0) && !(x % 400 == 0)))){
            return false;
        }else{
            return true;
        }

    }
}



