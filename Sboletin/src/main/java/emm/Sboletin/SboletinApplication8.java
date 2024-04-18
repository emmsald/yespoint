package emm.Sboletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SboletinApplication8 {

	public static void main(String[] args) {
		SpringApplication.run(SboletinApplication8.class, args);
	}

	@RestController
	public class comparanum {

        @GetMapping("/comparanumeros")
        public String comparanum(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
            if (n1 == n2)
                return "Son iguales";
            else if (n1 > n2)
                return " n1 es mayor que n2 " ;
            else
                return "n2 es mayor que n1";
        }
    }
}








