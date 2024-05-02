package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio9 {
    public String Ordendenumeros (int n1,int  n2){
        if(n1>n2)
            return (n1 + " y " + n2);
        else
            return (n2 + " y " + n1);
    }
}


