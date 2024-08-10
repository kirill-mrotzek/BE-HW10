package com.telran.org.Homework;

public class Homework8 {
    static String str1 = "Hello";
    static String str2 = "Java";

    static String str3 = "mama papa";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2).reverse();

        String result = sb.toString();
        System.out.println(result);

        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '?'){
                arr[i] = 'e';
            }
        }
        String result2 = new String(arr);
        System.out.println(result2);

        StringBuilder sb2 = new StringBuilder(str3);
        String key = "mama";
        String key2 = "papa";
        
            if(key.equals("mama") && key2.equals("papa")){
                System.out.println(key2 + " " + key);

            }
        }
    }


