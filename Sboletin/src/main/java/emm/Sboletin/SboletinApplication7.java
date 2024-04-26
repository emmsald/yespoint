package emm.Sboletin;

import emm.Sboletin.servicio.Servicio7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class SboletinApplication7 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication7.class, args);
	}

	@RestController
	public class numeromayor {

        private final Servicio7 servicio7;

        @Autowired
        public numeromayor(Servicio7 servicio7) {
            this.servicio7 = servicio7;
        }

        @GetMapping("/nmayor")
        public String Nummayor(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
            return servicio7.Comparanum(n1, n2);
        }
    }
}








