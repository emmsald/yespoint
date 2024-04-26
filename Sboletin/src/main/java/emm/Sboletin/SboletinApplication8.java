package emm.Sboletin;

import emm.Sboletin.servicio.Servicio8;
import org.springframework.beans.factory.annotation.Autowired;
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
    public class ComparanumController {

        private final Servicio8 servicio8;

        @Autowired
        public ComparanumController(Servicio8 servicio8) {

            this.servicio8 = servicio8;
        }

        @GetMapping("/comparanumeros")
        public String comparanum(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
            return servicio8.compararNumeros(n1, n2);
        }
    }

}




