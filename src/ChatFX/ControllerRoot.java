package ChatFX;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class ControllerRoot {
    @FXML
    MenuItem btnClose;

    @FXML
    MenuItem btnClearHistory;

    @FXML
    MenuItem btnAbout;

    //Обработка нажатия кнопки меню "Выход"
    public void close(){
        System.exit(0);
    }

    //Обработка нажатия кнопки меню "Очистить историю сообщений"
    public void clearHistoryRoot(){
        Main.baseController.clearHistory();
    }
}
