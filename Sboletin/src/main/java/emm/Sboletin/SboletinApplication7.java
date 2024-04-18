package emm.Sboletin;

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

        @GetMapping("/nmayor")
        public String verificarMultiplos1(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
            if(n1>n2)
                return " n1 es mayor  " ;
            else
                return " n2 es mayor  " ;
        }
    }
}








