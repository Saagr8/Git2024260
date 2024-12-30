import java.util.Scanner;

public class asimpleoutput {
    public static void main(String[] args) {
        System.out.println("Sagar-2024260");

        Scanner sc= new Scanner(System.in); // TO GET THE INPUT FROM THE USER


        String user_input;
        boolean user_input_condition; /* WE HAVE SAME BOOLEAN CONDITION, SO RATHER
                                     THAN WRITING THE CONDITION AGAIN AND AGAIN  WE CAN CALL IT */

        do {
            System.out.print("Enter your name: ");
            user_input= sc.nextLine(); // .NEXTLINE METHOD IS USED TO READ THE WHOLE LINE

            user_input_condition=!user_input.matches("[a-zA-Z]+"); // BOOLEAN CONDITION, TO MEET THE REQUIREMENT OF WHATEVER THE USER TYPE


            if (user_input_condition){ // WHEN THIS CONDITION IS TRUE IT WILL PRINT THE ERROR MESSAGE
                System.out.println("You entered error! only letters!!");

            }
        } while (user_input_condition); // TO RUN THE LOOP AGAIN , MEANS USER CAN TYPE AGAIN OR A CHANCE TO CORRECT HIS MISTAKE
        System.out.println("You entered: "+ user_input);

        String changed_name = user_input.repeat(2); // I HAVE USED REPEAT STRING METHOD TO DO SOME CHANGES  :)
        System.out.println("Changed Name: "  +  changed_name);


    }
}
