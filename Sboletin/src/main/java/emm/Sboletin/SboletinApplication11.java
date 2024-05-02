package emm.Sboletin;


import emm.Sboletin.servicio.Servicio11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SboletinApplication11 {

    public static void main(String[] args) {
        SpringApplication.run(SboletinApplication11.class, args);
    }

    @RestController
    public class CifrasController {

        private final Servicio11 servicio11;

        @Autowired
        public CifrasController(Servicio11 servicio11) {

            this.servicio11 = servicio11;
        }

        @GetMapping("/Cifrasnumeros")
        public String comparanum(@RequestParam("num") int num) {
            return servicio11.cifras(num);
        }
    }

}




