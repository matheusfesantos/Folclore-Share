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

public class Iara extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        primaryStage.getIcons().add(new Image(getClass().getResource("/Imagens/LogoJanela.jpg").toExternalForm()));

        BorderPane folclore = new BorderPane();
        folclore.setStyle("-fx-background-image: url('file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/FlorestBackground.gif');" +
                "-fx-background-size: cover;");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);
        vbox.setId("VBOX");

        Label tituloLabel = new Label("IARA");
        tituloLabel.setId("titulo-label-iara");
        vbox.getChildren().addAll(tituloLabel);

        Image curupiraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Iara.png");
        ImageView curupiraImageView = new ImageView(curupiraImage);
        curupiraImageView.setFitWidth(100);
        curupiraImageView.setFitHeight(100);
        curupiraImageView.setPreserveRatio(true);

        StackPane curupiraContainer = new StackPane();
        curupiraContainer.getChildren().add(curupiraImageView);
        curupiraContainer.setId("iara-image");
        curupiraContainer.setPadding(new Insets(10));

        vbox.getChildren().addAll(curupiraContainer);

        Label historia = new Label(
                "A Iara, também conhecida como Mãe d'Água, é uma das mais encantadoras figuras do folclore brasileiro. Ela é uma\n" +
                        "serena e bela sereia que vive nas águas doces dos rios e lagos da Amazônia. Sua aparência é descrita como a de uma\n" +
                        "mulher de longos cabelos negros e olhos penetrantes, com metade do corpo humano e a outra metade de peixe. Iara é\n" +
                        "famosa por seu canto hipnotizante, que atrai os navegantes para as profundezas das águas. Aqueles que ouvem sua voz\n" +
                        "melodiosa não conseguem resistir ao seu encanto e acabam sendo levados para o fundo dos rios. Apesar de sua beleza\n" +
                        "e fascinação, a Iara pode ser perigosa para aqueles que se aproximam de seu território sem respeito. No entanto,\n" +
                        "algumas histórias contam que a Iara é uma protetora das águas e das criaturas que nela habitam, punindo aqueles\n" +
                        "que poluem ou ameaçam seu ambiente. Assim, ela é uma representação da força misteriosa da natureza e da importância\n" +
                        "de preservar os rios e as florestas do Brasil."
        );
        historia.setId("historia");
        vbox.getChildren().add(historia);

        folclore.setCenter(vbox);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");
        sair.setOnAction(e -> {
            Stage mitologiasStage = new Stage();
            Mitologias mitologias = new Mitologias();
            mitologias.start(mitologiasStage);
            primaryStage.close();
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(sair);

        folclore.setBottom(hBox);

        Scene scene = new Scene(folclore, 900, 540);
        scene.getStylesheets().add("/Styles/Historias.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}