package emm.Sboletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SboletinApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication3.class, args);
	}

	@RestController
	public class CircunferenciaController {

		@GetMapping("/circunferencia")
		public String calcularcircuferencia(@RequestParam("radio") double radio) {
			double circunferencia = 2 * Math.PI * radio;
			return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;

		}


		@PostMapping("/circunferencia-2")
		public String calcularCircunferencia(@RequestParam("radio") double radio) {
			double circunferencia = 2 * Math.PI * radio;
			return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;
		}

	}
}

