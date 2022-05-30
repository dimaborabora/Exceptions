import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Database {
    List<User> userDataBase = new ArrayList<>();

    public void addUserToDataBase(User user) throws UserAlreadyExistException {
        if (userDataBase.contains(user)) {
            throw new UserAlreadyExistException("User already exists in this database.");
        } else {
            userDataBase.add(user);
            System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " added to database.");
        }

    }

    public void removeUserFromDatabase(User user) throws UserIsNotException {
        if (!userDataBase.contains(user)){
            throw new UserIsNotException("This user is not exist in this database.");
        }
        else {
            userDataBase.remove(user);
            System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " removed from database.");
        }
    }

    public List<User> getUsersByCity (City city){
        List <User> users = new ArrayList<>();
        for (User user : userDataBase){
            if (user.getCity().equals(city)){
                users.add(user);
            }
    }
        return users;
    }

    public List<User> getUsersByFirstName (String firstname){
        List <User> users = new ArrayList<>();
        for (User user : userDataBase){
            if (user.getFirstName().toLowerCase(Locale.ROOT).contains(firstname.toLowerCase(Locale.ROOT))){
                users.add(user);
            }
        }
        return users;
    }

    public List<User> getUsersByLastName (String lastname){
        List <User> users = new ArrayList<>();
        for (User user : userDataBase){
            if (user.getLastName().toLowerCase(Locale.ROOT).contains(lastname.toLowerCase(Locale.ROOT))){
                users.add(user);
            }
        }
        return users;
    }

    public List<User> getUsersByAge (int startAge, int endAge){
        List <User> users = new ArrayList<>();
        for (User user : userDataBase){
            if (user.getAge() <= endAge && user.getAge() >= startAge){
                users.add(user);
            }
        }
        return users;
    }


}
