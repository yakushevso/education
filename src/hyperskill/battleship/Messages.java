package hyperskill.battleship;

public enum Messages {
    ENTER_SHIP("Enter the coordinates of the %s (%d cells):"),
    ERROR_LENGTH("Error! Wrong length of the %s! Try again:"),
    ERROR_LOCATION("Error! Wrong ship location! Try again:"),
    ERROR_CLOSE("Error! You placed it too close to another one. Try again:");

    private final String message;

    Messages (String message) {
        this.message = message;
    }
}