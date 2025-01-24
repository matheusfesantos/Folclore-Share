package src.main.java;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import src.main.java.telas.Mitologias;
import src.main.java.telas.Sobre;

public class TelaInicial extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        String image = "src\\resources\\Imagens\\LogoJanela.jpg";
        primaryStage.getIcons().add(new Image(image));

        BorderPane folclore = new BorderPane();
        String background = "src/resources/Imagens/FlorestBackground.gif";
        folclore.setStyle("-fx-background-image: url('" + background + "');");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));

        Label tituloLabel = new Label("SEJA BEM VINDO(A)");
        tituloLabel.setId("titulo-label");
        vbox.getChildren().add(tituloLabel);

        Region space1 = new Region();
        space1.setPrefHeight(100);
        vbox.getChildren().add(space1);

        Button iniciar = new Button("INICIAR");
        iniciar.setId("iniciar-button");
        vbox.getChildren().add(iniciar);

        iniciar.setOnAction(e -> {
            Mitologias mitologias = new Mitologias();
            mitologias.start(primaryStage);
        });

        Button sobre = new Button("SOBRE NÓS");
        sobre.setId("sobre-button");
        vbox.getChildren().add(sobre);

        sobre.setOnAction(e -> {
            Sobre telasobre = new Sobre();
            telasobre.start(primaryStage);
        });

        folclore.setCenter(vbox);

        HBox rodape = new HBox(10);
        rodape.setAlignment(Pos.CENTER);
        rodape.setPadding(new Insets(10));
        rodape.setId("rodape");

        Label rodapeLabel = new Label("By Matheus Ferreira");
        rodapeLabel.setId("rodape-label");

        rodape.getChildren().addAll(rodapeLabel);
        folclore.setBottom(rodape);

        Scene mainScene = new Scene(folclore, 900, 540);
        mainScene.getStylesheets().add("src/resources/Styles/TelaInicial.css");

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}