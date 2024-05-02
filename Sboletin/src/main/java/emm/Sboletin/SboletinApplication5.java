package emm.Sboletin;


import emm.Sboletin.servicio.Servicio5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class SboletinApplication5 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication5.class, args);
	}

	@RestController
	public class numerosposneg {

		private final Servicio5 servicio5;

		@Autowired
		public numerosposneg(Servicio5 servicio5) {
			this.servicio5 = servicio5;
		}

		@GetMapping("/comparacionpn")
		public String comparaciondenumeros(@RequestParam int num) {
			return servicio5.comparaciondenumeros(num);

        }
	}
}







