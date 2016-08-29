package mx.azka.controlDeEquipos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name = "homeController")
@ApplicationScoped

public class HomeController {
    
    private final static String[] numero;

    
    static{
        numero = new String[10];
        numero[0] = "2";
        numero[1] = "3";
        numero[2] = "4";
        numero[3] = "5";
        numero[4] = "6";
        numero[5] = "7";
        numero[6] = "8";
        numero[7] = "9";
        numero[8] = "10";
        numero[9] = "11";
        
    }
    
    
}
