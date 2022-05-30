public class UserAlreadyExistException extends Exception {
    String text;

    public UserAlreadyExistException(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "UserAlreadyExistException" + '\n'
                + text;
    }
}
