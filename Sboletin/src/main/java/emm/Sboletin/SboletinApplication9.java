package emm.Sboletin;

import emm.Sboletin.servicio.Servicio9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SboletinApplication9 {

    public static void main(String[] args) {
        SpringApplication.run(SboletinApplication9.class, args);
    }

    @RestController
    public class OrdennumController {

        private final Servicio9 servicio9;

        @Autowired
        public OrdennumController(Servicio9 servicio9) {

            this.servicio9 = servicio9;
        }

        @GetMapping("/Ordendenumeros")
        public String comparanum(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
            return servicio9.Ordendenumeros(n1, n2);
        }
    }

}




