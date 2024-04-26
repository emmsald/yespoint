package emm.Sboletin;

import emm.Sboletin.servicio.Servicio1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SboletinApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication1.class, args);
	}

	@RestController
	public class QuadraticEquationController {

		private final Servicio1 servicio1;

		@Autowired
		public QuadraticEquationController(Servicio1 servicio1) {

			this.servicio1 = servicio1;
		}

		@GetMapping("/web")
		public String solveQuadraticEquation(
				@RequestParam("a") double a,
				@RequestParam("b") double b,
				@RequestParam("c") double c) {
			return servicio1.solveQuadraticEquation(a, b, c);
		}

	}
}