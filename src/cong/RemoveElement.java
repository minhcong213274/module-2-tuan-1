package cong;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] value = {10,4,6,7,1,2,0,5};
        int[] newVAlue = {13,42,36,8,41,5,3,4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input index need remove:");
        int index = scanner.nextInt();
        for (int i = 0;i<value.length;i++){
            if(i==index){
                value[i]=newVAlue[i];
                System.out.println(Arrays.toString(value));
            }
        }
    }
}
