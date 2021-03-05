package codes.laanoui.users.models;

public class User {
    private int id;
    private String nom;
    private String userName;
    private String mail;

    public User(int id, String nom, String userName, String mail) {
        this.id = id;
        this.nom = nom;
        this.userName = userName;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
