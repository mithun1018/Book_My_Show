import java.util.ArrayList;
import java.util.Scanner;

public class UserAction {
    public static User checkUser(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Admin name: ");
        String name = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        ArrayList<User> userAvailable = BookMyShow.getUserArrayList();//to store all the account object
        for (User individualUser : userAvailable)
        {
            if (individualUser.getUsername().equals(name) && individualUser.getPassword().equals(password)) //check the given admin id and pass
            {
                return individualUser;//returns admin object
            } else if (individualUser.getUsername().equals(name)&&!individualUser.getPassword().equals(password)) {
                return new User(null,null);
            }
        }
        return null;
    }
}
