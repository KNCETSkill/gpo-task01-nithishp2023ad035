import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        if(volume > 350){
            printf("Large");
        }else if(200 < volume < 350){
            printf("Medium");
        }else(volume < 200){
            printf("Small");
                }
        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

