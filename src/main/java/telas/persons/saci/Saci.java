package src.main.java.telas.persons.saci;

import src.main.java.telas.persons.PersonsData;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import src.main.java.telas.Mitologias;

public class Saci extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        String image = "src\\resources\\Imagens\\LogoJanela.jpg";
        primaryStage.getIcons().add(new Image(image));

        BorderPane folclore = new BorderPane();
        String background = "src/resources/Imagens/FlorestBackground.gif";
        folclore.setStyle("-fx-background-image: url('" + background + "');");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);
        vbox.setId("VBOX");

        Label tituloLabel = new Label("SACI");
        tituloLabel.setId("titulo-label-saci");
        vbox.getChildren().addAll(tituloLabel);

        PersonsData PData = new PersonsData();

        Image curupiraImage = new Image(PData.getSaci());
        ImageView curupiraImageView = new ImageView(curupiraImage);
        curupiraImageView.setFitWidth(100);
        curupiraImageView.setFitHeight(100);
        curupiraImageView.setPreserveRatio(true);

        StackPane curupiraContainer = new StackPane();
        curupiraContainer.getChildren().add(curupiraImageView);
        curupiraContainer.setId("curupira-image");
        curupiraContainer.setPadding(new Insets(10));

        vbox.getChildren().addAll(curupiraContainer);

        Label historia = new Label(PData.getSaciSobre());
        historia.setId("historia");
        vbox.getChildren().add(historia);

        folclore.setCenter(vbox);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");
        sair.setOnAction(e -> {
            Mitologias mitologias = new Mitologias();
            mitologias.start(primaryStage);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(sair);

        folclore.setBottom(hBox);

        Scene scene = new Scene(folclore, 900, 540);
        scene.getStylesheets().add("src/resources/Styles/Historias.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}