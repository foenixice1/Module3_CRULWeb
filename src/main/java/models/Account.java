package models;

public class Account {
    String id;
    String use;
    String passWord;
    String gmail;

    public Account() {
    }

    public Account(String id, String use, String passWord, String gmail) {
        this.id = id;
        this.use = use;
        this.passWord = passWord;
        this.gmail = gmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
