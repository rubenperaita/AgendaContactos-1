package Modelo.dao;


import Modelo.javabean.Contacto;

import java.util.ArrayList;

public interface Contactodao {
    /**
     * creamos un contacto
     * @param contacto contacto que se creara
     * @return "true" si se crea sorrectamente, "false" si falla
     */
    boolean altaContacto(Contacto contacto);

    /**
     * eliminar contacto
     * @param contacto contacto que se eliminara
     * @return "true" si se elimina correctamente, "false" si no lo encuentra
     */
    boolean eliminarContacto(Contacto contacto);

    /**
     * Busca un contacto por su nombre
     * @param nombre el nombre que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    Contacto buscarUno(String nombre);
    /**
     * Busca un contacto por su telefono
     * @param telefono el telefono que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    Contacto buscarTelefono(String telefono);

    /**
     * Busca un contacto por su direccion de email
     * @param email el email que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    Contacto buscarEmail(String email);

    /**
     * busca una lista de contactos que estan en una misma empresa
     * @param empresa nombre de la empresa que va a buscar
     * @return todos los contactos que pertenecen a esa empresa o null
     */
    ArrayList<Contacto> contactosPorEmpresa(String empresa);
}