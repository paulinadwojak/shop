package shop.users;

public enum UserRole {

    USER("USER"), ADMIN("ADMIN");

    private String stringValue;

    UserRole(String stringValue) {
        this.stringValue = stringValue;
    }
}
