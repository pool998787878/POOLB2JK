package pe.edu.upeu.encapsulamiento;

public class clasegeneral {
    public static void main(String[] args) {
        Persona p = new Persona(); // p=objeto
        p.setNombre("Ronaldo");//encapsulamiento
        p.setEdad(20);//encapsulamiento
        p.setApellido("Tola");//no se esta aplicando encapsulamiento


        p.saludo();

        Trabajador t = new Trabajador();
        t.setNombre("pool");
        t.setEdad(20);
        t.setApellido("faijo");
        t.setArea("Sistemas");
        t.setGenero('M');
        System.out.println(t);


    }


}
