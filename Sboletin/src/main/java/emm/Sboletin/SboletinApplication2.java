package emm.Sboletin;

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

		@GetMapping("/calcular-area")
		public String calcularArea(@RequestParam double radio) {
			double area = Math.PI * (radio * radio);
			return "El área de una circunferencia de radio " + radio + " es: " + area;
		}
	}
}