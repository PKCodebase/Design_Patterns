package builder;

public class Builder {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("123")
                .setUserName("John")
                .setEmail("john@example.com")
                .build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("124")
                .setUserName("rahul")
                .setEmail("rahul@example.com")
                .build();
        System.out.println(user2);
    }
}
