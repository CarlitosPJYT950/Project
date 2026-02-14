package pkgpublic;

import java.util.HashMap;
import java.util.Map;

public class Public {
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> empleados = new HashMap<>();
        
        empleados.put(1, "Juan");
        empleados.put(2, "Esteban");
        empleados.put(3, "Juan Esteban");
        empleados.put(4, "Ospina");
        empleados.put(5, "Moreno");
        empleados.put(6, "Ospina Moreno");
        
        boolean name = empleados.containsValue("Juliana");
        
        if(name == true){System.out.println("El valor buscado esta");}
        else{System.out.println("El valor buscado no esta");}
        
        boolean number = empleados.containsKey(3);
        
        if(number == true){System.out.println("El valor buscado esta");}
        else{System.out.println("El valor buscado no esta");}
        
        System.out.println(empleados.keySet());
        System.out.println(empleados.values());
    }
}