import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 3){
            System.out.println();
            System.out.println("1 to enter student details \n 2 for books details available in library");
            choice = sc.nextInt();

            if(choice == 1){
                Module1 mod1 = new Module1();
                System.out.println("Enter student's name: ");
                mod1.name = sc.nextLine();mod1.name = sc.nextLine();
                System.out.println("Enter father's name: ");
                mod1.father_name = sc.nextLine();
                System.out.println("University Id: ");
                mod1.uni_id = sc.nextLine();
                System.out.println("Enter User Id:");
                mod1.userid = sc.nextLine();
                System.out.println("Enter your semester: ");
                mod1.sem = sc.nextInt();

                mod1.getData(mod1.name, mod1.father_name, mod1.uni_id, mod1.userid, mod1.sem);
                mod1.setData();
            }

            else if(choice == 2){
                Module2 mod2 = new Module2();

                mod2.chemistry();
                mod2.physics();
                mod2.computer();
                mod2.self_development();
            }
        }
    }
}