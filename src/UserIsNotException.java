public class UserIsNotException extends Exception{

    String text;

    public UserIsNotException(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "UserIsNotException" + '\n'
                + text;
    }
}
