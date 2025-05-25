public class Main {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";
        String salt = PasswordUtil.generateSalt();
        String hashed = PasswordUtil.hashPassword(password, salt);

        User user = new User(0, username, hashed, salt, true);
        UserDAO.addUser(user);

        System.out.println("User registered successfully.");
    }
}