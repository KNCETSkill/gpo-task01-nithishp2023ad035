import java.util.Scanner;
import java.io.*;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        if(volume>350){
            printf("Large");
        } else if(volume>=200 && volume<=350){
            printf("Medium");       
        } else if(volume<200){
            printf("Small");
                }
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

