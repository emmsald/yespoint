package emm.Sboletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class SboletinApplication5 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication5.class, args);
	}

	@RestController
	public class numerosposneg {

		@GetMapping("/comparacionpn")
		public String comparaciondenumeros(@RequestParam int num) {

			if (num < 0)
				return ("Negativo");
			else
				return ("Positivo");
        }
	}
}







