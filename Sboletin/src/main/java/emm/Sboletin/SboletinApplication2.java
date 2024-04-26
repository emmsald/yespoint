package emm.Sboletin;

import emm.Sboletin.servicio.Servicio2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SboletinApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication2.class, args);
	}

	@RestController
	public class CirculoController {
		private final Servicio2 servicio2;

		@Autowired
		public CirculoController(Servicio2 servicio2) {

			this.servicio2 = servicio2;
		}

		@GetMapping("/calcular-area")
		public String calcularArea(@RequestParam double radio) {
			return servicio2.calcularArea(radio);

		}
	}
}