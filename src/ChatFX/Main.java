package ChatFX;
/**
 * Java. Level 2. Lesson 4. Part 2 (JavaFX).
 *
 * @author Ivan Dudorov
 *
 * Задание.
 * Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
 * Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
 * Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
 * При «отсылке» сообщение перекидывается из нижнего поля в центральное.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ChatFX");

        initRootLayout();
        showPersonOverview();
    }

    /**
     * Инициализирует корневой макет.
     */
    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("RootView.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Показывает в корневом макете основное окно чата.
     */
    public void showPersonOverview() {
        try {
            // Загружаем основное окно чата.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("BaseView.fxml"));
            VBox personOverview = (VBox) loader.load();

            // Помещаем основной чат в главную форму приложения.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}