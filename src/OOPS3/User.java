package OOPS3;

public class User {
    String username;

    String email;

    String phone_no;

    User(){
        System.out.println("Creating User!");
    }

    User(String username, String email){
        this.username =  username;
        this.email = email;
        this.phone_no = "73973";
    }

    String getUsername()
    {
        return this.username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}
