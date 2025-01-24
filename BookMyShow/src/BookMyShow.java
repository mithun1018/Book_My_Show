import java.util.ArrayList;

public class BookMyShow {
    private static ArrayList<User> userArrayList=new ArrayList<>();
    private static ArrayList<Admin> adminArrayList=new ArrayList<>();
    public static ArrayList<User> getUserArrayList(){
        return userArrayList;
    }
    public static ArrayList<Admin> getAdminArrayList(){
        return adminArrayList;
    }

}
