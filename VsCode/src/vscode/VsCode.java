package vscode;

import java.util.ArrayList;
import java.util.List;

public class VsCode {
    public static void main(String[] args) {
        // TODO code application logic here
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        Propietario prop = new Propietario();
        Propietario prop1 = new Propietario();
        prop1.setId(1L);
        prop1.setNombre("Juan");
        prop1.setApellido("Prada Ospina");
        Propietario prop2 = new Propietario();
        prop2.setId(2L);
        prop2.setNombre("Esteban");
        prop2.setApellido("Prada Ospina");
        Propietario prop3 = new Propietario();
        prop3.setId(3L);
        prop3.setNombre("Juan");
        prop3.setApellido("Ospina Moreno");
        Propietario prop4 = new Propietario();
        prop4.setId(4L);
        prop4.setNombre("Esteban");
        prop4.setApellido("Ospina Moreno");
        Propietario prop5 = new Propietario();
        prop5.setId(5L);
        prop5.setNombre("Juan Esteban");
        prop5.setApellido("Prada Ospina");
        Propietario prop6 = new Propietario();
        prop6.setId(6L);
        prop6.setNombre("Juan Esteban");
        prop6.setApellido("Ospina Moreno");
        
        Auto carro = new Auto();
        carro.setId(1L);
        carro.setMarca("Renault");
        carro.setModelo("Duster");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        carro.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + carro.getMarca() + " " + carro.getModelo() + 
                " tiene como propietarios a: " + carro.getListaPropietarios().toString());
    }
}