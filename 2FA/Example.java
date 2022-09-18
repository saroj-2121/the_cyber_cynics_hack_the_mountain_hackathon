import com.authy.AuthyApiClient;
import com.authy.api.*;

public class Example {
    // Your API key from twilio.com/console/authy/applications
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String API_KEY = "your_api_key";

    public static void main(String[] args) {
        AuthyApiClient client = new AuthyApiClient(API_KEY);

        Users users = client.getUsers();
        User user = users.createUser(
                "new_user@example.com",
                "405-342-5699",
                "57");

        if (user.isOk()) {
            System.out.println(user.getId());
        } else {
            System.out.println(user.getError());
        }
    }
}