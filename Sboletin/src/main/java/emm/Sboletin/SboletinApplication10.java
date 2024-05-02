package emm.Sboletin;

import emm.Sboletin.servicio.Servicio10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SboletinApplication10 {

    public static void main(String[] args) {
        SpringApplication.run(SboletinApplication10.class, args);
    }

    @RestController
    public class OrdennummayorController {

        private final Servicio10 servicio10;

        @Autowired
        public OrdennummayorController(Servicio10 servicio10) {

            this.servicio10 = servicio10;
        }

        @GetMapping("/Ordendetresnumeros")
        public String comparanum(@RequestParam("a") int a, @RequestParam("b") int b,@RequestParam("c")int c) {
            return servicio10.tresnumeros(a, b, c);
        }
    }

}




