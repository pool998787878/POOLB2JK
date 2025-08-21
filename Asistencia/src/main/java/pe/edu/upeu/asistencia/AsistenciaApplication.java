package pe.edu.upeu.asistencia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AsistenciaApplication extends Application {

<<<<<<< HEAD
	private ConfigurableApplicationContext applicationContext;
	private Parent parent;

	public static void main(String[] args) {



=======
	private ConfigurableApplicationContext configurableApplicationContext;
	private Parent parent;

	public static void main(String[] args) {
>>>>>>> 4e77263258ddf9e79187afcd7bb4df7a1803d2e5
		//SpringApplication.run(AsistenciaApplication.class, args);
		launch(args);
	}

<<<<<<< HEAD

	@Override
	public void init() throws Exception {
		//configurableApplicationContext=SpringApplication.run(SysPooApplication.class);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(AsistenciaApplication.class);
		builder.application().setWebApplicationType(WebApplicationType.NONE);


		applicationContext = builder.run(getParameters().getRaw().toArray(new String[0]));
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main_asistencia.fxml"));
		fxmlLoader.setControllerFactory(applicationContext::getBean);
		parent= fxmlLoader.load();
	}
	@Override
	public void start(Stage stage) throws Exception {
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getBounds();
		stage.setScene(new Scene(parent,bounds.getWidth(), bounds.getHeight()-
				80));
		stage.show();
		stage.setTitle("Spring Java-FX");
		stage.show();
	}
}

=======
	@Override
	public void init() throws Exception {
		//configurableApplicationContext= SpringApplication.run(SysPooApplication.class);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(AsistenciaApplication.class);
		builder.application().setWebApplicationType(WebApplicationType.NONE);
		configurableApplicationContext = builder.run(getParameters().getRaw().toArray(new String[0]));

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main_asistencia.fxml"));
		fxmlLoader.setControllerFactory(configurableApplicationContext::getBean);
		parent= fxmlLoader.load();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Screen screen = Screen.getPrimary();

		Rectangle2D bounds = screen.getBounds();
		stage.setScene(new Scene(parent,bounds.getWidth(), bounds.getHeight()-80));
		stage.setTitle("Spring Java-FX");
		stage.show();
	}

}
>>>>>>> 4e77263258ddf9e79187afcd7bb4df7a1803d2e5
