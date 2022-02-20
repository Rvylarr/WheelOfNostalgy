package wheel_of_nostalgy;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ImageView wheel_bottom_iv;
    @FXML
    private ImageView wheel_iv;
    @FXML
    private ImageView pointer_iv;
    @FXML
    private ImageView nosignal_iv;
    @FXML
    private MediaView mv;
    @FXML
    private ImageView tv_iv;
    @FXML
    private Label point_1;
    @FXML
    private Label point_2;
    @FXML
    private StackPane wheel_bar_1;
    @FXML
    private Label point_3;
    @FXML
    private Label point_4;
    @FXML
    private StackPane wheel_bar_2;
    @FXML
    private Label point_5;
    @FXML
    private Label point_6;
    @FXML
    private StackPane wheel_bar_3;
    @FXML
    private Label point_7;
    @FXML
    private Label point_8;
    @FXML
    private StackPane wheel_bar_4;
    @FXML
    private Label point_9;
    @FXML
    private Label point_10;
    @FXML
    private StackPane wheel_bar_5;
    @FXML
    private Label point_11;
    @FXML
    private Label point_12;
    @FXML
    private StackPane wheel_bar_6;
    @FXML
    private Label point_13;
    @FXML
    private Label point_14;
    @FXML
    private StackPane wheel_bar_7;
    @FXML
    private Label point_15;
    @FXML
    private Label point_16;
    @FXML
    private StackPane wheel_bar_8;
    @FXML
    private ImageView background_iv;
    @FXML
    private Group wheel_points;

    private Media cartoon1;
    private Media cartoon2;
    private Media cartoon3;
    private Media cartoon4;
    private Media cartoon5;
    private Media cartoon6;
    private Media cartoon7;
    private Media cartoon8;
    private Media cartoon9;
    private Media cartoon10;
    private Media cartoon11;
    private Media cartoon12;
    private Media cartoon13;
    private MediaPlayer mp;

    @FXML
    private Button spin_button;
    @FXML
    private Button info_button;
    @FXML
    private Rectangle info_bar;
    @FXML
    private Button info_dis_button;
    @FXML
    private  Label info_text;
    @FXML
    private Label info_header;
    @FXML
    private Label info_version;
    @FXML
    private Label info_creator;


    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File pointer = new File("src/wheel_of_nostalgy/Images/pointer.png");
        Image pointer_image = new Image(pointer.toURI().toString());
        pointer_iv.setImage(pointer_image);
        pointer_iv.setRotate(135);

        File wheel = new File("src/wheel_of_nostalgy/Images/Wheel.png");
        Image wheel_image = new Image(wheel.toURI().toString());
        wheel_iv.setImage(wheel_image);

        File wheel_bottom = new File("src/wheel_of_nostalgy/Images/wheel_b.png");
        Image wheel_bottom_image = new Image(wheel_bottom.toURI().toString());
        wheel_bottom_iv.setImage(wheel_bottom_image);

        File nosignal = new File("src/wheel_of_nostalgy/Images/nosignal.png");
        Image nosignal_image = new Image(nosignal.toURI().toString());
        nosignal_iv.setImage(nosignal_image);
        nosignal_iv.setRotate(0.5);

        File tv = new File("src/wheel_of_nostalgy/Images/TV.png");
        Image tv_image = new Image(tv.toURI().toString());
        tv_iv.setImage(tv_image);

        File background = new File("src/wheel_of_nostalgy/Images/Background.jpg");
        Image background_image = new Image(background .toURI().toString());
        background_iv.setImage(background_image);

        ArrayList<String> series = new ArrayList<String>();
        series.add("Приключения Джеки Чана");
        series.add("Алладин");
        series.add("Бэтмен");
        series.add("Вуди Вудпекер");
        series.add("Грендайзер");
        series.add("Дональд Дак");
        series.add("Русалочка");
        series.add("Команда Гуффи");
        series.add("Охотники за приведениями");
        series.add("Люди в чёрном");
        series.add("Люди икс");
        series.add("Мишки гамми");
        series.add("Невероятный Халк");
        series.add("Приключения Винни Пуха");
        series.add("Ох уж эти детки");
        series.add("Папай моряк");
        series.add("Плуто");
        series.add("Сейлор Мун");
        series.add("Сильвестр и Твити");
        series.add("Скуби Ду");
        series.add("Спиди-гонщик");
        series.add("Тарзан");
        series.add("Том и Джерри");
        series.add("Утиные истории");
        series.add("Флинстоуны");
        series.add("Человек-паук");
        series.add("Черепашки ниндзя");
        series.add("Чёрный Плащ");
        series.add("Чилли Вилли");
        series.add("Крутые бобры");
        series.add("Веселые мелодии");
        series.add("Озорные анимашки");
        series.add("Гуффи");
        series.add("Утиные истории");
        series.add("Микки Маус");
        series.add("Чип и Дейл");
        series.add("Чаудер");
        series.add("Евангелион");
        series.add("Эй, Арнольд!");
        series.add("Приключения Мумми троллей");
        series.add("Чудеса на виражах");
        series.add("Пинки и Брейн");
        series.add("Мыши-байкеры");
        series.add("Ю-ги-о");
        series.add("Кураж - трусливый пёс");
        series.add("Приключения мишек Гамми");
        series.add("Чокнутый");
        series.add("Джони Браво");

        point_1.setRotate(180);
        wheel_bar_1.getChildren().addAll(point_1, point_2);
        wheel_bar_1.setAlignment(point_1, Pos.CENTER_LEFT);
        wheel_bar_1.setAlignment(point_2,Pos.CENTER_RIGHT);

        point_3.setRotate(180);
        wheel_bar_2.getChildren().addAll(point_3, point_4);
        wheel_bar_2.setAlignment(point_3, Pos.CENTER_LEFT);
        wheel_bar_2.setAlignment(point_4,Pos.CENTER_RIGHT);
        wheel_bar_2.setRotate(22.5);

        point_5.setRotate(180);
        wheel_bar_3.getChildren().addAll(point_5, point_6);
        wheel_bar_3.setAlignment(point_5, Pos.CENTER_LEFT);
        wheel_bar_3.setAlignment(point_6,Pos.CENTER_RIGHT);
        wheel_bar_3.setRotate(45);

        point_7.setRotate(180);
        wheel_bar_4.getChildren().addAll(point_7, point_8);
        wheel_bar_4.setAlignment(point_7, Pos.CENTER_LEFT);
        wheel_bar_4.setAlignment(point_8,Pos.CENTER_RIGHT);
        wheel_bar_4.setRotate(67.5);

        point_9.setRotate(180);
        wheel_bar_5.getChildren().addAll(point_9, point_10);
        wheel_bar_5.setAlignment(point_9, Pos.CENTER_LEFT);
        wheel_bar_5.setAlignment(point_10,Pos.CENTER_RIGHT);
        wheel_bar_5.setRotate(90);

        point_11.setRotate(180);
        wheel_bar_6.getChildren().addAll(point_11, point_12);
        wheel_bar_6.setAlignment(point_11, Pos.CENTER_LEFT);
        wheel_bar_6.setAlignment(point_12,Pos.CENTER_RIGHT);
        wheel_bar_6.setRotate(112.5);

        point_13.setRotate(180);
        wheel_bar_7.getChildren().addAll(point_13, point_14);
        wheel_bar_7.setAlignment(point_13, Pos.CENTER_LEFT);
        wheel_bar_7.setAlignment(point_14,Pos.CENTER_RIGHT);
        wheel_bar_7.setRotate(135);

        point_15.setRotate(180);
        wheel_bar_8.getChildren().addAll(point_15, point_16);
        wheel_bar_8.setAlignment(point_15, Pos.CENTER_LEFT);
        wheel_bar_8.setAlignment(point_16,Pos.CENTER_RIGHT);
        wheel_bar_8.setRotate(157.5);

        wheel_points.getChildren().addAll(wheel_bar_1, wheel_bar_2, wheel_bar_3, wheel_bar_4, wheel_bar_5, wheel_bar_6, wheel_bar_7, wheel_bar_8);

        String cartoon1_path = new File("src/wheel_of_nostalgy/Media/cartoon1.mp4").getAbsolutePath();
        cartoon1 = new Media(new File(cartoon1_path).toURI().toString());
        String cartoon2_path = new File("src/wheel_of_nostalgy/Media/cartoon2.mp4").getAbsolutePath();
        cartoon2 = new Media(new File(cartoon2_path).toURI().toString());
        String cartoon3_path = new File("src/wheel_of_nostalgy/Media/cartoon3.mp4").getAbsolutePath();
        cartoon3 = new Media(new File(cartoon3_path).toURI().toString());
        String cartoon4_path = new File("src/wheel_of_nostalgy/Media/cartoon4.mp4").getAbsolutePath();
        cartoon4 = new Media(new File(cartoon4_path).toURI().toString());
        String cartoon5_path = new File("src/wheel_of_nostalgy/Media/cartoon5.mp4").getAbsolutePath();
        cartoon5 = new Media(new File(cartoon5_path).toURI().toString());
        String cartoon6_path = new File("src/wheel_of_nostalgy/Media/cartoon6.mp4").getAbsolutePath();
        cartoon6 = new Media(new File(cartoon6_path).toURI().toString());
        String cartoon7_path = new File("src/wheel_of_nostalgy/Media/cartoon7.mp4").getAbsolutePath();
        cartoon7 = new Media(new File(cartoon7_path).toURI().toString());
        String cartoon8_path = new File("src/wheel_of_nostalgy/Media/cartoon8.mp4").getAbsolutePath();
        cartoon8 = new Media(new File(cartoon8_path).toURI().toString());
        String cartoon9_path = new File("src/wheel_of_nostalgy/Media/cartoon9.mp4").getAbsolutePath();
        cartoon9 = new Media(new File(cartoon9_path).toURI().toString());
        String cartoon10_path = new File("src/wheel_of_nostalgy/Media/cartoon10.mp4").getAbsolutePath();
        cartoon10 = new Media(new File(cartoon10_path).toURI().toString());
        String cartoon11_path = new File("src/wheel_of_nostalgy/Media/cartoon11.mp4").getAbsolutePath();
        cartoon11 = new Media(new File(cartoon11_path).toURI().toString());
        String cartoon12_path = new File("src/wheel_of_nostalgy/Media/cartoon12.mp4").getAbsolutePath();
        cartoon12 = new Media(new File(cartoon12_path).toURI().toString());
        String cartoon13_path = new File("src/wheel_of_nostalgy/Media/cartoon13.mp4").getAbsolutePath();
        cartoon13 = new Media(new File(cartoon13_path).toURI().toString());

        ArrayList<Media> cartoons = new ArrayList<Media>();
        cartoons.add(cartoon1);
        cartoons.add(cartoon2);
        cartoons.add(cartoon3);
        cartoons.add(cartoon4);
        cartoons.add(cartoon5);
        cartoons.add(cartoon6);
        cartoons.add(cartoon7);
        cartoons.add(cartoon8);
        cartoons.add(cartoon9);
        cartoons.add(cartoon10);
        cartoons.add(cartoon11);
        cartoons.add(cartoon12);
        cartoons.add(cartoon13);

        mv.setPreserveRatio(true);
        mv.setFitWidth(310);
        mv.setFitHeight(310);
        mv.setX(851);
        mv.setY(412);
        mv.setRotate(0.5);

        info_bar.setHeight(500);
        info_bar.setWidth(750);
        info_bar.setArcHeight(50);
        info_bar.setArcWidth(50);
        info_bar.setX(265);
        info_bar.setY(-650);

        info_header.setLayoutX(470);
        info_header.setLayoutY(-620);

        info_text.setLayoutX(300);
        info_text.setLayoutY(-550);
        info_text.setMaxWidth(680);
        info_text.setWrapText(true);

        info_version.setLayoutX(15);
        info_version.setLayoutY(690);

        info_creator.setLayoutX(1070);
        info_creator.setLayoutY(690);

        info_dis_button.setLayoutX(540);
        info_dis_button.setLayoutY(-250);
        info_dis_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                info_button.setDisable(false);
                Duration info_duration = Duration.millis(1000);
                TranslateTransition info_header_toup = new TranslateTransition(info_duration, info_header);
                info_header_toup.setByX(0);
                info_header_toup.setByY(-750);
                info_header_toup.setAutoReverse(false);
                info_header_toup.setCycleCount(1);

                TranslateTransition info_bar_toup = new TranslateTransition(info_duration, info_bar);
                info_bar_toup.setByX(0);
                info_bar_toup.setByY(-750);
                info_bar_toup.setAutoReverse(false);
                info_bar_toup.setCycleCount(1);

                TranslateTransition info_dis_toup = new TranslateTransition(info_duration, info_dis_button);
                info_dis_toup.setByX(0);
                info_dis_toup.setByY(-750);
                info_dis_toup.setAutoReverse(false);
                info_dis_toup.setCycleCount(1);

                TranslateTransition info_text_toup = new TranslateTransition(info_duration, info_text);
                info_text_toup.setByX(0);
                info_text_toup.setByY(-750);
                info_text_toup.setAutoReverse(false);
                info_text_toup.setCycleCount(1);

                FadeTransition info_version_dis = new FadeTransition(info_duration, info_version);
                info_version_dis.setFromValue(1.0);
                info_version_dis.setToValue(0);
                info_version_dis.setAutoReverse(false);
                info_version_dis.setCycleCount(1);

                FadeTransition info_creator_dis = new FadeTransition(info_duration, info_creator);
                info_creator_dis.setFromValue(1.0);
                info_creator_dis.setToValue(0);
                info_creator_dis.setAutoReverse(false);
                info_creator_dis.setCycleCount(1);

                info_header_toup.play();
                info_bar_toup.play();
                info_dis_toup.play();
                info_text_toup.play();
                info_version_dis.play();
                info_creator_dis.play();
            }
        });

        info_button.setLayoutX(1180);
        info_button.setLayoutY(20);
        info_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                info_button.setDisable(true);
                Duration info_duration = Duration.millis(1000);
                TranslateTransition info_header_todown = new TranslateTransition(info_duration, info_header);
                info_header_todown.setByX(0);
                info_header_todown.setByY(750);
                info_header_todown.setAutoReverse(false);
                info_header_todown.setCycleCount(1);

                TranslateTransition info_bar_todown = new TranslateTransition(info_duration, info_bar);
                info_bar_todown.setByX(0);
                info_bar_todown.setByY(750);
                info_bar_todown.setAutoReverse(false);
                info_bar_todown.setCycleCount(1);

                TranslateTransition info_dis_todown = new TranslateTransition(info_duration, info_dis_button);
                info_dis_todown.setByX(0);
                info_dis_todown.setByY(750);
                info_dis_todown.setAutoReverse(false);
                info_dis_todown.setCycleCount(1);

                TranslateTransition info_text_todown = new TranslateTransition(info_duration, info_text);
                info_text_todown.setByX(0);
                info_text_todown.setByY(750);
                info_text_todown.setAutoReverse(false);
                info_text_todown.setCycleCount(1);

                FadeTransition info_version_ap = new FadeTransition(info_duration, info_version);
                info_version_ap.setFromValue(0);
                info_version_ap.setToValue(1.0);
                info_version_ap.setAutoReverse(false);
                info_version_ap.setCycleCount(1);

                FadeTransition info_creator_ap = new FadeTransition(info_duration, info_creator);
                info_creator_ap.setFromValue(0);
                info_creator_ap.setToValue(1.0);
                info_creator_ap.setAutoReverse(false);
                info_creator_ap.setCycleCount(1);

                info_header_todown.play();
                info_bar_todown.play();
                info_dis_todown.play();
                info_text_todown.play();
                info_version_ap.play();
                info_creator_ap.play();
            }
        });

        spin_button.setLayoutX(500);
        spin_button.setLayoutY(500);
        spin_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                spin_button.setDisable(true);
                Collections.shuffle(series);
                point_1.setText(series.get(0));
                point_2.setText(series.get(1));
                point_3.setText(series.get(2));
                point_4.setText(series.get(3));
                point_5.setText(series.get(4));
                point_6.setText(series.get(5));
                point_7.setText(series.get(6));
                point_8.setText(series.get(7));
                point_9.setText(series.get(8));
                point_10.setText(series.get(9));
                point_11.setText(series.get(10));
                point_12.setText(series.get(11));
                point_13.setText(series.get(12));
                point_14.setText(series.get(13));
                point_15.setText(series.get(14));
                point_16.setText(series.get(15));

                Collections.shuffle(cartoons);
                mp = new MediaPlayer(cartoons.get(0));
                mv.setMediaPlayer(mp);
                mp.setVolume(0.1);
                mp.play();

                Duration wheel_duration = Duration.millis(30000);
                RotateTransition rotatePoints = new RotateTransition(wheel_duration, wheel_points);
                RotateTransition rotateWheel = new RotateTransition(wheel_duration, wheel_iv);
                rotatePoints.setByAngle(3000);
                rotateWheel.setByAngle(3000);
                rotatePoints.play();
                rotateWheel.play();

                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(31.2), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        spin_button.setDisable(false);
                    }
                }));
                timeline.play();
            }
        });
    }
}
