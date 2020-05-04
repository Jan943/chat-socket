package pl.sopata.chat;

public class ChatMessage {
    private String value;

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
