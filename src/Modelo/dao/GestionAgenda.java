package Modelo.dao;


import Modelo.javabean.Contacto;

import java.util.ArrayList;

public class GestionAgenda {
    private ArrayList<Contacto> lista;
    private String nombreAgenda;

    public GestionAgenda(String string, String nombreAgenda) {
        super();
        this.lista = new ArrayList<>();
        this.nombreAgenda = nombreAgenda;
    }
    /**
     * creamos un contacto
     * @param contacto contacto que se creara
     * @return "true" si se crea sorrectamente, "false" si falla
     */
    public boolean altaContacto(Contacto contacto) {
        if (lista.contains(contacto)) {
            return false;
        }
        lista.add(contacto);
        return true;
    }
    /**
     * eliminar contacto
     * @param contacto contacto que se eliminara
     * @return "true" si se elimina correctamente, "false" si no lo encuentra
     */
    public boolean eliminarContacto(Contacto contacto) {
        return lista.remove(contacto);
    }
    /**
     * Busca un contacto por su nombre
     * @param nombre el nombre que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    public Contacto buscarUno(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    /**
     * Busca un contacto por su telefono
     * @param telefono el telefono que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    public Contacto buscarTelefono(String telefono) {
        for (Contacto contacto : lista) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }
    /**
     * Busca un contacto por su direccion de email
     * @param email el email que va a buscar para encontrar a un contacto
     * @return muestra el contacto si existe, null si no existe
     */
    public Contacto buscarEmail(String email) {
        for (Contacto contacto : lista) {
            if (contacto.getEmail().equals(email)) {
                return contacto;
            }
        }
        return null;
    }

    /**
     * busca una lista de contactos que estan en una misma empresa
     * @param empresa nombre de la empresa que va a buscar
     * @return todos los contactos que pertenecen a esa empresa o null
     */
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> encontrados = new ArrayList<>();
        for (Contacto contacto : lista) {
            if (contacto.getEmpresa().equals(empresa)) {
                encontrados.add(contacto);
            }
        }
        return encontrados;
    }

}