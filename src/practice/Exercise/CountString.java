package practice.Exercise;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder builder= new StringBuilder();
        int i=1;
        int j=1;
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(i-1)){
                j++;
            }else{
                builder.append(String.valueOf(j));
                builder.append(str.charAt(i-1));
                j=1;
            }
            i++;
        }
        if(j>=1){
            builder.append(String.valueOf(j));
            builder.append(str.charAt(str.length()-1));
        }
        System.out.print(builder.toString());
    }
}

/*
Input - AAAABBBCCCD
Output - 4A3B3C1D
*/