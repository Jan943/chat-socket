package pl.sopata.chat;

public class ChatMessage {

    private String value;
    private String user;
    private String userColor;

    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public ChatMessage(String value) {
        this.value = value;
    }

    public ChatMessage(){
    }
}
