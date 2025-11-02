public class username {
    public static void main(String[] args) {
        String email = "ankurarna8@gmail.com";
        String[] parts = email.split("@");
        String username = parts[0];
        System.out.println("Username: " + username);
    }
}
