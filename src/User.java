public abstract class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void login();

    public abstract void register();

    public abstract void logout();
}

class Admin extends User {
    private String role;

    public Admin(String username, String email, String password, String role) {
        super(username, email, password);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void login() {
        System.out.println("Admin " + getUsername() + " logged in successfully!");
    }

    @Override
    public void register() {
        System.out.println("Admin " + getUsername() + " registered successfully!");
    }

    @Override
    public void logout() {
        System.out.println("Admin " + getUsername() + " logged out successfully!");
    }
}

class Customer extends User {
    private String address;
    private String phone;

    public Customer(String username, String email, String password, String address, String phone) {
        super(username, email, password);
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void login() {
        System.out.println("Customer " + getUsername() + " logged in successfully!");
    }

    @Override
    public void register() {
        System.out.println("Customer " + getUsername() + " registered successfully!");
    }

    @Override
    public void logout() {
        System.out.println("Customer " + getUsername() + " logged out successfully!");
    }
}

class Moderator extends User {
    private String forum;

    public Moderator(String username, String email, String password, String forum) {
        super(username, email, password);
        this.forum = forum;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    @Override
    public void login() {
        System.out.println("Moderator " + getUsername() + " logged in successfully!");
    }

    @Override
    public void register() {
        System.out.println("Moderator " + getUsername() + " registered successfully!");
    }

    @Override
    public void logout() {
        System.out.println("Moderator " + getUsername() + " logged out successfully!");
    }
}

class UserMain {
    public static void main(String[] args) {
        User admin = new Admin("Duck", "admin@example.com", "password", "Admin");
        admin.login();

        User customer = new Customer("Duc", "customer@example.com", "password", "Customer", "123-456-7890");
        customer.register();

        User moderator = new Moderator("moderator", "moderator@example.com", "password", "moderator");
        moderator.logout();
    }
}
