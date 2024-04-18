package emm.Sboletin;

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
	public class numerosmultiplo {

		@GetMapping("/multiplos")
		public String verificarMultiplos1(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
			if (n1 % n2 == 0)
				return "Son múltiplos";
			else
				return "No son múltiplos";
		}
	}
}








