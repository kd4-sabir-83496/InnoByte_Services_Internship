public class User {
    private int id;
    private String username;
    private String passwordHash;
    private String salt;
    private boolean isAdmin;

    public User(int id, String username, String passwordHash, String salt, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
        this.isAdmin = isAdmin;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPasswordHash() { return passwordHash; }
    public String getSalt() { return salt; }
    public boolean isAdmin() { return isAdmin; }
}