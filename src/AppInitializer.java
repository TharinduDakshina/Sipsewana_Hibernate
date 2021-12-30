
import entity.Programs;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;


import java.io.IOException;
import java.net.URL;

import static javafx.application.Application.launch;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("view/DashBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
}

    /*public static void main(String[] args) {
        Programs entity=new Programs();

        entity.setId("P-005");
        entity.setProgram("sdadad");
        entity.setDuration("sada");
        entity.setFee(63464);

        Session session = FactoryConfiguration.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }*/




/*
* hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
hibernate.connection.driver_class=com.mysql.cj.jdbc.Driver
hibernate.connection.url=jdbc:mysql://localhost:3306/sipsevana
hibernate.connection.username=root
hibernate.connection.password=1234
hibernate.show_sql=true
hibernate.hbm2ddl.auto=update*/