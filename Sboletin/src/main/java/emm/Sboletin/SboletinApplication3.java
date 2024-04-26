package emm.Sboletin;

import emm.Sboletin.servicio.Servicio3;
import emm.Sboletin.servicio.Servicio8;
import org.springframework.beans.factory.annotation.Autowired;
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

		private final Servicio3 servicio3;

		@Autowired
		public CircunferenciaController(Servicio3 servicio3) {

			this.servicio3 = servicio3;
		}


			@GetMapping("/circunferencia")
			public String calcularcircuferencia ( @RequestParam("radio") double radio){
				double circunferencia = 2 * Math.PI * radio;
				return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;

			}


			@PostMapping("/circunferencia-2")
			public String calcularCircunferencia ( @RequestParam("radio") double radio){
				double circunferencia = 2 * Math.PI * radio;
				return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;
			}

		}
	}

