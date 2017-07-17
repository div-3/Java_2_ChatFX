package ChatFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea taHistory;

    @FXML
    TextField tfMessage;

    @FXML
    Button btnSend;

    //Метод отправки сообщения в окно истории сообщений чата
    public void sendMessage(){
        taHistory.appendText(tfMessage.getText() + "\n");
        tfMessage.clear();
        tfMessage.requestFocus();
    }

    //Метод очистки окна истории сообщений чата
    public void clearHistory(){
        taHistory.setText("");
    }

}
