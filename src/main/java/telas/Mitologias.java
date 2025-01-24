package src.main.java.telas;

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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import src.main.java.TelaInicial;
import src.main.java.telas.persons.boitata.Boitata;
import src.main.java.telas.persons.curupira.Curipira;
import src.main.java.telas.persons.iara.Iara;
import src.main.java.telas.persons.saci.Saci;

public class Mitologias extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        String image = "src\\resources\\Imagens\\LogoJanela.jpg";
        primaryStage.getIcons().add(new Image(image));

        BorderPane folclore = new BorderPane();
        String background = "src/resources/Imagens/FlorestBackground.gif";
        folclore.setStyle("-fx-background-image: url('" + background + "');");

        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        Label tituloLabel = new Label("MITOLOGIAS BRASILEIRAS");
        tituloLabel.setId("titulo-label");
        folclore.setTop(tituloLabel);
        BorderPane.setAlignment(tituloLabel, Pos.CENTER);

        PersonsData PI = new PersonsData();//classe para imagem dos perosnagens

        // Curupira
        Image curupiraImage = new Image(PI.getCurupira());
        ImageView curupiraImageView = new ImageView(curupiraImage);
        curupiraImageView.setFitWidth(120);
        curupiraImageView.setFitHeight(120);
        curupiraImageView.setPreserveRatio(true);
        StackPane curupiraContainer = new StackPane();
        curupiraContainer.getChildren().add(curupiraImageView);
        curupiraContainer.setId("curupira-image");
        curupiraContainer.setPadding(new Insets(10));
        curupiraContainer.setOnMouseClicked(e -> {
            Curipira curipira = new Curipira();
            curipira.start(primaryStage);
        });
        grid.add(curupiraContainer, 0, 0);

        // src.main.java.telas.persons.saci.Saci
        Image saciImage = new Image(PI.getSaci());
        ImageView saciImageView = new ImageView(saciImage);
        saciImageView.setFitWidth(120);
        saciImageView.setFitHeight(120);
        saciImageView.setPreserveRatio(true);
        StackPane saciContainer = new StackPane();
        saciContainer.getChildren().add(saciImageView);
        saciContainer.setId("saci-image");
        saciContainer.setPadding(new Insets(10));
        saciContainer.setOnMouseClicked(e -> {
            Saci saci = new Saci();
            saci.start(primaryStage);
        });
        grid.add(saciContainer, 1, 0);

        // src.main.java.telas.persons.boitata.Boitata
        Image boitataImage = new Image(PI.getBoitata());
        ImageView boitataImageView = new ImageView(boitataImage);
        boitataImageView.setFitWidth(120);
        boitataImageView.setFitHeight(120);
        boitataImageView.setPreserveRatio(true);
        StackPane boitataContainer = new StackPane();
        boitataContainer.getChildren().add(boitataImageView);
        boitataContainer.setId("boitata-image");
        boitataContainer.setPadding(new Insets(10));
        boitataContainer.setOnMouseClicked(e -> {
            Boitata boitata = new Boitata();
            boitata.start(primaryStage);
        });
        grid.add(boitataContainer, 2, 0);

        // src.main.java.telas.persons.iara.Iara
        Image iaraImage = new Image(PI.getIara());
        ImageView iaraImageView = new ImageView(iaraImage);
        iaraImageView.setFitWidth(120);
        iaraImageView.setFitHeight(120);
        iaraImageView.setPreserveRatio(true);
        StackPane iaraContainer = new StackPane();
        iaraContainer.getChildren().add(iaraImageView);
        iaraContainer.setId("iara-image");
        iaraContainer.setPadding(new Insets(10));
        iaraContainer.setOnMouseClicked(e -> {
            Iara iara = new Iara();
            iara.start(primaryStage);
        });
        grid.add(iaraContainer, 3, 0);

        folclore.setCenter(grid);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");
        sair.setOnAction(e -> {
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.start(primaryStage);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(sair);

        HBox rodape = new HBox(10);
        rodape.setAlignment(Pos.CENTER);
        rodape.setPadding(new Insets(10));
        rodape.setId("rodape");

        Label rodapeLabel = new Label("By Matheus Ferreira");
        rodapeLabel.setId("rodape-label");

        folclore.setBottom(hBox);

        Scene scene = new Scene(folclore, 900, 540);
        scene.getStylesheets().add("src/resources/Styles/Mitologias.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}