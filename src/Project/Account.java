package Project;

public class Account {
    private String login;
    private String password;
    private String number;
    private int balance;

    Account create_account(String login, String password, String number){
        this.login = login;
        this.password = password;
        this.number = number;
        return new Account();
    }

    void login_account(String login, String password){
        if ((this.login == login) && (this.password == password)){
            //Login
        }
    }

}
