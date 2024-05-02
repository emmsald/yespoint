package matematicas.ejercicios.Controller;

import matematicas.ejercicios.Service.OperacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class OperacionesController {


    private final OperacionesService operacionesService;

    @Autowired
    public OperacionesController(OperacionesService circunferenciaService) {

        this.operacionesService = circunferenciaService;
    }
    @GetMapping("/Circunferencia")
    public String solveQuadraticEquation(
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("c") double c) {
        return operacionesService.EcuacionCircunferencia(a, b, c);
    }
    @GetMapping("/calcular-area")
    public String calcularArea(@RequestParam double radio) {
        return operacionesService.calcularArea(radio);
    }
    @GetMapping("/circunferencia2")
    public String calcularcircuferencia(@RequestParam("radio") double radio) {
        return operacionesService.calcularcircuferencia(radio);
    }
    @GetMapping("/comparacion")
    public String comparaciondenumeros(@RequestParam int n1, @RequestParam int n2) {
        return operacionesService.comparaciondenumeros(n1, n2);
    }
    @GetMapping("/comparacionpn")
    public String comparaciondenumeros(@RequestParam int num) {
        return operacionesService.comparaciondenumeros(num);
    }
    @GetMapping("/multiplos")
    public String verificarMultiplos1(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        return operacionesService.Comparamultiplos(n1, n2);
    }
    @GetMapping("/nmayor")
    public String Nummayor(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        return operacionesService.Comparanum(n1, n2);
    }
    @GetMapping("/comparanumeros")
    public String comparaNum(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        return operacionesService.compararNumeros(n1, n2);
    }
    @GetMapping("/Ordendenumeros")
    public String ordennum(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        return operacionesService.Ordendenumeros(n1, n2);
    }
    @GetMapping("/Ordendetresnumeros")
    public String ordennumeros(@RequestParam("a") int a, @RequestParam("b") int b,@RequestParam("c")int c) {
        return operacionesService.tresnumeros(a, b, c);
    }
    @GetMapping("/Cifrasnumeros")
    public String cifras(@RequestParam("num") int num) {
        return operacionesService.cifras(num);
    }
    @GetMapping("/Cifrasalreves")
    public String cifrasreves(@RequestParam("num") int num) {
        return operacionesService.cifras(num);
    }
}


