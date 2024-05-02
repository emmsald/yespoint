package emm.Sboletin;

import emm.Sboletin.servicio.Servicio4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@SpringBootApplication
public class SboletinApplication4 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication4.class, args);
	}

	@RestController
	public class Comparanumeros {

		private final Servicio4 servicio4;

		@Autowired
		public Comparanumeros(Servicio4 servicio4) {

			this.servicio4 = servicio4;
		}
			@GetMapping("/comparacion")
			public String comparaciondenumeros ( @RequestParam int n1, @RequestParam int n2){
				return servicio4.comparaciondenumeros(n1, n2);

			}
			@PostMapping("/comparacion-2")
			public String comparaciondenumeros (@RequestBody Map< String, Integer > numeros){
				int n1 = numeros.get("n1");
				int n2 = numeros.get("n2");
				return servicio4.comparaciondenumeros(n1, n2);

			}
		}
	}




