package Model;

public class Client {
    private String name;
    private String email;
    private String tel;
    private boolean active = false;

    public Client(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public boolean isActive() {
        return active;
    }

    public void activating() {
        this.active = true;
    }
}
