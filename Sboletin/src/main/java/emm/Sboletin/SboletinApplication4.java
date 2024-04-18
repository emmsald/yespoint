package emm.Sboletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class SboletinApplication4 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication4.class, args);
	}

	@RestController
	public class Comparanumeros {

		@GetMapping("/comparacion")
		public String comparaciondenumeros(@RequestParam int n1, @RequestParam int n2) {
			if (n1 == n2)
				return ("los numeros son iguales");
			else
				return ("los numeros no son iguales");
		}
		@PostMapping("/comparacion-2")
		public String comparaciondenumeros(@RequestBody Map<String, Integer> numeros) {

			   int n1 = numeros.get("n1");
			   int n2 = numeros.get("n2");
			if (n1 == n2)
				return ("los numeros son iguales");
			else
				return ("los numeros no son iguales");
		}
	}
}




