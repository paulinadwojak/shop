package shop.orders.enums;

public enum OrderStatus {

    ACCEPTED("ACCEPTED"), SENT("SENT");

    private String stringValue;

    OrderStatus(String stringValue) {
        this.stringValue = stringValue;
    }

    public static OrderStatus findByStatus(String stringValue) {
        if (ACCEPTED.stringValue.equals(stringValue)) {
            return OrderStatus.ACCEPTED;
        } else if (SENT.stringValue.equals(stringValue)) {
            return OrderStatus.SENT;
        }
        return null;
    }
}
