import lombok.AllArgsConstructor;
import lombok.Value;

public class RegistrationDto {
    @Value
    @AllArgsConstructor
    public static class RegistrationDto {
        String login;
        String password;
        String status;
    }
}
