import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        User valera = new User("Valera", "Kacap", 52, City.ROME);
        User galya = new User("Galya", "Perepelkina", 35, City.GENEVE);
        User jora = new User("Jora", "Pogorelec", 44, City.MADRID);

        Database database = new Database();


        try {
            database.addUserToDataBase(valera);
            database.addUserToDataBase(galya);
            database.addUserToDataBase(jora);
        }
        catch (UserAlreadyExistException e){
            e.printStackTrace();
        }

//        try {
//            database.removeUserFromDatabase(valera);
//            database.removeUserFromDatabase(galya);
//            database.removeUserFromDatabase(jora);
//        }
//        catch (UserIsNotException e){
//            e.printStackTrace();
//        }

        System.out.println(database.getUsersByCity(City.MADRID));
        System.out.println(database.getUsersByFirstName("Jora"));
        System.out.println(database.getUsersByLastName("Pogorelec"));
        System.out.println(database.getUsersByAge(1, 99));

    }
}
