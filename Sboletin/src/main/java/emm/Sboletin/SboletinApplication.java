package emm.Sboletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SboletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication.class, args);
	}

	@RestController
	public class QuadraticEquationController {

		@GetMapping("/web")
		public String solveQuadraticEquation(
				@RequestParam("a") double a,
				@RequestParam("b") double b,
				@RequestParam("c") double c) {

			double x1, x2, d;
			// Calculamos el determinante
			d = ((b * b) - 4 * a * c);

			if (d < 0)
				return "No existen soluciones reales";
			else {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				return "Solución 1: " + x1 + ", Solución 2: " + x2;
			}
		}



		@PostMapping("/posman")
		public String solveQuadraticEquation(@RequestBody QuadraticEquationRequest request) {
			double a = request.getA();
			double b = request.getB();
			double c = request.getC();

			double x1, x2, d;

			// Calculamos el determinante
			d = ((b * b) - 4 * a * c);

			if (d < 0)
				return "No existen soluciones reales";
			else {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				return "Solución 1: " + x1 + ", Solución 2: " + x2;
			}
		}
	}
}