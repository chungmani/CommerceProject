package commerce;

public class Customer {
    private String userName;
    private String userMail;
    private String userGrade;

    public Customer(String userName, String userMail, String userGrade) {
        this.userName = userName;
        this.userMail = userMail;
        this.userGrade = userGrade;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserGrade() {
        return userGrade;
    }
}
