import java.util.ArrayList;
import java.util.Scanner;

public class AdminAction {
    public static Admin checkAdmin(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Admin name: ");
        String name = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        ArrayList<Admin> adminsAvailable = BookMyShow.getAdminArrayList();//to store all the account object
        for (Admin individualAdmin : adminsAvailable)
        {
                if (individualAdmin.getadminName().equals(name) && individualAdmin.getPassword().equals(password)) //check the given admin id and pass
                {
                    return individualAdmin;//returns admin object
                } else if (individualAdmin.getadminName().equals(name)&&!individualAdmin.getPassword().equals(password)) {
                    return new Admin(null,null);
                }
        }
        return null;
    }
}
