package com.sau.dti.method;

public class MyClassMet02 {
    public static void showWow() {
        System.out.println("Wow wow wow");
    }
    public static void sumNumber(int num1,int num2) {
        System.out.println(num1+num2);
    }
    public static String showSawasdee (){
        return "Sawasdee Jaaa...";
    }
    public static double calPowNumber(int a, int b){
        return Math.pow(a,b);
    }





    public static void main(String[] args) {
        showWow();
        showWow();
        sumNumber(10,20);
        sumNumber(100,200);

        System.out.println(showSawasdee());
        String data = showSawasdee();
        System.out.println(data +"NinnIN");

        System.out.println(calPowNumber(10,2));
        double result = calPowNumber(5,3);
        System.out.println("5^3 = "+result);


    }
}
