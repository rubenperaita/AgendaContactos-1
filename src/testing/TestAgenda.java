package testing;

import Modelo.dao.GestionAgenda;
import Modelo.javabean.Contacto;

import java.util.ArrayList;

/**
 * Esta clase contiene las pruebas para la clase GestionAgenda
 */

public class TestAgenda {
    public static void main(String[] args) {
        GestionAgenda agenda = new GestionAgenda("", "Mis Bellacos");

        /**
         * prueba el metodo altaContacto
         */

        //Añadimos los contactos a la agenda
        agenda.altaContacto (new Contacto("Ana", "Zamora", "14874142", "ana@correo.com", "IFP"));
        agenda.altaContacto (new Contacto("Juan", "Duque", "42424242212", "Juan@correo.com", "GOOGLE"));
        agenda.altaContacto (new Contacto("Rodrigo", "Santos", "527673788", "Rodrigo@correo.com", "XIAOMI"));
        agenda.altaContacto (new Contacto("Pedro", "Gomez", "631486942164", "Pedro@correo.com", "DELL"));
        agenda.altaContacto (new Contacto("Lukas", "Puskas", "2047197591", "Lukas@correo.com", "DELL"));



        /**
         * prueba el metodo buscarUno
         */
        Contacto contactoEncontrado = agenda.buscarUno("Ana");
        System.out.println("Contacto encontado: "+contactoEncontrado);
        /**
         * prueba el metodo eliminarContacto
         */
        //eliminar contacto
        agenda.eliminarContacto (new Contacto("Ana", "123456789", "ana@correo.com", "aa", "aad"));
        contactoEncontrado = agenda.buscarUno("Ana");
        System.out.println(contactoEncontrado);
        /**
         * prueba el metodo buscarTelefono
         */
        //buscar contacto por su telefono
        Contacto contacto1 = agenda.buscarTelefono("42424242212");
        System.out.println(contacto1);
        /**
         * prueba el metodo buscarEmail
         */
        //buscar contacto por su email
        Contacto contacto2 = agenda.buscarEmail("Rodrigo@correo.com");
        System.out.println(contacto2);
        /**
         * prueba el metodo buscarPorEmpresa
         */
        //buscar contacto por su empresa
        ArrayList<Contacto> empresas = agenda.contactosPorEmpresa("DELL");
        for (Contacto contacto3: empresas ) {
            System.out.println(contacto3);}











    }
}