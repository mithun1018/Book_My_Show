import java.util.Scanner;
public class BookMyShowAction {
    public static void start(){
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("1.Admin\n2.User\n3.exit");
            int choice=Integer.parseInt(scan.nextLine());
            if (choice==1){
                AdminAction.checkAdmin();

            } else if (choice==2) {

            }
        }
    }

}
