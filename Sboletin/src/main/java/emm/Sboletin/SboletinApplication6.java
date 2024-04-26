package emm.Sboletin;

import emm.Sboletin.servicio.Servicio6;
import emm.Sboletin.servicio.Servicio8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SboletinApplication6 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication6.class, args);
	}

	@RestController
	public class Multiplos {

		private final Servicio6 servicio6;

		@Autowired
		public Multiplos(Servicio6 servicio6) {

			this.servicio6 = servicio6;
		}

		@GetMapping("/multiplos")
		public String verificarMultiplos1(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
			return servicio6.Comparamultiplos(n1, n2);
		}
	}
}








