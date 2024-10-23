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
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaInicial extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        primaryStage.getIcons().add(new Image(getClass().getResource("/Imagens/LogoJanela.jpg").toExternalForm()));

        BorderPane folclore = new BorderPane();
        folclore.setStyle("-fx-background-image: url('" + getClass().getResource("/Imagens/FlorestBackground.gif").toExternalForm() + "');" +
                "-fx-background-size: cover;");

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
            Stage mitologiasStage = new Stage();
            Mitologias mitologias = new Mitologias();
            mitologias.start(mitologiasStage);
            primaryStage.close();
        });

        Button sobre = new Button("SOBRE NÓS");
        sobre.setId("sobre-button");
        vbox.getChildren().add(sobre);

        sobre.setOnAction(e -> {
            Stage sobreStage = new Stage();
            Sobre telasobre = new Sobre();
            telasobre.start(sobreStage);
            primaryStage.close();
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
        mainScene.getStylesheets().add(getClass().getResource("/Styles/TelaInicial.css").toExternalForm());

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}