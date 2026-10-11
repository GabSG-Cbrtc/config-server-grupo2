package pe.edu.cibertec.configservergrupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGrupo2Application.class, args);
	}

}
